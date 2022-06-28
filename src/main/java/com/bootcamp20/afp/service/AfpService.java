package com.bootcamp20.afp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AfpService implements IAfpService{

    private final com.bootcamp20.afp.repository.AfpRepository afpRepository;

    private final com.bootcamp20.afp.mapper.AfpMapper afpMapper;

    @Override
    public List<com.bootcamp20.afp.model.AfpModel> findAll() throws Exception {
        List<com.bootcamp20.afp.domain.Afp> afps = afpRepository.findAll();
        return afpMapper.afpsToAfpModels(afps);
    }

    @Override
    public com.bootcamp20.afp.model.AfpModel create(com.bootcamp20.afp.model.AfpModel afpModel) throws Exception {
        com.bootcamp20.afp.domain.Afp afp = afpRepository.save(afpMapper.afpModelToAfp(afpModel));
        return afpMapper.afpToAfpModel(afp);
    }

    @Override
    public void update(Long id, com.bootcamp20.afp.model.AfpModel afpModel) throws Exception {
        Optional<com.bootcamp20.afp.domain.Afp> afpOptional = afpRepository.findById(id);

        if(afpOptional.isPresent()) {
            com.bootcamp20.afp.domain.Afp afpToUpdate = afpOptional.get();
            afpMapper.update(afpToUpdate, afpModel);
            afpRepository.save(afpToUpdate);
        }
        else throw new Exception("No se encontraron datos");
    }

    @Override
    public void deleteById(Long id) throws Exception {
        afpRepository.deleteById(id);
    }
}

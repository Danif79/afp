package com.bootcamp20.afp.service;

import java.util.List;

public interface IAfpService {

    List<com.bootcamp20.afp.model.AfpModel> findAll() throws Exception;

    com.bootcamp20.afp.model.AfpModel create(com.bootcamp20.afp.model.AfpModel afpModel) throws Exception;

    void update(Long id, com.bootcamp20.afp.model.AfpModel afpModel) throws Exception;

    void deleteById(Long id) throws Exception;
}

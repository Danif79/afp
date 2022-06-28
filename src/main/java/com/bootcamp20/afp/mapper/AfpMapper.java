package com.bootcamp20.afp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AfpMapper {

    com.bootcamp20.afp.domain.Afp afpModelToAfp (com.bootcamp20.afp.model.AfpModel model);

    com.bootcamp20.afp.model.AfpModel afpToAfpModel (com.bootcamp20.afp.domain.Afp afp);

    List<com.bootcamp20.afp.model.AfpModel> afpsToAfpModels(List<com.bootcamp20.afp.domain.Afp> afps);

    void update(@MappingTarget com.bootcamp20.afp.domain.Afp entity, com.bootcamp20.afp.model.AfpModel updateEntity);
}

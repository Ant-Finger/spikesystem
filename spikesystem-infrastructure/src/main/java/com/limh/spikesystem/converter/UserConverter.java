package com.limh.spikesystem.converter;

import com.limh.spikesystem.entity.UserPO;
import com.limh.spikesystem.user.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Limh
 * @date 2021/1/28
 */
@Mapper(componentModel = "spring")
public interface UserConverter {
    UserConverter instance = Mappers.getMapper(UserConverter.class);

    UserPO dto2Po(UserDTO userDTO);

    UserDTO po2Dto(UserPO userPO);
}

package com.limh.spikesystem.converter;

import com.limh.spikesystem.activity.dto.ActivityInfoDTO;
import com.limh.spikesystem.entity.ActivityInfoPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Date 2021/01/27 14:28
 * @author Limh
 *
 */
@Mapper(componentModel = "spring")
public interface ActivityInfoConverter {

    ActivityInfoConverter instance = Mappers.getMapper(ActivityInfoConverter.class);

    ActivityInfoPO dto2Po(ActivityInfoDTO activityInfoDTO);

    ActivityInfoDTO po2Dto(ActivityInfoPO activityInfoPO);

    List<ActivityInfoDTO> pos2Dtos(List<ActivityInfoPO> activityInfoPOs);


}

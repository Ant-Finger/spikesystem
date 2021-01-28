package com.limh.spikesystem.converter;

import com.limh.spikesystem.entity.OrderDetailPO;
import com.limh.spikesystem.entity.OrderPO;
import com.limh.spikesystem.order.dto.OrderDTO;
import com.limh.spikesystem.order.dto.OrderDetailDTO;
import org.mapstruct.factory.Mappers;

/**
 * @author Limh
 */
public interface OrderConverter {
    OrderConverter instance= Mappers.getMapper(OrderConverter.class);

    OrderPO dto2Po(OrderDTO orderDto);

    OrderDTO po2Dto(OrderPO orderPo);

    OrderDetailDTO po2Dto(OrderDetailPO orderDetailPo);

}

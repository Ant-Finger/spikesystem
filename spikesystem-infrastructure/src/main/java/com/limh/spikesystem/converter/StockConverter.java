package com.limh.spikesystem.converter;

import com.limh.spikesystem.entity.StockPO;
import com.limh.spikesystem.stock.dto.StockDTO;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Administrator
 */
public interface StockConverter {
    StockConverter instance = Mappers.getMapper(StockConverter.class);

    StockPO dto2Po(StockDTO stockDTO);

    StockDTO po2Dto(StockPO stockPO);

    List<StockDTO> pos2Dtos(List<StockPO> stockPO);
}

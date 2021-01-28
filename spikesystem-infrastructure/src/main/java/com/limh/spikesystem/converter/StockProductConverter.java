package com.limh.spikesystem.converter;

import com.limh.spikesystem.entity.StockProductPO;
import com.limh.spikesystem.stock.dto.StockProductDTO;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Limh
 */
public interface StockProductConverter {
    StockProductConverter instance = Mappers.getMapper(StockProductConverter.class);

    StockProductPO dto2Po(StockProductDTO stockProductDTO);

    StockProductDTO po2Dto(StockProductPO stockProductPo);

    List<StockProductDTO> pos2Dtos(List<StockProductPO> stockProductPOS);
}

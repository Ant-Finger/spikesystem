package com.limh.spikesystem.converter;

import com.limh.spikesystem.entity.ProductPO;
import com.limh.spikesystem.product.dto.ProductDTO;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Administrator
 */
public interface ProductConverter {
    ProductConverter instance = Mappers.getMapper(ProductConverter.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name")
    })
    ProductPO dto2Po(ProductDTO productDTO);

    ProductDTO po2Dto(ProductPO productPO);

    List<ProductPO> dtos2Pos(List<ProductDTO> productDTOs);

    List<ProductDTO> pos2Dtos(List<ProductPO> productPOs);
}

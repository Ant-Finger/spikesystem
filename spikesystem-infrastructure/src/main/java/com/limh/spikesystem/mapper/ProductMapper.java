package com.limh.spikesystem.mapper;


import com.limh.spikesystem.entity.ProductPO;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbg.generated
     */
    int insert(ProductPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbg.generated
     */
    int insertSelective(ProductPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbg.generated
     */
    ProductPO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProductPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProductPO record);
}
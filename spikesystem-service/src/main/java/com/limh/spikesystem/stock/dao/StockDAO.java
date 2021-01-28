package com.limh.spikesystem.stock.dao;
import com.limh.spikesystem.stock.dto.StockDTO;

public interface StockDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_stock
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_stock
     *
     * @mbg.generated
     */
    int insert(StockDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_stock
     *
     * @mbg.generated
     */
    int insertSelective(StockDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_stock
     *
     * @mbg.generated
     */
    StockDTO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_stock
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(StockDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_stock
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(StockDTO record);
}
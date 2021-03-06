package com.limh.spikesystem.stock.dto;

import java.io.Serializable;
import java.util.Date;

public class StockDTO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_StockDTO.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_StockDTO.product_id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_StockDTO.total_nums
     *
     * @mbg.generated
     */
    private Integer totalNums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_StockDTO.frozen_nums
     *
     * @mbg.generated
     */
    private Integer frozenNums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_StockDTO.active_nums
     *
     * @mbg.generated
     */
    private Integer activeNums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_StockDTO.deleted
     *
     * @mbg.generated
     */
    private Byte deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_StockDTO.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_StockDTO.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_StockDTO.id
     *
     * @return the value of tb_StockDTO.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    public StockDTO withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_StockDTO.id
     *
     * @param id the value for tb_StockDTO.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_StockDTO.product_id
     *
     * @return the value of tb_StockDTO.product_id
     *
     * @mbg.generated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    public StockDTO withProductId(Long productId) {
        this.setProductId(productId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_StockDTO.product_id
     *
     * @param productId the value for tb_StockDTO.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_StockDTO.total_nums
     *
     * @return the value of tb_StockDTO.total_nums
     *
     * @mbg.generated
     */
    public Integer getTotalNums() {
        return totalNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    public StockDTO withTotalNums(Integer totalNums) {
        this.setTotalNums(totalNums);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_StockDTO.total_nums
     *
     * @param totalNums the value for tb_StockDTO.total_nums
     *
     * @mbg.generated
     */
    public void setTotalNums(Integer totalNums) {
        this.totalNums = totalNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_StockDTO.frozen_nums
     *
     * @return the value of tb_StockDTO.frozen_nums
     *
     * @mbg.generated
     */
    public Integer getFrozenNums() {
        return frozenNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    public StockDTO withFrozenNums(Integer frozenNums) {
        this.setFrozenNums(frozenNums);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_StockDTO.frozen_nums
     *
     * @param frozenNums the value for tb_StockDTO.frozen_nums
     *
     * @mbg.generated
     */
    public void setFrozenNums(Integer frozenNums) {
        this.frozenNums = frozenNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_StockDTO.active_nums
     *
     * @return the value of tb_StockDTO.active_nums
     *
     * @mbg.generated
     */
    public Integer getActiveNums() {
        return activeNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    public StockDTO withActiveNums(Integer activeNums) {
        this.setActiveNums(activeNums);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_StockDTO.active_nums
     *
     * @param activeNums the value for tb_StockDTO.active_nums
     *
     * @mbg.generated
     */
    public void setActiveNums(Integer activeNums) {
        this.activeNums = activeNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_StockDTO.deleted
     *
     * @return the value of tb_StockDTO.deleted
     *
     * @mbg.generated
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    public StockDTO withDeleted(Byte deleted) {
        this.setDeleted(deleted);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_StockDTO.deleted
     *
     * @param deleted the value for tb_StockDTO.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_StockDTO.create_time
     *
     * @return the value of tb_StockDTO.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    public StockDTO withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_StockDTO.create_time
     *
     * @param createTime the value for tb_StockDTO.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_StockDTO.update_time
     *
     * @return the value of tb_StockDTO.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    public StockDTO withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_StockDTO.update_time
     *
     * @param updateTime the value for tb_StockDTO.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_StockDTO
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", totalNums=").append(totalNums);
        sb.append(", frozenNums=").append(frozenNums);
        sb.append(", activeNums=").append(activeNums);
        sb.append(", deleted=").append(deleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}
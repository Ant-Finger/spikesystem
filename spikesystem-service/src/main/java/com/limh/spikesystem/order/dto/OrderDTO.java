package com.limh.spikesystem.order.dto;

import java.io.Serializable;
import java.util.Date;

public class OrderDTO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_OrderDTO.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_OrderDTO.OrderDTO_no
     *
     * @mbg.generated
     */
    private String OrderDTONo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_OrderDTO.product_id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_OrderDTO.activity_id
     *
     * @mbg.generated
     */
    private String activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_OrderDTO.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_OrderDTO.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_OrderDTO.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_OrderDTO.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_OrderDTO.id
     *
     * @return the value of tb_OrderDTO.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    public OrderDTO withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_OrderDTO.id
     *
     * @param id the value for tb_OrderDTO.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_OrderDTO.OrderDTO_no
     *
     * @return the value of tb_OrderDTO.OrderDTO_no
     *
     * @mbg.generated
     */
    public String getOrderDTONo() {
        return OrderDTONo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    public OrderDTO withOrderDTONo(String OrderDTONo) {
        this.setOrderDTONo(OrderDTONo);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_OrderDTO.OrderDTO_no
     *
     * @param OrderDTONo the value for tb_OrderDTO.OrderDTO_no
     *
     * @mbg.generated
     */
    public void setOrderDTONo(String OrderDTONo) {
        this.OrderDTONo = OrderDTONo == null ? null : OrderDTONo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_OrderDTO.product_id
     *
     * @return the value of tb_OrderDTO.product_id
     *
     * @mbg.generated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    public OrderDTO withProductId(Long productId) {
        this.setProductId(productId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_OrderDTO.product_id
     *
     * @param productId the value for tb_OrderDTO.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_OrderDTO.activity_id
     *
     * @return the value of tb_OrderDTO.activity_id
     *
     * @mbg.generated
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    public OrderDTO withActivityId(String activityId) {
        this.setActivityId(activityId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_OrderDTO.activity_id
     *
     * @param activityId the value for tb_OrderDTO.activity_id
     *
     * @mbg.generated
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_OrderDTO.user_id
     *
     * @return the value of tb_OrderDTO.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    public OrderDTO withUserId(Long userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_OrderDTO.user_id
     *
     * @param userId the value for tb_OrderDTO.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_OrderDTO.status
     *
     * @return the value of tb_OrderDTO.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    public OrderDTO withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_OrderDTO.status
     *
     * @param status the value for tb_OrderDTO.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_OrderDTO.create_time
     *
     * @return the value of tb_OrderDTO.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    public OrderDTO withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_OrderDTO.create_time
     *
     * @param createTime the value for tb_OrderDTO.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_OrderDTO.update_time
     *
     * @return the value of tb_OrderDTO.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
     *
     * @mbg.generated
     */
    public OrderDTO withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_OrderDTO.update_time
     *
     * @param updateTime the value for tb_OrderDTO.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_OrderDTO
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
        sb.append(", OrderDTONo=").append(OrderDTONo);
        sb.append(", productId=").append(productId);
        sb.append(", activityId=").append(activityId);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}
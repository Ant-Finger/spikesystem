package com.limh.spikesystem.stock.dto;

/**
 * @author Limh
 * @date 2021/1/28
 */
public class StockProductDTO {
    private Long id;

    private Long productId;

    private String productName;

    private String remark;

    private Long totalNums;

    private Long frozenNums;

    private Long activeNums;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getTotalNums() {
        return totalNums;
    }

    public void setTotalNums(Long totalNums) {
        this.totalNums = totalNums;
    }

    public Long getFrozenNums() {
        return frozenNums;
    }

    public void setFrozenNums(Long frozenNums) {
        this.frozenNums = frozenNums;
    }

    public Long getActiveNums() {
        return activeNums;
    }

    public void setActiveNums(Long activeNums) {
        this.activeNums = activeNums;
    }
}

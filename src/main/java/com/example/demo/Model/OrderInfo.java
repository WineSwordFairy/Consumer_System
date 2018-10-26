package com.example.demo.Model;


import com.example.demo.Enm.OrderState;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class OrderInfo implements Serializable {

    private String orderId;
    private Integer productId;
    private Integer accountId;
    private Integer state;
    private Date createDate;
    private Date updateDate;
    private BigDecimal payment;
    private String remark;
    private Integer count;

    public OrderInfo() {
    }

    public OrderInfo(String orderId, Integer productId, Integer accountId, Integer state, Timestamp createDate, Timestamp updateDate, BigDecimal payment, String remark, Integer count) {
        this.orderId = orderId;
        this.productId = productId;
        this.accountId = accountId;
        this.state = state;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.payment = payment;
        this.remark = remark;
        this.count = count;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = Integer.valueOf(state.ordinal());
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", accountId=" + accountId +
                ", state=" + state +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", payment=" + payment +
                ", remark='" + remark + '\'' +
                '}';
    }
}

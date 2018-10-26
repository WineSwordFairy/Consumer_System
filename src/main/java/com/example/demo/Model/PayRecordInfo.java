package com.example.demo.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class PayRecordInfo implements Serializable {
    private Integer id;
    private Integer accountId;
    private BigDecimal AmountOfPayment;
    private String remark;
    private Date createDate;

    public PayRecordInfo() {
    }

    public PayRecordInfo(Integer id, Integer accountId, BigDecimal amountOfPayment, String remark, Date createDate) {
        this.id = id;
        this.accountId = accountId;
        AmountOfPayment = amountOfPayment;
        this.remark = remark;
        this.createDate = createDate;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmountOfPayment() {
        return AmountOfPayment;
    }

    public void setAmountOfPayment(BigDecimal amountOfPayment) {
        AmountOfPayment = amountOfPayment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

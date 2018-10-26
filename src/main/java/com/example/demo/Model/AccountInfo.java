package com.example.demo.Model;

import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;

public class AccountInfo implements Serializable {

    private Integer id;
    private String userName;
    private String password;
    private String name;
    private String email;
    private String remark;
    private Date createDate;
    private Integer provinceId;
    private Integer cityId;
    private Integer role;



    public AccountInfo() {
    }

    public AccountInfo(Integer id, String userName, String password, String name, String email, String remark,
                       Date createDate, Integer provinceId, Integer cityId, Integer role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.email = email;
        this.remark = remark;
        this.createDate = createDate;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}

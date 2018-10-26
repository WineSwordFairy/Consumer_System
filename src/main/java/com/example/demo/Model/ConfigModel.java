package com.example.demo.Model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class ConfigModel {

    private String OrderSystem_Url;
    private String UserSystem_Url;
    private String ProductSystem_Url;

    public String getProductSystem_Url() {
        return ProductSystem_Url;
    }

    public void setProductSystem_Url(String productSystem_Url) {
        ProductSystem_Url = productSystem_Url;
    }


    public String getUserSystem_Url() {
        return UserSystem_Url;
    }

    public void setUserSystem_Url(String userSystem_Url) {
        UserSystem_Url = userSystem_Url;
    }

    public String getOrderSystem_Url() {
        return OrderSystem_Url;
    }

    public void setOrderSystem_Url(String orderSystem_Url) {
        OrderSystem_Url = orderSystem_Url;
    }
}

package com.example.demo.Controller;


import com.example.demo.DataFormat.ResponseInfo;
import com.example.demo.DataTools.ConvertTool;
import com.example.demo.HttpTools.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopIndexProductController {

    //url
    private static String url = "http://localhost:8089/ShopIndexProduct";
    private static String param = "sort=1";

    @RequestMapping("/ShopIndexProduct")
    public String index() {
        ///调用 商品系统的接口，获取首页商品数据。
        String resultData = HttpRequest.sendGet(url, param);
        return resultData;
    }
}

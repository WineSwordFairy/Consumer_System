package com.example.demo.DataTools;

import com.example.demo.DataFormat.ResponseInfo;

import com.example.demo.Model.AccountInfo;
import com.example.demo.Model.OrderInfo;
import com.example.demo.Model.PayRecordInfo;
import net.sf.json.JSONArray;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Component;
import net.sf.json.JSONObject;


@Component
public class ConvertTool {

    ///结果序列化。
//    public static String SerializeObject(ResponseInfo data) {
//        return JSONArray.fromObject(data).toString();
//    }

    ///结果序列化。
    public static String SerializeObject(Object data) {
        JSONObject json = JSONObject.fromObject(data);
        return json.toString();
    }

//    ///序列化业务对象。
//    public static String SerializeInfo(Object Info) {
//        JSONObject json = JSONObject.fromObject(Info);
//        return json.toString();
//    }


    ///序列反化结果。
    public static ResponseInfo DeserializeObject(String data) {
        JSONObject jsonObject = JSONObject.fromObject(data);
        ResponseInfo responseInfo = (ResponseInfo) JSONObject.toBean(jsonObject, ResponseInfo.class);
        return responseInfo;
    }

    ///序列AccountInfo。
    public static AccountInfo DeserializeAccountInfo(String data) {
        JSONObject jsonObject = JSONObject.fromObject(data);
        AccountInfo info = (AccountInfo) JSONObject.toBean(jsonObject, AccountInfo.class);
        return info;
    }

    ///序列AccountInfo。
    public static OrderInfo DeserializeOrderInfo(String data) {
        JSONObject jsonObject = JSONObject.fromObject(data);
        OrderInfo info = (OrderInfo) JSONObject.toBean(jsonObject, OrderInfo.class);
        return info;
    }

    ///序列 payRecordInfo。
    public static PayRecordInfo DeserializePayRecordInfo(String data) {
        JSONObject jsonObject = JSONObject.fromObject(data);
        PayRecordInfo info = (PayRecordInfo) JSONObject.toBean(jsonObject, PayRecordInfo.class);
        return info;
    }

}

package com.example.demo.DataTools;

import com.example.demo.DataFormat.ResponseInfo;

import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Component;
import net.sf.json.JSONObject;


@Component
public class ConvertTool {

    public static ResponseInfo ConvertResponseData(String data) {
        JSONObject jsonobject = JSONObject.fromObject(data);
        ResponseInfo responseInfo = (ResponseInfo) JSONObject.toBean(jsonobject, ResponseInfo.class);
        return responseInfo;
    }


}

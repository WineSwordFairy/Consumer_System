package com.example.demo.DataTools;

import com.example.demo.DataFormat.ResponseInfo;

import net.sf.json.JSONArray;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Component;
import net.sf.json.JSONObject;


@Component
public class ConvertTool {

    ///结果序列化。
    public static String SerializeObject(ResponseInfo data) {
        return JSONArray.fromObject(data).toString();
    }

    ///序列反化结果。
    public static ResponseInfo DeserializeObject(String data) {
        JSONObject jsonObject = JSONObject.fromObject(data);
        ResponseInfo responseInfo = (ResponseInfo) JSONObject.toBean(jsonObject, ResponseInfo.class);
        return responseInfo;
    }


}

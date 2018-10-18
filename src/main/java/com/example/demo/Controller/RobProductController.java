package com.example.demo.Controller;

import com.example.demo.DataFormat.ResponseInfo;
import com.example.demo.DataTools.ConvertTool;
import com.example.demo.HttpTools.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobProductController {
    ///减商品库存接口地址。
    private String lessProductCountUrl = "http://localhost:8089/BuyProductByRedis";
    private String lessProductCountUrlParam = "accountId=257030&productId=536563&count=1";

    ///下订单接口地址。
    private String createOrderUrl = "http://localhost:8085/CreateOrder";
    private String createOrderUrlParam = "productId=536563&accountId=257030&remark=mark&count=2";

    @RequestMapping("/RobProduct")
    public String Index() {

        ///CallInterface,减商品库存。
        String lessProductResult = HttpRequest.sendGet(lessProductCountUrl, lessProductCountUrlParam);
        ///CallResult
        ResponseInfo lessProductResponseInfo = ConvertTool.DeserializeObject(lessProductResult);
        ///插入订单到DB。
        if (lessProductResponseInfo.getCode() == 0) {///减库存成功。
            ///CallInterface,插入订单。
            String createOrderResult = HttpRequest.sendGet(createOrderUrl, createOrderUrlParam);
            ///CallResult
            ResponseInfo createOrderResponseInfo = ConvertTool.DeserializeObject(createOrderResult);

            if (createOrderResponseInfo.getCode() == 0) {///下单成功。

                return ConvertTool.SerializeObject(new ResponseInfo(0, "下单成功。"));

            } else {///下单失败，回滚减库存操作。

                return ConvertTool.SerializeObject(new ResponseInfo(-1, createOrderResponseInfo.getMessage()));

            }
        } else {///扣库存失败。

            return ConvertTool.SerializeObject(new ResponseInfo(-1, lessProductResponseInfo.getMessage()));

        }
    }
}

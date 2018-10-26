package com.example.demo.Controller;


import com.example.demo.DataFormat.ResponseInfo;
import com.example.demo.DataTools.ConvertTool;
import com.example.demo.HttpTools.HttpRequest;
import com.example.demo.Model.AccountInfo;
import com.example.demo.Model.ConfigModel;
import com.example.demo.Model.OrderInfo;
import com.example.demo.Model.PayRecordInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigModel.class})
public class BuyProductAndPayController {

    ///账号验证。
    @Autowired
    private ConfigModel configModel;

    @RequestMapping("/BuyProductAndPay")
    public String Index(String userName, String password, String payPassword,
                        int productId, int count, String remark) {

        try {
            ///验证。
            String urlValidate = "AccountValidate";
            String urlValidateParam = String.format("userName=%s&password=%s", userName, password);
            ///下订单
            String urlCreateOrder = "CreateOrder";

            ///支付
            String urlPayment = "Payment";
            String urlPaymentParam = String.format("accountName=%s&password=%s", userName, password);
            ///减库存。
            String urlLessProductStock = "LessProductStock";
            ///修改订单状态。
            String urlModifyOrderState = "ModifyOrderState";

            ///账户密码验证。
            ResponseInfo validateResultInfo = ConvertTool.DeserializeObject(HttpRequest.sendPost(configModel.getUserSystem_Url() + urlValidate, urlValidateParam));
            if (validateResultInfo.getCode() != 0)
                return ConvertTool.SerializeObject(new ResponseInfo(-1, validateResultInfo.getMessage()));
            //注入实体。
            AccountInfo accountInfo = ConvertTool.DeserializeAccountInfo(validateResultInfo.getMessage());

            ///下订单。
            String urlCreateOrderParam = String.format("productId=%d&accountId=%d&remark=%s&count=%d",
                    productId, accountInfo.getId(), remark, count);
            ResponseInfo CreateOrderResultInfo = ConvertTool.DeserializeObject(HttpRequest.sendPost(configModel.getOrderSystem_Url() + urlCreateOrder, urlCreateOrderParam));
            if (CreateOrderResultInfo.getCode() != 0)
                return ConvertTool.SerializeObject(new ResponseInfo(-1, CreateOrderResultInfo.getMessage()));
            //注入订单实体。
            OrderInfo orderInfo = ConvertTool.DeserializeOrderInfo(CreateOrderResultInfo.getMessage());

            ///支付。
            String urlPayParam = String.format("accountId=%d&payPassword=%s&amountOfPayment=%f&remark=%s",
                    accountInfo.getId(), payPassword, orderInfo.getPayment(), remark);
            ResponseInfo payResultInfo = ConvertTool.DeserializeObject(HttpRequest.sendPost(configModel.getUserSystem_Url() + urlPayment, urlPayParam));
            if (payResultInfo.getCode() != 0)
                return ConvertTool.SerializeObject(new ResponseInfo(-1, payResultInfo.getMessage()));
            //支付凭证。
            PayRecordInfo payRecordInfo = ConvertTool.DeserializePayRecordInfo(payResultInfo.getMessage());

            //减库存。
            String urlLessProductStockParam = String.format("accountId=%d&productId=%d&count=%d&remark=%s", accountInfo.getId(), productId, count, remark);
            ResponseInfo lessProductStockResultInfo = ConvertTool.DeserializeObject(HttpRequest.sendPost(configModel.getProductSystem_Url() + urlLessProductStock, urlLessProductStockParam));
            if (lessProductStockResultInfo.getCode() != 0)
                return ConvertTool.SerializeObject(new ResponseInfo(-1, lessProductStockResultInfo.getMessage()));

            ///修改订单状态。
            String urlModifyOrderStateParam = String.format("orderId=%s&state=%d", orderInfo.getOrderId(), 1);
            ResponseInfo modifyOrderStateResultInfo = ConvertTool.DeserializeObject(HttpRequest.sendPost(configModel.getOrderSystem_Url() + urlModifyOrderState, urlModifyOrderStateParam));
            if (modifyOrderStateResultInfo.getCode() != 0) return modifyOrderStateResultInfo.getMessage();
            //响应。
            String test = ConvertTool.SerializeObject(orderInfo);

            return ConvertTool.SerializeObject(new ResponseInfo(0, ConvertTool.SerializeObject(orderInfo)));
        } catch (Exception ex) {
            ///TODO
            return ConvertTool.SerializeObject(new ResponseInfo(0, ex.getMessage()));
        } finally {
            ///TODO
        }
    }
}

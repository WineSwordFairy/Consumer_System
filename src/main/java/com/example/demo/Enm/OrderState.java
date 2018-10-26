package com.example.demo.Enm;

public enum OrderState {

    ///待付款
    WaitPay,
    ///已付款
    AlreadyPay,
    ///未发货
    WaitDeliveryGoods,
    ///已发货
    AlreadyDeliveryGoods,
    ///交易成功
    Success,
    ///交易关闭
    Close
}

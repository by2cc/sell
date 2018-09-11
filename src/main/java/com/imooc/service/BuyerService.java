package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/10 23:41
 * @Description:
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}

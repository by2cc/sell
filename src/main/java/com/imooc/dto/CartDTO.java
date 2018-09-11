package com.imooc.dto;

import lombok.Data;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 15:44
 * @Description:购物车
 */
@Data
public class CartDTO {

    /** 商品id */
    private String productId;

    /** 商品数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

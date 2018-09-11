package com.imooc.enums;

import lombok.Getter;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 14:19
 * @Description:
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新下单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消")
    ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

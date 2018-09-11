package com.imooc.enums;

import lombok.Getter;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 14:23
 * @Description:
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

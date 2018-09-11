package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 15:22
 * @Description:
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);

        this.code = code;
    }
}

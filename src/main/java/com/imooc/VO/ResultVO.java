package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 13:24
 * @Description:
 */
@Data
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;
}

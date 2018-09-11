package com.imooc.utils;

import java.util.Random;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 15:33
 * @Description:
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}

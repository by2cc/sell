package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 12:23
 * @Description:
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /** 名称 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 小图 */
    private String productIcon;

    /** 类目编号 */
    private Integer categoryType;

    /** 状态，0正常1下架 */
    private Integer productStatus;
}

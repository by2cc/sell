package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 14:14
 * @Description:
 */
@EntityListeners(AuditingEntityListener.class)
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** 订单id */
    @Id
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家手机号码 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态，默认为0新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态，默认为0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间 */
    @CreatedDate
    private Date createTime;

    /** 更新时间 */
    @LastModifiedDate
    private Date updateTime;
}

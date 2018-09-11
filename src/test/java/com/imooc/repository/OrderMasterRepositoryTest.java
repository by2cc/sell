package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 14:34
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    private final String OPENID = "110";
    @Test
    public void findByBuyerOpenid() {
//        OrderMaster result = orderMasterRepository.findByBuyerOpenid("1234", new PageRequest(1, 2));\
        PageRequest request = new PageRequest(1, 3);
        Page<OrderMaster> result = orderMasterRepository.findByBuyerOpenid(OPENID, request);
        Assert.assertNotEquals(0, result.getTotalElements());
    }

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("孙大圣的师傅");
        orderMaster.setBuyerPhone("12345678901");
        orderMaster.setBuyerAddress("高新区");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(2.5));

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);
    }
}
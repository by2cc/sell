package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: 孙大圣的师傅
 * @Date: 2018/9/9 14:58
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void findByOrOrderId() {
        List<OrderDetail> orderDetailList = orderDetailRepository.findByOrOrderId("111");
        Assert.assertNotEquals(0, orderDetailList.size());
    }

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234567891");
        orderDetail.setOrderId("111");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("111112");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductQuantity(1);
        orderDetail.setProductPrice(new BigDecimal(3.2));

        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(result);
    }
}
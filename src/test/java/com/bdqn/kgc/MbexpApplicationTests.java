package com.bdqn.kgc;

import com.bdqn.kgc.module.dto.OrderItems;
import com.bdqn.kgc.module.dto.Orders;
import com.bdqn.kgc.services.OrderService;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MbexpApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        List<OrderItems> oms=new ArrayList<>();
        oms.add(OrderItems.builder().shopid(1).buynum(3).build());
        oms.add(OrderItems.builder().shopid(2).buynum(4).build());
        oms.add(OrderItems.builder().shopid(3).buynum(7).build());

        Orders ord = Orders.builder().ordno("100").items(oms).build();
        orderService.saveOrder(ord);
    }

    @Test
    void test01(){
        System.out.println(orderService.findOrder(1));
    }
}

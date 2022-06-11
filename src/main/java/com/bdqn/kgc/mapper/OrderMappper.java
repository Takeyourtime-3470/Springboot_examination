package com.bdqn.kgc.mapper;

import com.bdqn.kgc.module.dto.OrderItems;
import com.bdqn.kgc.module.dto.Orders;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderMappper {

    void insertOrdedr(Orders orders);

    void insertOrderItems(List<OrderItems> items);

    Orders findeOrderById(int id);

    List<OrderItems> findOrderItemsByOrdid(int id);
}

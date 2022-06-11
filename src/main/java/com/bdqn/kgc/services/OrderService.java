package com.bdqn.kgc.services;

import com.bdqn.kgc.mapper.OrderMappper;
import com.bdqn.kgc.module.dto.OrderItems;
import com.bdqn.kgc.module.dto.Orders;
import org.ietf.jgss.Oid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author lxy
 * @Date 2022/6/11 10:21
 * @PackageName:com.bdqn.kgc.services
 * @ClassName: OrderService
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class OrderService {

    @Resource
    private OrderMappper orderMappper;

    @Transactional
    public void saveOrder(Orders orders){

        //获取用户订单项
        List<OrderItems> items=orders.getItems();

        //先保存用户订单 同时可以获取订单表生成的主键
        orderMappper.insertOrdedr(orders);

        //把获得的订单id填充到所有的订单项的外键列上
//        for (OrderItems item: items){
//            item.setOrdid(orders.getId());
//        }

        items.stream().forEach(item->item.setOrdid(orders.getId()));

        //再将所有订单事项保存
        orderMappper.insertOrderItems(items);
    }

    /**
     * 双表关联查询
     * @param id
     * @return
     */
    public Orders findOrder(int id){
        return orderMappper.findeOrderById(id);
    }
}

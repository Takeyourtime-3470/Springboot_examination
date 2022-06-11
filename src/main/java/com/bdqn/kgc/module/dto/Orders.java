package com.bdqn.kgc.module.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Author lxy
 * @Date 2022/6/11 10:16
 * @PackageName:com.bdqn.kgc.module.dto
 * @ClassName: Orders
 * @Description: TODO
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Orders {
    private int id;
    private String  ordno;
    private Date orddate;

    private List<OrderItems> items;
}

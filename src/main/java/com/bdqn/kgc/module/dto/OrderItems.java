package com.bdqn.kgc.module.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lxy
 * @Date 2022/6/11 10:19
 * @PackageName:com.bdqn.kgc.module.dto
 * @ClassName: OrderItems
 * @Description: TODO
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItems {
    private int id;
    private int shopid;
    private int ordid;
    private int buynum;
}

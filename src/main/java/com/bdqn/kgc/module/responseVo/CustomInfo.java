package com.bdqn.kgc.module.responseVo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lxy
 * @Date 2022/6/10 17:11
 * @PackageName:com.bdqn.kgc.module.responseVo
 * @ClassName: CustomInfo
 * @Description: TODO
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomInfo {
    private String code;
    private String msg;
    private Integer number;
    private Integer waitNumber;
    private String time;
    private String businessType;
    private String information;
}

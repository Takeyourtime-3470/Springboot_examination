package com.bdqn.kgc.module.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author lxy
 * @Date 2022/6/10 18:36
 * @PackageName:com.bdqn.kgc.module.dot
 * @ClassName: ServiceQueue
 * @Description: TODO
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceQueue {
    private int id;
    private int number;
    private Date date;
    private Date line_up_time;
    private String service_time_start;
    private String service_time_end;
    private int business_type;
    private String id_card;
    private String name;
    private int  service_status;
}

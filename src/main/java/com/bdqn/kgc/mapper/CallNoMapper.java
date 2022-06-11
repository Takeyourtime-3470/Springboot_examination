package com.bdqn.kgc.mapper;

import com.bdqn.kgc.module.dto.ServiceQueue;

/**
 * @Author lxy
 * @Date 2022/6/10 17:28
 * @PackageName:com.bdqn.kgc.mapper
 * @ClassName: CallNoMapper
 * @Description: TODO
 * @Version 1.0
 */

public interface CallNoMapper {

    //查询并返回今天是第几个
    int queryQueueNum();
    //查询前面还有多少人排队
    int moreQueueNum();

    //向数据库存放数据
    void insertCallNo(ServiceQueue serviceQueu);

    //根据用户反馈的id查询这张叫号单
    ServiceQueue queryCallNoById(int id);


}

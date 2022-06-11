package com.bdqn.kgc.services;

import com.bdqn.kgc.mapper.CallNoMapper;
import com.bdqn.kgc.module.dto.ServiceQueue;
import com.bdqn.kgc.module.responseVo.CustomInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

/**
 * @Author lxy
 * @Date 2022/6/10 19:33
 * @PackageName:com.bdqn.kgc.services
 * @ClassName: CallNoService
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class CallNoService {

    @Resource
    private CallNoMapper callNoMapper;
    /**
     * 叫号业务
     * @param businessType
     * @return
     */
    @Transactional
    public CustomInfo callNo(int businessType){
        //1、查询今日最新的编号
        int on = callNoMapper.queryQueueNum();

        //2、把新编号和用户操作存放到对象中
        ServiceQueue sq = ServiceQueue.builder()
                .number(on)
                .business_type(businessType)
                .service_status(1)
                .build();

        //3、把这个叫号单存放到数据库中
        callNoMapper.insertCallNo(sq);

        //再根据数据库的返回的 id查询这张单据
        ServiceQueue callNo = callNoMapper.queryCallNoById(sq.getId());

        //获取当天前面排队的人数
        int people_cnt=callNoMapper.moreQueueNum();

        //再将callNO转为前端的CustomInfo
        CustomInfo cf=null;
        if(callNo==null){
            cf=CustomInfo.builder()
                    .code("0001")
                    .information("操作失败!")
                    .build();
        }else {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            cf=CustomInfo.builder()
                    .code("0000")
                    .msg("获取叫号信息")
                    .number(callNo.getNumber())
                    .waitNumber(people_cnt)
                    .time(sdf.format(callNo.getLine_up_time()))
                    .businessType(""+businessType)
                    .information("操作成功！")
                    .build();
        }
        return cf;
    }
}

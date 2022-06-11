package com.bdqn.kgc.controller;

import com.bdqn.kgc.module.dto.ServiceQueue;
import com.bdqn.kgc.module.responseVo.CustomInfo;
import com.bdqn.kgc.services.CallNoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author lxy
 * @Date 2022/6/10 20:39
 * @PackageName:com.bdqn.kgc.controller
 * @ClassName: QueuCtrl
 * @Description: TODO
 * @Version 1.0
 */

@RestController
@RequestMapping("/api/queue")
public class QueuCtrl {
    @Resource
    private CallNoService callNoService;

    @RequestMapping(value = "/linedUp",method = RequestMethod.GET)
    public CustomInfo linedUp(Integer businessType){
        return callNoService.callNo(businessType);
    }
}

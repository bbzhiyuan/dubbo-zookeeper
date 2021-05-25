package com.kuang.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author zhangshuo
 * @version 1.0
 * @date 2021/5/25 18:57
 */
@Service
public class UserService {
    //引用pom坐标，路径相同的接口名
    @Reference
    TicketService ticketService;
    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println(ticket+"注册中心那的票");
    }
}

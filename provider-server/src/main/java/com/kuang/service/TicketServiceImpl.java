package com.kuang.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhangshuo
 * @version 1.0
 * @date 2021/5/25 18:55
 */
//zookeeper:服务注册与发现
@Component
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "张硕加油123456";
    }
}

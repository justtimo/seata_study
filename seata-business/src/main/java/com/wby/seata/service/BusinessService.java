package com.wby.seata.service;

import org.springframework.stereotype.Component;


public interface BusinessService {

    /**
     * 下单
     * @param username
     * @param id
     * @param count
     */
    void add(String username, int id, int count);
}
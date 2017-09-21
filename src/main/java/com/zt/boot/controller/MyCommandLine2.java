package com.zt.boot.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by zhoutao on 17/5/28.
 */
@Component
@Order(10)
public class MyCommandLine2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        if (strings.length>0) {
            System.out.println(strings[0]);
        }
    }
}

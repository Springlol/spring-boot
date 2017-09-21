package com.zt.boot.controller;

import com.zt.boot.configuration.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhoutao on 17/3/14.
 */
@RestController
public class ExampleController {
    @Autowired
    private DataSourceConfig dataSourceConfig;

    @RequestMapping("/home")
    public String  home(){
        System.out.println(dataSourceConfig.getUrl());
        System.out.println(dataSourceConfig.getDriver());
        System.out.println(dataSourceConfig.getPassword());
//        System.out.println(dataSourceConfig.getUser());

        return "hello world";
    }
}

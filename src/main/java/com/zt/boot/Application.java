package com.zt.boot;

import com.zt.boot.configuration.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by zhoutao on 17/5/28.
 */
@SpringBootApplication
public class Application {

    /*@Bean
    @ConfigurationProperties(prefix = "my")
    public DataSourceConfig dataSourceConfig(){
        return new DataSourceConfig();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

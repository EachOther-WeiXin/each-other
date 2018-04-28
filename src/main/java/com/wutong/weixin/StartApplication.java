package com.wutong.weixin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration(exclude={DataSourcePoolMetadataProvider.class})
@SpringBootApplication
@MapperScan("com.wutong.weixin.dao")
public class StartApplication  {



//    org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvider
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class);
    }
}

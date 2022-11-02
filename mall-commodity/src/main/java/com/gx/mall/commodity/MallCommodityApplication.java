package com.gx.mall.commodity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gx.mall.commodity.dao")
public class MallCommodityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCommodityApplication.class, args);
    }

}

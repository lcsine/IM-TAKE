package com.tang.tangchat.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zhongzb
 * @date 2021/05/27
 */
@SpringBootApplication(scanBasePackages = {"com.tang.tangchat"})
@MapperScan({"com.tang.tangchat.common.**.mapper"})
//@ServletComponentScan
public class TangchatCustomApplication {
    public static void main(String[] args) {
        SpringApplication.run(TangchatCustomApplication.class,args);
    }

}
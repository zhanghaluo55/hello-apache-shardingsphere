package com.hongpro.hello.apache.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: zhangzihong
 * @CreateTime: 2021/8/3
 * @Version:
 */
@SpringBootApplication
@MapperScan("com.hongpro.hello.apache.shardingsphere.mapper")
public class ShardingSphereApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereApplication.class, args);
    }
}

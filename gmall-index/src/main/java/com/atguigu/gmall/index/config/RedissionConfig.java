package com.atguigu.gmall.index.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Qiao
 * @Description
 * @Date Created in 20:39 2020/5/4
 * @Version 1.0
 */
@Configuration
public class RedissionConfig {
    @Bean
    public RedissonClient redissonClient(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.56.10:6379");
        return Redisson.create(config);
    }

}

package com.atguigu.gmall.index.annotation;

import java.lang.annotation.*;
/**
 * @Author: Qiao
 * @Description
 * @Date Created in 20:57 2020/5/4
 * @Version 1.0
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GmallCache {

    /**
     * 缓存key的前缀
     * @return
     */
    String prefix() default "";

    /**
     * 缓存的过期时间以分为单位
     * @return
     */
    int timeout() default 5;

    /**
     * 防止缓存雪崩指定的随机值范围
     * @return
     */
    int random() default 5;
}

package com.byteblogs.common.annotation;

import com.byteblogs.common.enums.OperateEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日志模块
 * 打印各个模块的运行日志的注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OperateLog {

    // 模块名
    String  module();
    
    // 操作编号
    OperateEnum code() default OperateEnum.GET_POSTS_DEFAULT;
}
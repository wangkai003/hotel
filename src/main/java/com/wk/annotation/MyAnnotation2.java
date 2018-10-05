package com.wk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @Title: MyAnnotation2
 * @描述:自定义的注释类
 * @author xwang
 * @date:2018年10月3日下午2:18:01
 */
@Target(value=ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {

	String value();
}

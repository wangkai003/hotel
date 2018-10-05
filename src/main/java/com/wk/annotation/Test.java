package com.wk.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 
 * @Title: Test
 * @描述:使用反射机制来处理注解
 * @author xwang
 * @date:2018年10月3日下午2:42:55
 */
public class Test {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.wk.annotation.Deno2");
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
		Field field = clazz.getDeclaredField("username");
		Setfield setfield = field.getAnnotation(Setfield.class);
		System.out.println(setfield.columnName()+"--"+setfield.type()+"--"+setfield.length());
		
	}
}

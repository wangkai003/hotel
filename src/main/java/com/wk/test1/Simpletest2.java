package com.wk.test1;

/**
 * 
 * @Title: Simpletest
 * @描述:单例模式
 * @author xwang
 * @date:2018年10月2日下午9:24:00
 */
public class Simpletest2 {
    
	
	private static Simpletest2 simpletest=null;
	
	private Simpletest2 () {
		super();
	}
	 
	/**
	 * 创建延迟加载的单例模式，懒汉式
	 * @return
	 * @描述 TODO
	 */
	public static Simpletest2 getSimpletest() {
		if (simpletest==null) {
			simpletest=new Simpletest2();
		}
		return simpletest;
	}
}

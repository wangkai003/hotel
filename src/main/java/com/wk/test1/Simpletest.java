package com.wk.test1;

/**
 * 
 * @Title: Simpletest
 * @描述:单例模式
 * @author xwang
 * @date:2018年10月2日下午9:24:00
 */
public final class Simpletest {
    
	
	private static Simpletest simpletest = new Simpletest();
	
	private Simpletest () {
		super();
	}
	 
	public static Simpletest getSimpletest() {
		return simpletest;
	}
}

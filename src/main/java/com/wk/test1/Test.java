package com.wk.test1;

import java.util.Date;

/**
 * 
 * @Title: Test
 * @描述:测试23种模式
 * @author xwang
 * @date:2018年10月2日下午9:40:13
 */
public class Test {

	public static void main(String[] args) throws Exception {
		
		/**
		 * 测试简单的单例
		 */
		/*Simpletest simpletest1,simpletest2 ;
		simpletest1 = Simpletest.getSimpletest();
		simpletest2 = Simpletest.getSimpletest();
		System.out.println(simpletest1);
		System.out.println(simpletest2);*/
		
		/*Simpletest2 simpletest2,simpletest22;
		simpletest2 = Simpletest2.getSimpletest();
		simpletest22 = Simpletest2.getSimpletest();
		System.out.println(simpletest2);
		System.out.println(simpletest22);*/
		
		/*Clone clone = new Clone("sheep",new Date(123));
		System.out.println(clone);
		Clone clone2 = (Clone) clone.clone();
		System.out.println(clone2);*/
		
		/**
		 * 测试静态代理对象
		 */
		propcy pr = new RealStar();
		propcy propcys = new DailiStar(pr);
		propcys.collectMoney();
		propcys.sing();
	}
}

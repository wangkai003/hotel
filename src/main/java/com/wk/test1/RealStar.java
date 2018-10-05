package com.wk.test1;

/**
 * 
 * @Title: RealStar
 * @描述:代理模式的真实对象
 * @author xwang
 * @date:2018年10月3日上午9:02:08
 */
public class RealStar implements propcy{

	@Override
	public void sing() {
		System.out.println("唱歌");
	}

	@Override
	public void collectMoney() {
		System.out.println("收钱");
	}
	

}

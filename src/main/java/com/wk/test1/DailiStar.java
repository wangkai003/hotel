package com.wk.test1;
/**
 * 
 * @Title: DailiStar
 * @描述:代理模式的代理对象
 * @author xwang
 * @date:2018年10月3日上午9:05:05
 */
public class DailiStar implements propcy{
    
	private propcy p;
	
	
	public DailiStar(propcy p) {
		super();
		this.p = p;
	}
    
	/**
	 * 代理对象不能够实现自身没有的功能。必须调用真实对象的所具备的功能来实现，比如歌星的代理人不能代替歌星来唱歌
	 */
	@Override
	public void sing() {
		p.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("代理收钱");
	}

}

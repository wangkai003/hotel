package com.wk.test1;

/**
 * 
 * @Title: Adapterrun
 * @描述:适配器本身
 * @author xwang
 * @date:2018年10月3日上午8:34:11
 */
public class Adapterrun extends Adapter implements Target{

	
	@Override
	public void handleReq() {
	   super.request();
	}
    
}

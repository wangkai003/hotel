package com.wk.test1;

/**
 * 
 * @Title: Client
 * @描述:客户端，相当于调用接口
 * @author xwang
 * @date:2018年10月3日上午8:28:04
 */
public class Client {
	
     public void test(Target t) {
    	 t.handleReq();
     }
     
     public static void main(String[] args) {
		 Client client = new Client();
		 //Adapter adapter = new Adapter();
		 Target target = new Adapterrun();
		 client.test(target);
	 }
}

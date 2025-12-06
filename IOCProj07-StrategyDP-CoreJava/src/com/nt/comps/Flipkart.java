//Flipkart.java  (target class)
package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	//HAS-A property
	private  ICourier  courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	//setter  method
	public void  setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	   //b.method
	public  String shopping(String [] items, double prices[]) {
		System.out.println("Flipkart.shopping()");
		//calculate bill amount
		double totalAmt=0.0;
		for(double p:prices) {
			totalAmt=totalAmt+p;
		}
		//generate the order id  (psuedo random number)
		Random rad=new Random();
		int oid=rad.nextInt(100000);
		//deliver the items using Courier
		String msg=courier.deliver(oid);
		//prepare the final  message
		String finalMsg=Arrays.toString(items)+" are purchased having prices "
		                               +Arrays.toString(prices)+" with Bill Amount::"+totalAmt+"...."+msg;
	  return finalMsg;	
		
	}
	

}

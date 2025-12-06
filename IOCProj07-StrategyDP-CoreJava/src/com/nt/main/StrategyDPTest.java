//StrategyDPTest.java  (main class/client app)
package com.nt.main;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		//get target class object using factory pattern
		Flipkart fpkt=FlipkartFactory.getInstance("bDart");
		//invoke the b.method
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser","Hat"}, 
				                                                    new  double[] {3000.0,5000.0, 1000.0});
		System.out.println(resultMsg);

	}

}

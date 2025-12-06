//FlipkartFactory.java
package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;

public class FlipkartFactory {
	
	//public static factory method  having factory pattern logic
	public  static   Flipkart   getInstance(String courierType) {
		//create  Dependent class obj (Courier class obj)
		  ICourier  courier=null;
		  if(courierType.equalsIgnoreCase("dtdc"))
			  courier=new DTDC();
		  else if(courierType.equalsIgnoreCase("bDart"))
			  courier=new BlueDart();
		  else if(courierType.equalsIgnoreCase("dhl"))
			  courier=new DHL();
		  else
			  throw  new IllegalArgumentException("Invalid Courier Type ");
		  
		  //create Target class object
		   Flipkart  fpkt=new Flipkart();
		   //assign Dependent class obj to target class object
		     fpkt.setCourier(courier);
		    return fpkt; 
	}

}

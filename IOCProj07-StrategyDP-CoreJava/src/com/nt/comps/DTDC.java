//DTDC.java (Dependent class)
package com.nt.comps;

public final class DTDC implements ICourier {
	
	public DTDC() {
		System.out.println("DTDC::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid+" order id order items are kept ready for delivery using  DTDC Courier Service";
	}

}

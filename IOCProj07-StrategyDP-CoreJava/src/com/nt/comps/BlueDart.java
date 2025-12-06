//BlueDart.java (Dependent class)
package com.nt.comps;

public final class BlueDart implements ICourier {
	
	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return oid+" order id order items are kept  ready for delivery using  BlueDart Courier Service";
	}

}

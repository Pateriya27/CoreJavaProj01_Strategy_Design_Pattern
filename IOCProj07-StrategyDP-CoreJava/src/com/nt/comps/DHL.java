//DHL.java (Dependent class)
package com.nt.comps;

public final class DHL implements ICourier {
	
	public DHL() {
		System.out.println("DHL::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return oid+" order id order items are kept ready for delivery using  DHL Courier Service";
	}

}

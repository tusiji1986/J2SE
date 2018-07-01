package com.tusiji.automic;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicIntegerThread implements Runnable{

	private static AtomicInteger acInt = new AtomicInteger(0);
	
	public static AtomicInteger getAcInt() {
		return acInt;
	}

	@Override
	public void run() {
		for (int i=0;i<1000;i++) {
			acInt.getAndIncrement();
		}
				
	}
}

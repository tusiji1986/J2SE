package com.tusiji.automic;


public class AutomicIntegerThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Thread a1 = new Thread(new AutomicIntegerThread());
		Thread a2 = new Thread(new AutomicIntegerThread());
		a1.start();
		a2.start();
		a1.join();
		a2.join();
		
		System.out.println(AutomicIntegerThread.getAcInt());
	}

}

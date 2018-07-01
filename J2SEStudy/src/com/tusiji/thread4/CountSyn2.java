package com.tusiji.thread4;

public class CountSyn2 {

	public static void main(String[] args) throws InterruptedException {
		CountSynThread2 countRunnable = new CountSynThread2();
		
		Thread thread1 = new Thread(countRunnable);
		Thread thread2 = new Thread(countRunnable);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println(countRunnable.getI());

	}

}

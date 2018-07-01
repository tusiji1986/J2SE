package com.tusiji.thread4;

public class CountSyn {

	public static void main(String[] args) throws InterruptedException {
		CountSynThread countRunnable = new CountSynThread();
		
		Thread thread1 = new Thread(countRunnable);
		Thread thread2 = new Thread(countRunnable);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println(countRunnable.getI());

	}

}

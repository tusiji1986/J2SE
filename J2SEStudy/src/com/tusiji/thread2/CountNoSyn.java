package com.tusiji.thread2;

public class CountNoSyn {

	public static void main(String[] args) throws InterruptedException {
		CountNoSynThread countRunnable = new CountNoSynThread();
		
		Thread thread1 = new Thread(countRunnable);
		Thread thread2 = new Thread(countRunnable);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println(CountNoSynThread.i);

	}

}

package com.tusiji.thread2;

public class CountSynDiffObject {

	public static void main(String[] args) throws InterruptedException {
		CountSynThread countRunnable1 = new CountSynThread();
		CountSynThread countRunnable2 = new CountSynThread();
		
		Thread thread1 = new Thread(countRunnable1);
		Thread thread2 = new Thread(countRunnable2);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println(CountSynThread.i);

	}

}

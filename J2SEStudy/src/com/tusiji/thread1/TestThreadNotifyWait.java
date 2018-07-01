package com.tusiji.thread1;

public class TestThreadNotifyWait {

	public static void main(String[] args) {
		Object  obj = new  Object();
		Thread thread1 = new Thread(new ThreadNotifyWait1(obj));
		Thread thread2 = new Thread(new ThreadNotifyWait2(obj));
		thread1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
		
	}

}

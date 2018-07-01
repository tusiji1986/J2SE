package com.tusiji.intlock;

import java.util.concurrent.locks.ReentrantLock;

public class IntLock implements Runnable{
	public static final ReentrantLock  lock1 = new ReentrantLock();
	public static final ReentrantLock  lock2 = new ReentrantLock();
	
	private int flag;
	
	
	public IntLock(int flag) {
		this.flag = flag;
	}


	@Override
	public void run() {
		try {
			if (flag == 1) {
				lock1.lock();
				System.out.println("flag1 lock1 begin");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lock2.lock();
				System.out.println("flag1 lock2 begin");
			} else {
				lock2.lock();
				System.out.println("flag2 lock2 begin");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lock1.lock();
				System.out.println("flag2 lock1 begin");
			}
		} finally {
			lock1.unlock();
			lock2.unlock();
		}
		
		
	}

}

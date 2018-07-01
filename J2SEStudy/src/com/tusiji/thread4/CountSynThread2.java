package com.tusiji.thread4;

import java.util.concurrent.locks.ReentrantLock;

public class CountSynThread2  implements Runnable{
	public static final ReentrantLock  lock1 = new ReentrantLock();
	public int i = 0;

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	public void increase() {
		i++;
	}

	@Override
	public void run() {
		for (int k=0;k<1000;k++) {
			lock1.lock();
				increase();
			lock1.unlock();
		}	
	}
}

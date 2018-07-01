package com.tusiji.intlock;

public class TestIntLock {

	public static void main(String[] args) {
		IntLock lock1 = new IntLock(1);
		IntLock lock2 = new IntLock(2);
		Thread t1 = new Thread(lock1);
		Thread t2 = new Thread(lock2);
		t1.start();
		t2.start();
	}

}

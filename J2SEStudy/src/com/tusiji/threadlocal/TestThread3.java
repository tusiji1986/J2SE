package com.tusiji.threadlocal;

public class TestThread3 {

	public static void main(String[] args) throws InterruptedException {
		TLManager2.setRequestParam(1);
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(100l);
					System.out.println("thread1 "+TLManager2.getRequestParam());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					TLManager2.removeRequestParam();
				}
			}
		});

		thread1.start();
		thread1.join();
		System.out.println("main thread "+TLManager2.getRequestParam());

		System.out.println("end");

	}

}

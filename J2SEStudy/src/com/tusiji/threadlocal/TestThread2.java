package com.tusiji.threadlocal;

public class TestThread2 {

	public static void main(String[] args) throws InterruptedException {
		TLManager.setRequestParam(1);
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(100l);
					System.out.println("thread1 "+TLManager.getRequestParam());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					TLManager.removeRequestParam();
				}
			}
		});



		thread1.start();
		thread1.join();
		System.out.println("main thread "+TLManager.getRequestParam());

		System.out.println("end");

	}

}

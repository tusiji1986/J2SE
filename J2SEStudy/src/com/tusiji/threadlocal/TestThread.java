package com.tusiji.threadlocal;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				TLManager.setRequestParam(1);
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
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				TLManager.setRequestParam(2);
				try {
					Thread.sleep(50l);
					System.out.println("thread2 "+TLManager.getRequestParam());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					TLManager.removeRequestParam();
				}
			}
		});

		thread1.start();
		thread2.start();

	}

}

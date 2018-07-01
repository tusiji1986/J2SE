package com.tusiji.thread1;

public class ThreadNotifyWait1 implements Runnable {
	
	private Object object;
	
	public ThreadNotifyWait1(Object object) {
		this.object = object;
	}

	@Override
	public void run() {
		synchronized(object) {
			System.out.println("ThreadNotifyWait1 开始执行");
			try {
				object.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadNotifyWait1 执行完毕");
		}
	}

}

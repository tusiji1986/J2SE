package com.tusiji.thread1;

public class ThreadNotifyWait2 implements Runnable{
	
	private Object object;
	
	
	public ThreadNotifyWait2(Object object) {
		this.object = object;
	}


	@Override
	public void run() {
		synchronized (object) {
			System.out.println("ThreadNotifyWait2  开始执行");
			object.notify();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadNotifyWait2 执行完毕");
		}
	}

}

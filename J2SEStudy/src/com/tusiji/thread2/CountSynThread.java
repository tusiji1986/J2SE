package com.tusiji.thread2;

public class CountSynThread  implements Runnable{
	public static int i = 0;

	public void increase() {
		i++;
	}

	@Override
	public void run() {
		for (int k=0;k<1000;k++) {
			synchronized (this) {
				increase();
			}
		}	
	}
}

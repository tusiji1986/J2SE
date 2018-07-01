package com.tusiji.thread4;

public class CountNoSynThread  implements Runnable{
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
			increase();
		}	
	}
}

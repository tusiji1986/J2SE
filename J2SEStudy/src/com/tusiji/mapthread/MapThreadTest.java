package com.tusiji.mapthread;

public class MapThreadTest {

	public static void main(String[] args) {
		Thread thread1;
		for (int i=0;i<100;i++) {
			thread1 = new Thread(new MapThread());
			thread1.start();
		}
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

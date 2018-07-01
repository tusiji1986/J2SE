package com.tusiji.thread7;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class TourTask implements Callable<String>{

	private CountDownLatch countDownLatch;

	public TourTask(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
	}

	@Override
	public String call() {
		System.out.println("in TourTask");
		try {
			Thread.sleep(1000);
			System.out.println("finish TourTask");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			countDownLatch.countDown();
		}

		return "get TourTask";
	}

}

package com.tusiji.thread7;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class ShoppingTask implements Callable<String>{
	private CountDownLatch countDownLatch;

	public ShoppingTask(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
	}

	@Override
	public String call() {
		System.out.println("in ShoppingTask");
		try {
			Thread.sleep(1000);
			System.out.println("finish ShoppingTask");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			countDownLatch.countDown();
		}

		return "get ShoppingTask";
	}

}

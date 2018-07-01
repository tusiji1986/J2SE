package com.tusiji.thread7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestMain {

	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(2);
		ShoppingTask shoppingTask = new ShoppingTask(cdl);
		TourTask tourTask = new TourTask(cdl);
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		List<Future<String>> list = new ArrayList<Future<String>>();
		list.add(es.submit(shoppingTask));
		list.add(es.submit(tourTask));
		
		boolean flag = true;
		try {
			flag = cdl.await(900, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		if (!flag) {
		   System.out.println("time out");
		   return;
		}
		
		
		System.out.println("1111");
		String result = "";
		for (Future<String> future : list) {
			try {
				result = future.get();
			} catch (InterruptedException e) {
				System.out.println("获取结果出现InterruptedException");
				result = "InterruptedException";
			} catch (ExecutionException e) {
				System.out.println("获取结果出现ExecutionException");
				result = "ExecutionException";
			} catch (CancellationException e) {
				System.out.println("获取结果出现CancellationException");
				result = "CancellationException";
			}
			System.out.println(result);
		}

	}

}

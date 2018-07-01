package com.tusiji.thread6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestMain {

	public static void main(String[] args) {
		HotelTask hotelTask = new HotelTask();
		TransportationTask tranTask = new TransportationTask();
		List<BaseTask> paramList = new ArrayList<BaseTask>();
		paramList.add(hotelTask);
		paramList.add(tranTask);
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		List<Future<Object>> list = new ArrayList<Future<Object>>();

		
		try {
			list = es.invokeAll(paramList, 900, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e1) {
			System.out.println("invokeall 失败");
		}
		String result = "";
		for (Future<Object> future : list) {
			try {
				result = (String)future.get();
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

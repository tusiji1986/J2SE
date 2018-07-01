package com.tusiji.thread5;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer>{

	@Override
	public Integer call()  {
		System.out.println(System.currentTimeMillis()+"  "+Thread.currentThread().getId() );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return 1;
	}

}

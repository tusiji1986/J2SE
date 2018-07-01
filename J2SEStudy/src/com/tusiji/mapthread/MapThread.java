package com.tusiji.mapthread;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapThread implements Runnable{
	
	private static Map<String,String> map = new HashMap<String,String>();

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i=0;i<1000;i++) {
			map.put(UUID.randomUUID().toString(),"11");
		}		
	}

}

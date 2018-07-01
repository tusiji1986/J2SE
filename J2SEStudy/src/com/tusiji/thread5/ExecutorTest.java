package com.tusiji.thread5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {
		/*
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i=0;i<10;i++){
			exec.submit(new MyTask());
		}
		
		exec.shutdown();*/
		
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i=0;i<10;i++){
			exec.submit(new MyTask());
		}
		
		exec.shutdown();
	}
}
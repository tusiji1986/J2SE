package com.tusiji.threadlocal;

public class TLManager {
	private static ThreadLocal<Integer> request = new ThreadLocal<Integer>();
	
	public static void setRequestParam(Integer param) {
		request.set(param);
	}
	
	public static Integer getRequestParam() {
		return request.get();
	}
	
	public static void removeRequestParam() {
		request.remove();
	}
}

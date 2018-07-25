package com.tusiji.threadlocal;

public class TLManager2 {
	private static InheritableThreadLocal<Integer> request = new InheritableThreadLocal<Integer>();
	
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

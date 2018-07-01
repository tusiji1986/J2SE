package com.tusiji.thread6;


public class TransportationTask extends BaseTask{

	@Override
	public String call() throws Exception {
		System.out.println("in TransportationInfo");
		Thread.sleep(1000);
		System.out.println("finish TransportationTask");
		return "get TransportationInfo";
	}

}

package com.tusiji.thread6;


public class HotelTask extends BaseTask{

	@Override
	public String call() throws Exception {
		System.out.println("in HotelInfo");
		Thread.sleep(1000);
		System.out.println("finish HotelTask");
		return "get HotelInfo";
	}

}

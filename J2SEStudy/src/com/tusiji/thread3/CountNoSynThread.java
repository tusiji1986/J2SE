package com.tusiji.thread3;

import java.util.ArrayList;
import java.util.List;

public class CountNoSynThread  implements Runnable{
	public List<Integer> arrayList =  new ArrayList<Integer>();

	/**
	 * @return the arrayList
	 */
	public List<Integer> getArrayList() {
		return arrayList;
	}

	@Override
	public void run() {
		for (int k=0;k<1000;k++) {
			arrayList.add(k);
		}	
	}
}

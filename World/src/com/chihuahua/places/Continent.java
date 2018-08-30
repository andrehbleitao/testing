package com.chihuahua.places;

import com.chihuahua.basic.interfaces.iPlace;
import com.chihuahua.data.SimpleData;

public class Continent implements iPlace {

	private SimpleData mData;

	
	
	
	
	public SimpleData getData() {
		return mData;
	}

	public void setData(SimpleData data) {
		this.mData = data;
	}
	
}

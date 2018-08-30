package com.chihuahua.basic;

import com.chihuahua.basic.interfaces.iPlace;
import com.chihuahua.data.PlaceData;

public abstract class Place implements iPlace {

	private PlaceData mPlaceData;

	public PlaceData getmPlaceData() {
		return mPlaceData;
	}

	public void setmPlaceData(PlaceData mPlaceData) {
		this.mPlaceData = mPlaceData;
	}
	
}

package com.chihuahua.places;

import java.util.List;

import com.chihuahua.basic.Place;
import com.chihuahua.basic.interfaces.iPlace;
import com.chihuahua.data.SimpleData;

public class World extends Place implements iPlace {

	private SimpleData mData;
	private List<Continent> mContinents;
	
	//Generate all randomly
	public World(){
		
	}
	
}

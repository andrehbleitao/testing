package com.chihuahua.places.buildings.testDojo;

import java.util.ArrayList;
import java.util.List;

import com.chihuahua.basic.Place;
import com.chihuahua.enums.eGroundType;
import com.chihuahua.people.Fighter;

public class Dojo extends Place{

	private eGroundType mGroundType = eGroundType.Wood;
	private List<Fighter> mListOfFighters;
	
	
	//public void getFighter
	
	public void actionAppendFighter(Fighter fighter){
		getmListOfFighters().add(fighter);
	}
	
	private eGroundType getmGroundType() {
		return mGroundType;
	}
	private void setmGroundType(eGroundType mGroundType) {
		this.mGroundType = mGroundType;
	}
	private List<Fighter> getmListOfFighters() {
		if(mListOfFighters == null){
			mListOfFighters = new ArrayList<Fighter>();
		}
		return mListOfFighters;
	}
	private void setmListOfFighters(List<Fighter> mListOfFighters) {
		this.mListOfFighters = mListOfFighters;
	}
	
	
}

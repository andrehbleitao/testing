package com.chihuahua.tests;

import com.chihuahua.enums.eFactor;
import com.chihuahua.people.Fighter;
import com.chihuahua.places.buildings.testDojo.Dojo;

public class Match {
	
	private StringBuffer mStoryHolder; //Armazena cada evento
	private Narrator mNarrator;
	private Dojo mDojo;
	
	public Match(){
		init();
	}
	
	private void init(){
		mStoryHolder = new StringBuffer();
		mNarrator = new Narrator();
		mDojo = new Dojo();
		
		Fighter f1 = new Fighter(eFactor.f100, eFactor.f5, eFactor.f15);
		Fighter f2 = new Fighter(eFactor.f96, eFactor.f3, eFactor.f20);
		
		//mDojo.dAppendFighter(f1);
		//mDojo.dAppendFighter(f2);
	}
	
	private String nextEvent(){
		processNextEvent();
		return printNextEvent();
	}
	
	private void processNextEvent(){
		
	}
	
	private String printNextEvent(){
		return "";
	}
	
}

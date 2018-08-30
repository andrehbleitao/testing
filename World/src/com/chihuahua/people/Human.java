package com.chihuahua.people;

import java.util.List;

import com.chihuahua.basic.PhysicalObject;
import com.chihuahua.basic.interfaces.iRace;
import com.chihuahua.enums.eFactor;
import com.chihuahua.enums.eFeelings;
import com.chihuahua.people.humanoidBody.HumanBody;

public abstract class Human implements iRace {

	private String mName;
	private HumanBody mHumanBody;
	private eFactor mVitalEnergy;
	private eFactor mStamina;
	private eFactor mFactorFear;
	private eFeelings mCurrentFeeling;
	private eFeelings mSecondaryFeeling;
	
	public boolean die(){
		this.mVitalEnergy = eFactor.f0;
		return true;
	}
	
	public boolean checkVitalConditions(){
		//checa se pode viver
		return true;
	}
	
	public boolean actionLookAround(){return false;}
	public boolean actionTurnAround(){return false;}
	public boolean actionSpeak(){return false;}
	public boolean actionWalk(){return false;}
	public boolean actionRun(){return false;}
	public boolean actionLayDown(){return false;}
	public boolean actionStandUp(){return false;}
	public boolean actionSmile(){return false;}
	public boolean actionCloseEyes(){return false;}
	public boolean actionOpenEyes(){return false;}
	public boolean actionTryToGrabWithLeftHand(List<PhysicalObject> physicalObjects){return false;}
	public boolean actionTryToGrabWithRightHand(List<PhysicalObject> physicalObjects){return false;}
	public boolean actionReleaseLeftHand(){return false;}
	public boolean actionReleaseRightHand(){return false;}
	
	
	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public eFactor getmFactorFear() {
		return mFactorFear;
	}
	public void setmFactorFear(eFactor mFactorFear) {
		this.mFactorFear = mFactorFear;
	}

	public HumanBody getmHumanBody() {
		return mHumanBody;
	}

	public void setmHumanBody(HumanBody mHumanBody) {
		this.mHumanBody = mHumanBody;
	}

	public eFactor getmVitalEnergy() {
		return mVitalEnergy;
	}

	public void setmVitalEnergy(eFactor mVitalEnergy) {
		this.mVitalEnergy = mVitalEnergy;
	}

	public eFactor getmStamina() {
		return mStamina;
	}

	public void setmStamina(eFactor mStamina) {
		this.mStamina = mStamina;
	}

	public eFeelings getmCurrentFeeling() {
		return mCurrentFeeling;
	}

	public void setmCurrentFeeling(eFeelings mCurrentFeeling) {
		this.mCurrentFeeling = mCurrentFeeling;
	}

	public eFeelings getmSecondaryFeeling() {
		return mSecondaryFeeling;
	}

	public void setmSecondaryFeeling(eFeelings mSecondaryFeeling) {
		this.mSecondaryFeeling = mSecondaryFeeling;
	}
	
}

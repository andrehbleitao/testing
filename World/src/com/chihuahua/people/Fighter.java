package com.chihuahua.people;

import com.chihuahua.enums.eFactor;

public class Fighter extends Human{

	//Energy before be knockedDown
	private eFactor mEnergy;
	private eFactor mLeftHandPower;
	private eFactor mRightHandPower;
	
	public Fighter(eFactor energy, eFactor leftHandPower, eFactor rightHandPower){
		this.mEnergy = energy;
		this.mLeftHandPower = leftHandPower;
		this.mRightHandPower = rightHandPower;
	}
	
	public boolean actionTryBasicLeftPunch(){
		return false;
	}
	
	public boolean actionTryBasicRightPunch(){
		return false;
	}
	
	public boolean actionReceiveHit(){
		return false;
	}
	public eFactor getmEnergy() {
		return mEnergy;
	}
	public void setmEnergy(eFactor mEnergy) {
		this.mEnergy = mEnergy;
	}
	public eFactor getmLeftHandPower() {
		return mLeftHandPower;
	}
	public void setmLeftHandPower(eFactor mLeftHandPower) {
		this.mLeftHandPower = mLeftHandPower;
	}
	public eFactor getmRightHandPower() {
		return mRightHandPower;
	}
	public void setmRightHandPower(eFactor mRightHandPower) {
		this.mRightHandPower = mRightHandPower;
	}
	
}

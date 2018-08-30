package com.chihuahua.people.humanoidBody;

import com.chihuahua.basic.interfaces.iHumanoid;

public class HumanBody implements iHumanoid{

	private Head mHead;
	private Arm mLeftArm;
	private Arm mRightArm;
	private Thorax mThorax;
	private Leg mLeftLeg;
	private Leg mRightLeg;
	
	
	
	
	
	public Head getmHead() {
		return mHead;
	}
	public void setmHead(Head mHead) {
		this.mHead = mHead;
	}
	public Arm getmLeftArm() {
		return mLeftArm;
	}
	public void setmLeftArm(Arm mLeftArm) {
		this.mLeftArm = mLeftArm;
	}
	public Arm getmRightArm() {
		return mRightArm;
	}
	public void setmRightArm(Arm mRightArm) {
		this.mRightArm = mRightArm;
	}
	public Thorax getmThorax() {
		return mThorax;
	}
	public void setmThorax(Thorax mThorax) {
		this.mThorax = mThorax;
	}
	public Leg getmLeftLeg() {
		return mLeftLeg;
	}
	public void setmLeftLeg(Leg mLeftLeg) {
		this.mLeftLeg = mLeftLeg;
	}
	public Leg getmRightLeg() {
		return mRightLeg;
	}
	public void setmRightLeg(Leg mRightLeg) {
		this.mRightLeg = mRightLeg;
	}
	
}

package com.chihuahua.people.humanoidBody;

import com.chihuahua.people.humanoidBody.arm.Elbow;
import com.chihuahua.people.humanoidBody.arm.ForeArm;
import com.chihuahua.people.humanoidBody.arm.Hand;
import com.chihuahua.people.humanoidBody.arm.Shoulder;
import com.chihuahua.people.humanoidBody.arm.UpperArm;
import com.chihuahua.people.humanoidBody.arm.Wrist;

public class Arm {

	private Shoulder mShoulder;
	private UpperArm mUpperArm;
	private Elbow mElbow;
	private ForeArm mForeArm;
	private Wrist mWrist;
	private Hand mHand;
	
	private boolean mEnabled;
	private String mDisableCause;
	
	public Shoulder getmShoulder() {
		return mShoulder;
	}
	public void setmShoulder(Shoulder mShoulder) {
		this.mShoulder = mShoulder;
	}
	public UpperArm getmUpperArm() {
		return mUpperArm;
	}
	public void setmUpperArm(UpperArm mUpperArm) {
		this.mUpperArm = mUpperArm;
	}
	public Elbow getmElbow() {
		return mElbow;
	}
	public void setmElbow(Elbow mElbow) {
		this.mElbow = mElbow;
	}
	public ForeArm getmForeArm() {
		return mForeArm;
	}
	public void setmForeArm(ForeArm mForeArm) {
		this.mForeArm = mForeArm;
	}
	public Wrist getmWrist() {
		return mWrist;
	}
	public void setmWrist(Wrist mWrist) {
		this.mWrist = mWrist;
	}
	public Hand getmHand() {
		return mHand;
	}
	public void setmHand(Hand mHand) {
		this.mHand = mHand;
	}
	
}

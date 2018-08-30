package com.chihuahua.basic;

public class BodyPart {

	private int mPainLimit;
	private int mPainLevel;
	private boolean mEnabled;
	
	
	public boolean getIsEnabled(){
		
		if(mEnabled){		
			if(this.mPainLevel > this.mPainLimit){
				mEnabled = false;
			}
		}
		return mEnabled;
		
	}
	
	/**
	 * Scale from zero to 100
	 */
	public void setPainLimit(int painLimit){
		this.mPainLimit = painLimit;
	}
	
	public void setPainLevel(int painLevel){
		this.mPainLevel = painLevel;
	}
	
	public void setEnabled(boolean enabled){
		this.mEnabled = enabled;
	}
	
	public void setEnabled(boolean enabled, int painLevel){
		this.mPainLevel = painLevel;
		this.mEnabled = enabled;
	}
	
	
	
}

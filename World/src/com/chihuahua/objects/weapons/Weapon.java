package com.chihuahua.objects.weapons;

import com.chihuahua.basic.PhysicalObject;

public abstract class Weapon extends PhysicalObject{

	private int mFACTORphysicalHurt;

	public int getmFACTORphysicalHurt() {
		return mFACTORphysicalHurt;
	}

	public void setmFACTORphysicalHurt(int mFACTORphysicalHurt) {
		this.mFACTORphysicalHurt = mFACTORphysicalHurt;
	}
	
}

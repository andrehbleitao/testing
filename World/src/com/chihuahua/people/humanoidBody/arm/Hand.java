package com.chihuahua.people.humanoidBody.arm;

import java.util.ArrayList;
import java.util.List;

import com.chihuahua.basic.BodyPart;
import com.chihuahua.basic.PhysicalObject;

public class Hand extends BodyPart {

	//Fator 0-100 pra indicar segurabilidade do objeto
	private int mFACTORHoldObject;
	
	//TODO aneis
	//TODO luvas
	private List<PhysicalObject> mHeldObjects;
	private boolean isOpened;
	private boolean isSegurando;
	
	public void open(){
		this.isOpened = true;
		this.isSegurando = false;
	}
	
	public void close(){
		this.isOpened = false;
	}
	
	public boolean grab(List<PhysicalObject> objects){
		
		int totalOfHoldFactors = 0;
		boolean grabbedSomething = false;
		
		for(PhysicalObject object : objects){
			
			totalOfHoldFactors += object.getmFACTORhold();
			
			//Se nao sobrecarregou a mao
			if(totalOfHoldFactors <= this.mFACTORHoldObject){
				this.getHeldObjects().add(object);
				grabbedSomething = true;
			}else{
				//o objeto cai e tenta dar grab no proximo
				totalOfHoldFactors -= object.getmFACTORhold();
				break;
			}
			
		}
		
		return grabbedSomething;
		
	}
	
	public List<PhysicalObject> getHeldObjects(){
		if(mHeldObjects == null){
			mHeldObjects = new ArrayList<PhysicalObject>();
		}
		return mHeldObjects;
	}
	
}

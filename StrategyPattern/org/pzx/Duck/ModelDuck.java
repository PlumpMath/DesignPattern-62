/*
 *Created on 9:22:29 AM Oct 12, 2014
 */
package org.pzx.Duck;

public class ModelDuck extends Duck{
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display(){
		System.out.println("I am a modelduck!");
	}

}


/*
 *Created on 8:40:06 AM Oct 12, 2014
 */
package org.pzx.Duck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck(){};
	public abstract void display();
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All duck can swim!");
	}
	
	

}


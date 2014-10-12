/*
 *Created on 8:53:44 AM Oct 12, 2014
 */
package org.pzx.Duck;


public class MallardDuck extends Duck{
	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display(){
		System.out.println("I am a mallard duck!");
	}

}


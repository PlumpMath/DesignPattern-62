/*
 *Created on 8:48:31 AM Oct 12, 2014
 */
package org.pzx.Duck;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}


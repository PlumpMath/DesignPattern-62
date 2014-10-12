/*
 *Created on 10:31:07 AM Oct 12, 2014
 */
package org.pzx.Weather;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}


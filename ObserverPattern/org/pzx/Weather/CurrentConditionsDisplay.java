/*
 *Created on 10:49:13 AM Oct 12, 2014
 */
package org.pzx.Weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);	
	}
	
	public void update(float temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
	public void display() {
		System.out.println("Current conditions"+temp+"F degress and " + humidity + "% humidity");
		

	}

}


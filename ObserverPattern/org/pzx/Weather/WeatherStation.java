/*
 *Created on 11:02:39 AM Oct 12, 2014
 */
package org.pzx.Weather;

public class WeatherStation {
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80,65,40.4f);
		
	}
}


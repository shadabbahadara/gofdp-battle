package com.khan.behavioral.observer;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10.0f, 5.0f);
    }
}

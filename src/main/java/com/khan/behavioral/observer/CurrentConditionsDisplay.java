package com.khan.behavioral.observer;

public class CurrentConditionsDisplay implements Observer {
    private Float temperature;
    private Float humidity;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(Float temperature, Float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current Display");
        System.out.println("temp: " + temperature);
        System.out.println("humidity: " + humidity);
    }
}

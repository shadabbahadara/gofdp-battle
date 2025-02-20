package com.khan.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    List<Observer> observers;
    private Float temperature;
    private Float humidity;

    public WeatherData() {
        observers =  new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(Float temperature, Float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }
}

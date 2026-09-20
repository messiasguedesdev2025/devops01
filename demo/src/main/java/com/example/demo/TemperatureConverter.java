package com.example.demo;

public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public boolean isBoilingPoint(double celsius) {
        return celsius >= 100;
    }
}

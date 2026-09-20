package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32, converter.celsiusToFahrenheit(0));
    }

    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0, converter.fahrenheitToCelsius(32));
    }

    @Test
    void testBoilingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        assertTrue(converter.isBoilingPoint(100));
        assertFalse(converter.isBoilingPoint(99));
    }
}

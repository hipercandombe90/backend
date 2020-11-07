package com.termometer.example.util;

import org.springframework.stereotype.Component;

@Component
public class Converter {

   public double convertFarenheitCelsius (double farenheit) {
       return (farenheit - 32) * 5/9;
   }

   public double convertCelsiusFarenheit(double celsius) {
       return (celsius * 9/5) + 32;
   }
}

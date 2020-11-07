package com.termometer.example;

import com.termometer.example.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TermometerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TermometerApplication.class, args);
    }

    @Autowired
    private Converter converter;

    @GetMapping("/convert/farenheit/celsius/{farenheit}")
    public ResponseEntity<Double> convertFarenheitCelsius(@PathVariable double farenheit){
        double value = converter.convertFarenheitCelsius(farenheit);
        return new ResponseEntity<>(value, HttpStatus.OK);
    }

    @GetMapping("/convert/celsius/farenheit/{celsius}")
    public ResponseEntity<Double> convertCelsiusFarenheit(@PathVariable double celsius){
        double value = converter.convertCelsiusFarenheit(celsius);
        return new ResponseEntity<>(value, HttpStatus.OK);
    }
}

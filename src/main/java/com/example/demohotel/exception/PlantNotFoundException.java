package com.example.demohotel.exception;

public class PlantNotFoundException extends RuntimeException{
    public PlantNotFoundException(String message) {
        super(message);
    }
}

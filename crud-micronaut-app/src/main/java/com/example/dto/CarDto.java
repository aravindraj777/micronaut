package com.example.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CarDto {

    @NotEmpty(message = "Car should have a brand")
    String brand;

    @NotEmpty(message = "Car should have a model")
    String model;
    @NotNull(message = "Car should have a year")
    Integer year;
}

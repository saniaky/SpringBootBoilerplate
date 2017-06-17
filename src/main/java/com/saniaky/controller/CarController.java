package com.saniaky.controller;

import com.saniaky.controller.dto.CarDTO;
import com.saniaky.entity.Car;
import com.saniaky.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author saniaky
 * @since 6/17/17
 */
@RestController
public class CarController {

    private final CarService carService;
    private final ModelMapper mapper;

    @Autowired
    public CarController(CarService carService, ModelMapper mapper) {
        this.carService = carService;
        this.mapper = mapper;
    }

    @GetMapping("/cars")
    public List<CarDTO> getCar() {
        List<Car> cars = carService.getCars();
        return cars.stream().map(c -> mapper.map(c, CarDTO.class)).collect(Collectors.toList());
    }
}

package com.saniaky.service;

import com.saniaky.entity.Car;
import com.saniaky.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author saniaky
 * @since 6/17/17
 */
@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

}

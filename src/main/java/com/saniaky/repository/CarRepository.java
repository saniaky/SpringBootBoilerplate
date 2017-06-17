package com.saniaky.repository;

import com.saniaky.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author saniaky
 * @since 6/17/17
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}

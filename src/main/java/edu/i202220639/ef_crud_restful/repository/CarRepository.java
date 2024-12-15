package edu.i202220639.ef_crud_restful.repository;

import edu.i202220639.ef_crud_restful.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Integer> {
}

package edu.i202220639.ef_crud_restful.service;

import edu.i202220639.ef_crud_restful.dto.CarDetailDto;
import edu.i202220639.ef_crud_restful.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<CarDto> getAllCars() throws Exception;
    Optional<CarDetailDto> getCarById(int id) throws Exception;
    boolean updateCar(CarDetailDto carDetailDto) throws Exception;
    boolean deleteCar(int id) throws Exception;
    boolean addCar(CarDetailDto carDetailDto) throws Exception;
}

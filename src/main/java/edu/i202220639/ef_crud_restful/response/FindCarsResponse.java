package edu.i202220639.ef_crud_restful.response;

import edu.i202220639.ef_crud_restful.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto>cars) {
}

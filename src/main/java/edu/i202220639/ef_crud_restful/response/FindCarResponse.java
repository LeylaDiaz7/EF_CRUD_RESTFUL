package edu.i202220639.ef_crud_restful.response;
import edu.i202220639.ef_crud_restful.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}

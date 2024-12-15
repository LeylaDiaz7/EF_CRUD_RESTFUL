package edu.i202220639.ef_crud_restful.dto;

import java.util.Date;

public record CarDto(Integer carId,
                     String make,
                     String model,
                     String licensePlate,
                     String ownerName,
                     String ownerContact,
                     String color,
                     String insurancePolicyNumber,
                     Date registrationExpirationDate,
                     Date serviceDueDate) {
}

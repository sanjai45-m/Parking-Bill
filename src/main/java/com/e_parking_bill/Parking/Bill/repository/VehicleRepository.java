package com.e_parking_bill.Parking.Bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.e_parking_bill.Parking.Bill.model.Vehicle;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findAllByVehicleType(String vehicleType); // Add this method
}

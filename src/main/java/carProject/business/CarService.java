package carProject.business;

import carProject.entities.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    void addCar(Car car);

}




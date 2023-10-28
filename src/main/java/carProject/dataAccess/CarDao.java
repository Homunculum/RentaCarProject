package carProject.dataAccess;

import carProject.entities.Car;

import java.util.List;

public interface CarDao {
    Car getCarById(int id);
    List<Car> getAllCars();
    void addCar(Car car);

}
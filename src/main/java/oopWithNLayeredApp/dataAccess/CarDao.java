package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Car;

import java.util.List;

public interface CarDao {
    Car getCarById(int id);
    List<Car> getAllCars();
    void addCar(Car car);

}

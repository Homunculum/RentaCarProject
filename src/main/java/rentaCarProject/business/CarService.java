package rentaCarProject.business;

import rentaCarProject.entities.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    void addCar(Car car);

}




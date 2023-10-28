package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();
    private int nextId = 1;

    @Override
    public Car getCarById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null; // Araba bulunamazsa null döndürüyoruz.
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);

    }

}

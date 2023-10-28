package rentaCarProject.dataAccess;

import rentaCarProject.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    @Override
    public Car getCarById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
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

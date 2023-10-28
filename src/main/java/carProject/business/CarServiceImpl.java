package carProject.business;

import carProject.dataAccess.CarDao;
import carProject.entities.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {

        this.carDao = carDao;
    }


    @Override
    public List<Car> getAllCars() {

        return carDao.getAllCars();
    }

    @Override
    public void addCar(Car car) {

        carDao.addCar(car);
    }


}

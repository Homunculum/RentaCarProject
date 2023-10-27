package oopWithNLayeredApp.entities;
import java.util.List;

public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public Car getCarById(int id) {
        return carDao.getCarById(id);
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

package rentaCarProject.dataAccess;

import rentaCarProject.entities.Car;
import rentaCarProject.entities.Renter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RenterDaoImpl implements RenterDao {
    private List<Renter> renters = new ArrayList();
    private CarDao carDao;

    public RenterDaoImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public Renter rentCar(String tc, String ad, String soyad, String telefonNo, LocalDateTime kiralamaTarihi, int carId) {
        Car rentedCar = carDao.getCarById(carId);
        if (rentedCar != null && rentedCar.isAvailable()) {
            rentedCar.setAvailable(false);
            Renter renter = new Renter(tc, ad, soyad, telefonNo, kiralamaTarihi, rentedCar);
            renters.add(renter);
            return renter;
        }
        return null;
    }


    @Override
    public List<Renter> getRentedCars() {
        List<Renter> rentedCars = new ArrayList<>();
        for (Renter renter : renters) {
            rentedCars.add(renter);
        }
        return rentedCars;
    }
}

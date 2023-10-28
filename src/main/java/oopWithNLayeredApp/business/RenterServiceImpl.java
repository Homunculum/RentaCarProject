package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.CarDao;
import oopWithNLayeredApp.dataAccess.RenterDao;
import oopWithNLayeredApp.entities.Renter;

import java.util.List;
import java.time.LocalDateTime;

public class RenterServiceImpl implements RenterService {
    private RenterDao renterDao;
    private CarDao carDao;

    public RenterServiceImpl(RenterDao renterDao, CarDao carDao) {
        this.renterDao = renterDao;
        this.carDao = carDao;
    }

    @Override
    public Renter rentCar(String tc, String ad, String soyad, String telefonNo, LocalDateTime kiralamaTarihi, int carId) {
        return renterDao.rentCar(tc, ad, soyad, telefonNo, kiralamaTarihi, carId);
    }

    @Override
    public List<Renter> getRentedCars() {

        return renterDao.getRentedCars();
    }
}


package rentaCarProject.business;

import rentaCarProject.dataAccess.CarDao;
import rentaCarProject.dataAccess.RenterDao;
import rentaCarProject.entities.Renter;

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


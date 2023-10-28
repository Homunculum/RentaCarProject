package rentaCarProject.business;

import rentaCarProject.entities.Renter;

import java.time.LocalDateTime;
import java.util.List;

public interface RenterService {
    Renter rentCar(String tc, String ad, String soyad, String telefonNo, LocalDateTime kiralamaTarihi, int carId);


    List<Renter> getRentedCars();


}

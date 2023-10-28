package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Renter;

import java.time.LocalDateTime;
import java.util.List;

public interface RenterDao {

    Renter rentCar(String tc, String ad, String soyad, String telefonNo, LocalDateTime kiralamaTarihi, int carId);

    List<Renter> getRentedCars();


}

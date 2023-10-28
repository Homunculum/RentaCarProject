package oopWithNLayeredApp;

import oopWithNLayeredApp.entities.Car;
import oopWithNLayeredApp.entities.Renter;
import oopWithNLayeredApp.dataAccess.CarDao;
import oopWithNLayeredApp.dataAccess.CarDaoImpl;
import oopWithNLayeredApp.dataAccess.RenterDao;
import oopWithNLayeredApp.dataAccess.RenterDaoImpl;
import oopWithNLayeredApp.business.CarService;
import oopWithNLayeredApp.business.CarServiceImpl;
import oopWithNLayeredApp.business.RenterService;
import oopWithNLayeredApp.business.RenterServiceImpl;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDao carDao = new CarDaoImpl();
        RenterDao renterDao = new RenterDaoImpl(carDao);

        CarService carService = new CarServiceImpl(carDao);
        RenterService renterService = new RenterServiceImpl(renterDao, carDao);

        // Araba ekleme işlemi
        Car car1 = new Car(0, "Toyota", "Camry", 2022, true, 240.0);
        carService.addCar(car1);
        Car car2 = new Car(1, "Renault", "Clio", 2020, true, 200.0);
        carService.addCar(car2);
        Car car3 = new Car(2, "Opel", "Corsa", 2023, true, 280.0);
        carService.addCar(car3);


        // Araba kiralama işlemi

        LocalDateTime  kiralamaTarihi1 = LocalDateTime.of(2023, 10, 26, 22, 43); // Kiralama tarihi
        Renter renter1 = renterService.rentCar("12345678901", "kadir", "elsıkma", "05448989796", kiralamaTarihi1, 0);

        LocalDateTime  kiralamaTarihi2 = LocalDateTime.of(2023, 10, 25, 10, 20); // Kiralama tarihi
        Renter renter2 = renterService.rentCar("10987654321", "halit", "kalaycı", "05444444444", kiralamaTarihi2, 2);




        // Tüm arabaları listele
        List<Car> allCars = carService.getAllCars();
        System.out.println("Tüm Arabalar:");
        for (Car car : allCars) {


            System.out.println("ID: " + car.getId() +
                    ", Marka: " + car.getBrand() +
                    ", Model: " + car.getModel() +
                    ", Yıl: " + car.getYear() +
                    ", Kullanılabilir: " + (car.isAvailable() ? "Evet" : "Hayır") +
                    ", Günlük Fiyat: " + car.getDailyPrice());
        }

        // Kiralanmış arabaları listele
        List<Renter>rentedCars = renterService.getRentedCars();


        System.out.println("\nKiralanan Arabalar:");
        for (Renter rent : rentedCars) {
            LocalDateTime kiralamaTarihiArac = rent.getKiralamaTarihi();
            Duration kiralamaSuresi = Duration.between(kiralamaTarihiArac, LocalDateTime.now());



            long gecenZamanGun = kiralamaSuresi.toDays();
            long gecenZamanS =kiralamaSuresi.toHours()%24;
            long gecenZamanD =kiralamaSuresi.toMinutes()%60;
            long gecenZamanD2 =kiralamaSuresi.toMinutes();

            double kiraUcreti =gecenZamanD2 * rent.getKiralananAraba().getDailyPrice()/1440;
            System.out.println("TC: " + rent.getTc() +
                    ", Ad: " + rent.getAd() +
                    ", Soyad: " + rent.getSoyad() +
                    ", Telefon No: " + rent.getTelefonNo() +
                    ", Araba Marka: " + rent.getKiralananAraba().getBrand() +
                    ", Araba Model: " + rent.getKiralananAraba().getModel() +
                    ", Kiralama Günü: " + kiralamaTarihi1 +
                    ", Kiralama Süresi: " + gecenZamanGun +" gün " + gecenZamanS+ " saat " + gecenZamanD + " dakika" +
                    ", Kiralama Ücreti: " + kiraUcreti);
        }

        // Kiralanmamış arabaları listele

        List<Car> availableCars = carService.getAllCars();
        System.out.println("\nKiralanmamış Arabalar:");
        for (Car car : availableCars) {
            if (car.isAvailable()) {
                System.out.println("ID: " + car.getId() +
                        ", Marka: " + car.getBrand() +
                        ", Model: " + car.getModel() +
                        ", Yıl: " + car.getYear() +
                        ", Kullanılabilir: Evet" +
                        ", Günlük Fiyat: " + car.getDailyPrice());
            }
        }
    }
}


package oopWithNLayeredApp.rentCar;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private boolean isAvailable;
    private double dailyPrice;

    public Car(int id, String brand, String model, int year, boolean isAvailable) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    // Getter ve Setter metotları
    // toString() metodu
    public double getDailyPrice() {
        return dailyPrice;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}

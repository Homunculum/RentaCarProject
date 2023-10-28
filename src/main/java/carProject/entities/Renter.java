package carProject.entities;

import java.time.LocalDateTime;

public class Renter {
    private String tc;
    private String ad;
    private String soyad;
    private String telefonNo;
    private LocalDateTime kiralamaTarihi;
    private Car kiralananAraba;

    public Renter(String tc, String ad, String soyad, String telefonNo, LocalDateTime kiralamaTarihi, Car kiralananAraba) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.telefonNo = telefonNo;
        this.kiralamaTarihi = kiralamaTarihi;
        this.kiralananAraba = kiralananAraba;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public LocalDateTime getKiralamaTarihi() {
        return kiralamaTarihi;
    }

    public void setKiralamaTarihi(LocalDateTime kiralamaTarihi) {
        this.kiralamaTarihi = kiralamaTarihi;
    }

    public Car getKiralananAraba() {
        return kiralananAraba;
    }

    public void setKiralananAraba(Car kiralananAraba) {
        this.kiralananAraba = kiralananAraba;
    }
}

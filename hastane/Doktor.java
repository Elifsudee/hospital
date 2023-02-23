package miniproject.hastane;

public class Doktor {

    private int id;
    private String isim;
    private String soyisim;
    private String unvan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }




    public Doktor(int id, String isim, String soyisim, String unvan) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.unvan = unvan;

    }

    @Override
    public String toString() {
        return "Doktor{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", unvan='" + unvan + '\'' +
                '}';
    }
}

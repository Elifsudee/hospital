package miniproject.hastane;

public class Hasta {

    private String isim;
    private String soyisim;
    private int idNo;
    private PatientStatus hastaDurum;

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

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public PatientStatus getHastaDurum() {
        return hastaDurum;
    }

    public void setHastaDurum(PatientStatus hastaDurum) {
        this.hastaDurum = hastaDurum;
    }

    public Hasta(String isim, String soyisim, int idNo, PatientStatus hastaDurum) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.idNo = idNo;
        this.hastaDurum = hastaDurum;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", idNo=" + idNo +
                ", hastaDurum=" + hastaDurum +
                '}';
    }
}

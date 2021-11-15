import java.util.List;

public abstract class Angajat{
    private String nume;
    private String adresa;
    private int salar;
    private String detalii_post;

    public Angajat(String nume, String adresa, int salar, String detalii_post) {
        this.nume = nume;
        this.adresa = adresa;
        this.salar = salar;
        this.detalii_post = detalii_post;
    }

    public Angajat() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    public String getDetalii_post() {
        return detalii_post;
    }

    public void setDetalii_post(String detalii_post) {
        this.detalii_post = detalii_post;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", salar=" + salar +
                ", detalii_post='" + detalii_post + '\'' +
                '}';
    }
}

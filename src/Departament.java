import java.util.List;

public class Departament implements Categorie{
    private List<Angajat> angajati;
    private List<Sub_Departament> sub_departamente;
    String categorie;

    @Override
    public String print_message() {
        return categorie;
    }

    public Departament(List<Angajat> angajati, List<Sub_Departament> sub_departamente, String categorie) {
        this.angajati = angajati;
        this.sub_departamente = sub_departamente;
        this.categorie = categorie;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajat> angajati) {
        this.angajati = angajati;
    }

    public List<Sub_Departament> getSub_departamente() {
        return sub_departamente;
    }

    public void setSub_departamente(List<Sub_Departament> sub_departamente) {
        this.sub_departamente = sub_departamente;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "angajati=" + angajati +
                ", sub_departamente=" + sub_departamente +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}

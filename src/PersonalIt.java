public class PersonalIt extends Angajat implements Tip_angajat{

    @Override
    public String print_message() {
        return "Personal_IT";
    }

    public PersonalIt(String nume, String adresa, int salar, String detalii_post) {
        super(nume, adresa, salar, detalii_post);
    }
}

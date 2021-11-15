public class Manager extends Angajat implements Tip_angajat{

    @Override
    public String print_message() {
        return "Manager";
    }

    public Manager(String nume, String adresa, int salar, String detalii_post) {
        super(nume, adresa, salar, detalii_post);
    }
}

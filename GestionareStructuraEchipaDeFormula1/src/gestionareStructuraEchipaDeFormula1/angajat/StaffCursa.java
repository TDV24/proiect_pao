package gestionareStructuraEchipaDeFormula1.angajat;

public class StaffCursa extends Angajat{

    private int varsta;
    private int salariu;
    private int longevitate;

    public StaffCursa(String prenume, String nume, int varsta, int salariu, int longevitate) {
        super(prenume, nume);
        this.varsta = varsta;
        this.salariu = salariu;
        this.longevitate = longevitate;
    }

    @Override
    public int getIdAngajat() {
        return super.getIdAngajat();
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public int getLongevitate() {
        return longevitate;
    }

    public void setLongevitate(int longevitate) {
        this.longevitate = longevitate;
    }

    @Override
    public String toString() {
        return ("ID_Angajat: " + this.getIdAngajat() + "\n"
                + "Nume: " + this.getNume() + "\n"
                + "Prenume: " + this.getPrenume() + "\n"
                + "Varsta: " + this.varsta + "\n"
                + "Salariu: " + this.salariu + "\n"
                + "Longevitate: " + this.longevitate + "\n"
                + "----------------------------------------");
    }

    @Override
    public String getJob() {
        return "Acest angajat are slujba de Staff_Cursa";
    }
}

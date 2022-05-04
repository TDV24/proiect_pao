package gestionareStructuraEchipaDeFormula1.angajat;

public class Pilot extends Angajat{

    private int varsta;
    private int salariu;
    private int victorii;

    public Pilot(String prenume, String nume, int varsta, int salariu, int victorii) {
        super(prenume, nume);
        this.varsta = varsta;
        this.salariu = salariu;
        this.victorii = victorii;
    }

    public Pilot(){
        super();
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

    public int getVictorii() {
        return victorii;
    }

    public void setVictorii(int victorii) {
        this.victorii = victorii;
    }

    @Override
    public String toString() {
        return ("ID_Angajat: " + this.getIdAngajat() + "\n"
                + "Nume: " + this.getNume() + "\n"
                + "Prenume: " + this.getPrenume() + "\n"
                + "Varsta: " + this.varsta + "\n"
                + "Salariu: " + this.salariu + "\n"
                + "Victorii: " + this.victorii + "\n"
                + "----------------------------------------");
    }

    @Override
    public String getJob() {
        return "Acest angajat are slujba de Pilot";
    }
}

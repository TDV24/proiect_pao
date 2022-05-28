package gestionareStructuraEchipaDeFormula1.angajat;

public class AltJob extends Angajat{

    private int varsta;
    private int salariu;
    private String hobby;

    public AltJob(String prenume, String nume, int varsta, int salariu, String hobby) {
        super(prenume, nume);
        this.varsta = varsta;
        this.salariu = salariu;
        this.hobby = hobby;
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return (  "Nume: " + this.getNume() + "\n"
                + "Prenume: " + this.getPrenume() + "\n"
                + "Varsta: " + this.varsta + "\n"
                + "Salariu: " + this.salariu + "\n"
                + "Hobby(pe langa formula 1): " + this.hobby + "\n"
                + "----------------------------------------");
    }

    @Override
    public String getJob() {
        return "AltJob";
    }
}

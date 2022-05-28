package gestionareStructuraEchipaDeFormula1.angajat;

public abstract class Angajat{
    private String prenume;
    private String nume;

    public Angajat(String prenume, String nume) {
        this.prenume = prenume;
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    abstract public String getJob();
}

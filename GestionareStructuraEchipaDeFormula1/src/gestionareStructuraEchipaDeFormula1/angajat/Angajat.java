package gestionareStructuraEchipaDeFormula1.angajat;

public abstract class Angajat {
    private static int id = 0;
    private int idAngajat;
    private String prenume;
    private String nume;

    public Angajat(String prenume, String nume) {
        id = id + 1;
        this.idAngajat = id;
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

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    abstract public String getJob();
}

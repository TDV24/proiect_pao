package gestionareStructuraEchipaDeFormula1.Angajat;

public abstract class Angajat {
    private static int id = 0;
    private int id_angajat;
    private String prenume;
    private String nume;

    public Angajat(String prenume, String nume) {
        id = id + 1;
        this.id_angajat = id;
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

    public int getId_angajat() {
        return id_angajat;
    }

    public void setId_angajat(int id_angajat) {
        this.id_angajat = id_angajat;
    }

    abstract public String getJob();
}

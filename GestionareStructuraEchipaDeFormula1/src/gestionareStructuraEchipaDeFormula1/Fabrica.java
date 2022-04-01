package gestionareStructuraEchipaDeFormula1;

public class Fabrica {

    private String locatie;
    private String adresa;
    private int numar_angajati;
    private int suprafata;

    public Fabrica(String locatie, String adresa, int numar_angajati, int suprafata) {
        this.locatie = locatie;
        this.adresa = adresa;
        this.numar_angajati = numar_angajati;
        this.suprafata = suprafata;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNumar_angajati() {
        return numar_angajati;
    }

    public void setNumar_angajati(int numar_angajati) {
        this.numar_angajati = numar_angajati;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    @Override
    public String toString() {
        return (  "Locatia fabricii(tara): " + this.locatie + "\n"
                + "Adresa: " + this.adresa + "\n"
                + "Numar de angajati: " + this.numar_angajati + "\n"
                + "Suprafata(hectare): " + this.suprafata + "\n"
                + "----------------------------------------");
    }
}

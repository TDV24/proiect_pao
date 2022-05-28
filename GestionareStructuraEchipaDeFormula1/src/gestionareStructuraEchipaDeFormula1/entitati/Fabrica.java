package gestionareStructuraEchipaDeFormula1.entitati;

public class Fabrica {

    private String locatie;
    private String adresa;
    private int numarAngajati;
    private int suprafata;

    public Fabrica(String locatie, String adresa, int numarAngajati, int suprafata) {
        this.locatie = locatie;
        this.adresa = adresa;
        this.numarAngajati = numarAngajati;
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

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
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
                + "Numar de angajati: " + this.numarAngajati + "\n"
                + "Suprafata(hectare): " + this.suprafata + "\n"
                + "----------------------------------------");
    }
}

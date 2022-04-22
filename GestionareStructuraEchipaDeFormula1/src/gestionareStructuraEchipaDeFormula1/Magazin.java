package gestionareStructuraEchipaDeFormula1;

public class Magazin {

    private String locatie;
    private String adresa;
    private int incasari;
    private int articoleVandute;

    public Magazin(String locatie, String adresa, int incasari, int articoleVandute) {
        this.locatie = locatie;
        this.adresa = adresa;
        this.incasari = incasari;
        this.articoleVandute = articoleVandute;
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

    public int getIncasari() {
        return incasari;
    }

    public void setIncasari(int incasari) {
        this.incasari = incasari;
    }

    public int getArticoleVandute() {
        return articoleVandute;
    }

    public void setArticoleVandute(int articoleVandute) {
        this.articoleVandute = articoleVandute;
    }

    @Override
    public String toString() {
        return ("Locatia magazinului(tara): " + this.locatie + "\n"
                + "Adresa: " + this.adresa + "\n"
                + "Incasari: " + this.incasari + "\n"
                + "Articole vandute: " + this.articoleVandute + "\n"
                + "----------------------------------------");
    }
}

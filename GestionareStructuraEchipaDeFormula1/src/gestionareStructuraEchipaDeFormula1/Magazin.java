package gestionareStructuraEchipaDeFormula1;

public class Magazin {

    private String locatie;
    private String adresa;
    private int incasari;
    private int articole_vandute;

    public Magazin(String locatie, String adresa, int incasari, int articole_vandute) {
        this.locatie = locatie;
        this.adresa = adresa;
        this.incasari = incasari;
        this.articole_vandute = articole_vandute;
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

    public int getArticole_vandute() {
        return articole_vandute;
    }

    public void setArticole_vandute(int articole_vandute) {
        this.articole_vandute = articole_vandute;
    }

    @Override
    public String toString() {
        return ("Locatia magazinului(tara): " + this.locatie + "\n"
                + "Adresa: " + this.adresa + "\n"
                + "Incasari: " + this.incasari + "\n"
                + "Articole vandute: " + this.articole_vandute + "\n"
                + "----------------------------------------");
    }
}

package gestionareStructuraEchipaDeFormula1;

public class Sponsor {

    private String nume;
    private String domeniu;
    private int investitie;
    private String amplasare_sticker;

    public Sponsor(String nume, String domeniu, int investitie, String amplasare_sticker) {
        this.nume = nume;
        this.domeniu = domeniu;
        this.investitie = investitie;
        this.amplasare_sticker = amplasare_sticker;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public int getInvestitie() {
        return investitie;
    }

    public void setInvestitie(int investitie) {
        this.investitie = investitie;
    }

    public String getAmplasare_sticker() {
        return amplasare_sticker;
    }

    public void setAmplasare_sticker(String amplasare_sticker) {
        this.amplasare_sticker = amplasare_sticker;
    }

    @Override
    public String toString() {
        return ("Nume sponsor: " + this.nume + "\n"
                + "Domeniu: " + this.domeniu + "\n"
                + "Investitie: " + this.investitie + "\n"
                + "Pozitie sticker pe masina: " + this.amplasare_sticker + "\n"
                + "----------------------------------------");
    }
}

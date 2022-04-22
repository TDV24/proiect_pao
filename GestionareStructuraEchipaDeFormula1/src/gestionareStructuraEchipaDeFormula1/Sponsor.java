package gestionareStructuraEchipaDeFormula1;

public class Sponsor {

    private String nume;
    private String domeniu;
    private int investitie;
    private String amplasareSticker;

    public Sponsor(String nume, String domeniu, int investitie, String amplasareSticker) {
        this.nume = nume;
        this.domeniu = domeniu;
        this.investitie = investitie;
        this.amplasareSticker = amplasareSticker;
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

    public String getAmplasareSticker() {
        return amplasareSticker;
    }

    public void setAmplasareSticker(String amplasareSticker) {
        this.amplasareSticker = amplasareSticker;
    }

    @Override
    public String toString() {
        return ("Nume sponsor: " + this.nume + "\n"
                + "Domeniu: " + this.domeniu + "\n"
                + "Investitie: " + this.investitie + "\n"
                + "Pozitie sticker pe masina: " + this.amplasareSticker + "\n"
                + "----------------------------------------");
    }
}

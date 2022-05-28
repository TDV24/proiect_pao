package gestionareStructuraEchipaDeFormula1.servicii;

import gestionareStructuraEchipaDeFormula1.angajat.AltJob;
import gestionareStructuraEchipaDeFormula1.angajat.Angajat;
import gestionareStructuraEchipaDeFormula1.angajat.Pilot;
import gestionareStructuraEchipaDeFormula1.angajat.StaffCursa;
import gestionareStructuraEchipaDeFormula1.entitati.Echipa;
import gestionareStructuraEchipaDeFormula1.entitati.Fabrica;
import gestionareStructuraEchipaDeFormula1.entitati.Magazin;
import gestionareStructuraEchipaDeFormula1.entitati.Sponsor;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Servicii {

    private List<Angajat> angajati = new ArrayList<>();
    private List<Pilot> piloti = new ArrayList<>();
    private List<StaffCursa> staff = new ArrayList<>();
    private List<AltJob> altejoburi = new ArrayList<>();
    private List<Fabrica> fabrici = new ArrayList<>();
    private List<Magazin> magazine = new ArrayList<>();
    private List<Sponsor> sponsori = new ArrayList<>();
    private Map<String, Integer> salarii = new HashMap<>();

    public Pilot crearePilot(String prenume, String nume, int varsta, int salariu, int victorii) {
        Pilot pilot = new Pilot(prenume, nume, varsta, salariu, victorii);
        angajati.add(pilot);
        piloti.add(pilot);
        salarii.put(nume, salariu);
        return pilot;
    }

    public StaffCursa creareStaffCursa(String prenume, String nume, int varsta, int salariu, int longevitate){
        StaffCursa staffCursa = new StaffCursa(prenume, nume, varsta, salariu, longevitate);
        angajati.add(staffCursa);
        staff.add(staffCursa);
        salarii.put(nume, salariu);
        return staffCursa;
    }

    public AltJob creareAltJob(String prenume, String nume, int varsta, int salariu, String hobby){
        AltJob altJob = new AltJob(prenume, nume, varsta, salariu, hobby);
        angajati.add(altJob);
        altejoburi.add(altJob);
        salarii.put(nume, salariu);
        return altJob;
    }

    public Fabrica creareFabrica(String locatie, String adresa, int numar_angajati, int suprafata){
        Fabrica fabrica = new Fabrica(locatie, adresa, numar_angajati, suprafata);
        fabrici.add(fabrica);
        return fabrica;
    }

    public Magazin creareMagazin(String locatie, String adresa, int incasari, int articole_vandute){
        Magazin magazin = new Magazin(locatie, adresa, incasari, articole_vandute);
        magazine.add(magazin);
        return magazin;
    }

    public Sponsor creareSponsor(String nume, String domeniu, int investitie, String amplasare_sticker){
        Sponsor sponsor = new Sponsor(nume, domeniu, investitie, amplasare_sticker);
        sponsori.add(sponsor);
        return sponsor;
    }

    public void IstorieEchipa(){
        Echipa.InformatiiEchipa();
    }

    public void detaliiAngajati(){
        for(int i = 0; i < angajati.size(); i++)
        {
            System.out.println(angajati.get(i).toString());
        }
    }

    public void detaliiFabrici(){
        for(int i = 0; i < fabrici.size(); i++)
        {
            System.out.println(fabrici.get(i).toString());
        }
    }

    public void detaliiMagazine(){
        for(int i = 0; i < magazine.size(); i++)
        {
            System.out.println(magazine.get(i).toString());
        }
    }

    public void detaliiSponsori(){
        for(int i = 0; i < sponsori.size(); i++)
        {
            System.out.println(sponsori.get(i).toString());
        }
    }

    public int salariuTotal(){
        int salariutotal = 0;
        for(Map.Entry<String, Integer> ang : salarii.entrySet())
        {
            salariutotal = salariutotal + ang.getValue();
        }
        return salariutotal;
    }
}

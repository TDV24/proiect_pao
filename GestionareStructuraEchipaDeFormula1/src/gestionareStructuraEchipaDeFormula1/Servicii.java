package gestionareStructuraEchipaDeFormula1;

import gestionareStructuraEchipaDeFormula1.Angajat.AltJob;
import gestionareStructuraEchipaDeFormula1.Angajat.Angajat;
import gestionareStructuraEchipaDeFormula1.Angajat.Pilot;
import gestionareStructuraEchipaDeFormula1.Angajat.StaffCursa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Servicii {

    private ArrayList<Angajat> angajati = new ArrayList<>();
    private ArrayList<Pilot> piloti = new ArrayList<>();
    private ArrayList<StaffCursa> staff = new ArrayList<>();
    private ArrayList<AltJob> altejoburi = new ArrayList<>();
    private ArrayList<Fabrica> fabrici = new ArrayList<>();
    private ArrayList<Magazin> magazine = new ArrayList<>();
    private ArrayList<Sponsor> sponsori = new ArrayList<>();
    private Map<Integer, Integer> salarii = new HashMap<>();

    public Pilot crearePilot(String prenume, String nume, int varsta, int salariu, int victorii){
        Pilot pilot = new Pilot(prenume, nume, varsta, salariu, victorii);
        int id_pilot = pilot.getId_angajat();
        angajati.add(pilot);
        piloti.add(pilot);
        salarii.put(id_pilot, salariu);
        return pilot;
    }

    public StaffCursa creareStaffCursa(String prenume, String nume, int varsta, int salariu, int longevitate){
        StaffCursa staffCursa = new StaffCursa(prenume, nume, varsta, salariu, longevitate);
        int id_staffCursa = staffCursa.getId_angajat();
        angajati.add(staffCursa);
        staff.add(staffCursa);
        salarii.put(id_staffCursa, salariu);
        return staffCursa;
    }

    public AltJob creareAltJob(String prenume, String nume, int varsta, int salariu, String hobby){
        AltJob altJob = new AltJob(prenume, nume, varsta, salariu, hobby);
        int id_altJob = altJob.getId_angajat();
        angajati.add(altJob);
        altejoburi.add(altJob);
        salarii.put(id_altJob, salariu);
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
        Echipa.detalii_echipa();
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
        for(Map.Entry<Integer, Integer> ang : salarii.entrySet())
        {
            salariutotal = salariutotal + ang.getValue();
        }
        return salariutotal;
    }
}

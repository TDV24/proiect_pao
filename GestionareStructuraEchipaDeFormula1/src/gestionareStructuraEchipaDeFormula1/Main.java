package gestionareStructuraEchipaDeFormula1;

import gestionareStructuraEchipaDeFormula1.angajat.*;
import gestionareStructuraEchipaDeFormula1.entitati.*;
import gestionareStructuraEchipaDeFormula1.servicii.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Servicii servicii = new Servicii();
//        Echipa echipa = getEchipa();
//        // afisare date despre echipa care foloseste sistemul de gestionare
//        servicii.IstorieEchipa();
//        // creare de angajati noi pentru fabrica si verificarea calcului salariilor totale
//        Pilot p1 = servicii.crearePilot("Max", "Verstappen", 24, 40471000, 21);
//        Pilot p2 = servicii.crearePilot("Sergio", "Perez", 31, 8734000, 2);
//        StaffCursa s1 = servicii.creareStaffCursa("Andy", "Chukz", 42, 64890, 10);
//        StaffCursa s2 = servicii.creareStaffCursa("Christian", "Horner", 51, 980000, 15);
//        AltJob a1 = servicii.creareAltJob("Ilaix", "Moriba" , 25, 36380, "pescuit");
//        AltJob a2 = servicii.creareAltJob("Mikayla", "Green", 33, 52500, "plimbari lungi");
//        servicii.detaliiAngajati();
//        System.out.println("Salariul total al echipei in acest moment este de: " + servicii.salariuTotal());
//        // verificare fabrici daca functioneaza
//        Fabrica f1 = servicii.creareFabrica("Marea Britanie", "str. Workington; nr. 65", 400, 7);
//        Fabrica f2 = servicii.creareFabrica("Marea Britanie", "str. Mark Twain; nr. 103", 342, 6);
//        servicii.detaliiFabrici();
//        // verificare magazine
//        Magazin m1 = servicii.creareMagazin("Austria", "str. W.A.Mozart; nr. 22", 26783, 5092);
//        Magazin m2 = servicii.creareMagazin("Germania", "str. Independentei; nr. 78", 40937, 6111);
//        servicii.detaliiMagazine();
//        // verificare sponsori
//        Sponsor sp1 = servicii.creareSponsor("Oracle", "Informatica; baze de date", 20000000, "mare; pe lateral");
//        Sponsor sp2 = servicii.creareSponsor("Telcel", "Telecomunicatii", 7000000, "pe halo si pe nasul masinii");
//        servicii.detaliiSponsori();
        List<Pilot> piloti;
        List<AltJob> altJob;
        List<StaffCursa> staffCursa;
        List<Fabrica> fabrici;
        List<Magazin> magazine;
        List<Sponsor> sponsori;
        Map<Integer, Integer> salarii;
        CitireDinFisier citireDinFisier = CitireDinFisier.getInstance();
        ServiciiAngajat serviciiAngajat = ServiciiAngajat.getInstance();
        DetaliiFabriciMagazineSponsori detaliiFabriciMagazineSponsori = DetaliiFabriciMagazineSponsori.getInstance();
        ScriereInAudit scriereInAudit = ScriereInAudit.getInstance();
        ScriereInFisierPentruAngajat scriereInFisierPentruAngajat = ScriereInFisierPentruAngajat.getInstance();
        piloti = citireDinFisier.citestePiloti();
        staffCursa = citireDinFisier.citesteStaffCursa();
        altJob = citireDinFisier.citesteAltJob();
        fabrici = citireDinFisier.citesteFabrica();
        magazine = citireDinFisier.citesteMagazin();
        sponsori = citireDinFisier.citesteSponsor();
        salarii = citireDinFisier.getSalarii();
        try {
            scriereInAudit.stergeDinAudit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Afisare detalii despre piloti");
        System.out.println("2. Afisare detalii despre staff-ul care participa la cursa");
        System.out.println("3. Afisare detalii despre cei care au alte slujbe in cadrul echipei");
        System.out.println("4. Afisare detalii despre toti angajatii intr-un fisier");
        System.out.println("5. Afisare detalii despre fabrici");
        System.out.println("6. Afisare detalii despre magazine");
        System.out.println("7. Afisare detalii despre sponsori");
        System.out.println("8. Afisare suma tuturor salariilor");
        System.out.println("9. Iesire din meniu");
        int alegere;
        alegere = scanner.nextInt();
        while (alegere != 9) {
            if (alegere == 1) {
                try {
                    serviciiAngajat.detaliiPiloti(piloti);
                    scriereInAudit.scrieInAudit("Detalii despre piloti");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (alegere == 2) {
                try {
                    serviciiAngajat.detaliiStaffCursa(staffCursa);
                    scriereInAudit.scrieInAudit("Detalii despre staff-ul din cursa");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (alegere == 3) {
                try {
                    serviciiAngajat.detaliiAltJob(altJob);
                    scriereInAudit.scrieInAudit("Detalii despre cei care au alt job");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (alegere == 4) {
                try {
                    scriereInFisierPentruAngajat.stergereDinFisier();
                    for(int i = 0; i < piloti.size(); i++)
                        scriereInFisierPentruAngajat.afisareDateAngajatiInFisier(piloti.get(i).getClass(), piloti.get(i));
                    for(int i = 0; i < staffCursa.size(); i++)
                        scriereInFisierPentruAngajat.afisareDateAngajatiInFisier(staffCursa.get(i).getClass(), staffCursa.get(i));
                    for(int i = 0; i < altJob.size(); i++)
                        scriereInFisierPentruAngajat.afisareDateAngajatiInFisier(altJob.get(i).getClass(), altJob.get(i));
                    scriereInAudit.scrieInAudit("Detalii despre angajati scrise in fisiere");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (alegere == 5) {
                try {
                    detaliiFabriciMagazineSponsori.detaliiFabrici(fabrici);
                    scriereInAudit.scrieInAudit("Detalii despre fabricile echipei");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (alegere == 6) {
                try {
                    detaliiFabriciMagazineSponsori.detaliiMagazine(magazine);
                    scriereInAudit.scrieInAudit("Detalii despre magazinele echipei");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (alegere == 7) {
                try {
                    detaliiFabriciMagazineSponsori.detaliiSponsori(sponsori);
                    scriereInAudit.scrieInAudit("Detalii despre sponsorii echipei");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (alegere == 8) {
                try {
                    System.out.println(serviciiAngajat.salariuTotal(salarii));
                    scriereInAudit.scrieInAudit("Afisare salariilor totale din echipa");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("1. Afisare detalii despre piloti");
            System.out.println("2. Afisare detalii despre staff-ul care participa la cursa");
            System.out.println("3. Afisare detalii despre cei care au alte slujbe in cadrul echipei");
            System.out.println("4. Afisare detalii despre toti angajatii intr-un fisier");
            System.out.println("5. Afisare detalii despre fabrici");
            System.out.println("6. Afisare detalii despre magazine");
            System.out.println("7. Afisare detalii despre sponsori");
            System.out.println("8. Afisare suma tuturor salariilor");
            System.out.println("9. Iesire din meniu");
            alegere = scanner.nextInt();
        }
        try {
            scriereInAudit.scrieInAudit("Iesire din aplicatie");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

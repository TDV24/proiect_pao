package gestionareStructuraEchipaDeFormula1;

import gestionareStructuraEchipaDeFormula1.angajat.*;
import gestionareStructuraEchipaDeFormula1.conexiune.*;
import gestionareStructuraEchipaDeFormula1.entitati.*;
import gestionareStructuraEchipaDeFormula1.servicii.*;

import java.io.IOException;
import java.sql.Connection;
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
//        List<Pilot> piloti;
//        List<AltJob> altJob;
//        List<StaffCursa> staffCursa;
//        List<Fabrica> fabrici;
//        List<Magazin> magazine;
//        List<Sponsor> sponsori;
//        Map<Integer, Integer> salarii;
//        CitireDinFisier citireDinFisier = CitireDinFisier.getInstance();
//        ServiciiAngajat serviciiAngajat = ServiciiAngajat.getInstance();
//        DetaliiFabriciMagazineSponsori detaliiFabriciMagazineSponsori = DetaliiFabriciMagazineSponsori.getInstance();
//        ScriereInFisierPentruAngajat scriereInFisierPentruAngajat = ScriereInFisierPentruAngajat.getInstance();
//        piloti = citireDinFisier.citestePiloti();
//        staffCursa = citireDinFisier.citesteStaffCursa();
//        altJob = citireDinFisier.citesteAltJob();
//        fabrici = citireDinFisier.citesteFabrica();
//        magazine = citireDinFisier.citesteMagazin();
//        sponsori = citireDinFisier.citesteSponsor();
//        salarii = citireDinFisier.getSalarii();
        CreareTabele creareTabele = CreareTabele.getInstance();
        creareTabele.creareTabele();
        ScriereInAudit scriereInAudit = ScriereInAudit.getInstance();
        InserareInTabele inserareInTabele = InserareInTabele.getInstance();
        UpdateInTabele updateInTabele = UpdateInTabele.getInstance();
        DeleteInTabele deleteInTabele = DeleteInTabele.getInstance();
        CitireDinTabele citireDinTabele = CitireDinTabele.getInstance();
        try {
            scriereInAudit.stergeDinAudit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Adauga un pilot");
        System.out.println("2. Adauga o persoana ce se afla in staff-ul de cursa");
        System.out.println("3. Adauga o persoana ce are alta slujba in cadrul echipei");
        System.out.println("4. Adauga o fabrica");
        System.out.println("5. Adauga un magazin");
        System.out.println("6. Adauga un sponsor");
        System.out.println("7. Afiseaza detalii despre angajati");
        System.out.println("8. Afiseaza detalii despre fabrici");
        System.out.println("9. Afiseaza detalii despre magazine");
        System.out.println("10. Afiseaza detalii despre sponsori");
        System.out.println("11. Actualizeaza salariul unui angajat");
        System.out.println("12. Actualizeaza numarul de angajati al unei fabrici");
        System.out.println("13. Actualizaeaza numarul de articole vandute si numarul incasarilor unui magazin");
        System.out.println("14. Actualizeaza investitie unui sponsor in echipa");
        System.out.println("15. Sterge un angajat");
        System.out.println("16. Sterge o fabrica");
        System.out.println("17. Sterge un magazin");
        System.out.println("18. Sterge un sponsor");
        System.out.println("19. Afiseaza suma tuturor salariilor");
        System.out.println("20. Iesi din meniu");
        int alegere;
        System.out.println("Introduceti optiunea");
        alegere = scanner.nextInt();
        while (alegere != 20) {
            if (alegere == 1) {
                try {
                    scanner.nextLine();
                    String nume, prenume;
                    int varsta, salariu, victorii;
                    System.out.println("Nume: ");
                    nume = scanner.nextLine();
                    System.out.println("Prenume: ");
                    prenume = scanner.nextLine();
                    System.out.println("Varsta: ");
                    varsta = scanner.nextInt();
                    System.out.println("Salariu: ");
                    salariu = scanner.nextInt();
                    System.out.println("Victorii: ");
                    victorii = scanner.nextInt();
                    Pilot pilot = new Pilot(prenume, nume, varsta, salariu, victorii);
                    inserareInTabele.addAngajat(pilot);
                    scriereInAudit.scrieInAudit("Adaugare Pilot");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else if (alegere == 2) {
                try {
                    scanner.nextLine();
                    String nume, prenume;
                    int varsta, salariu, longevitate;
                    System.out.println("Nume: ");
                    nume = scanner.nextLine();
                    System.out.println("Prenume: ");
                    prenume = scanner.nextLine();
                    System.out.println("Varsta: ");
                    varsta = scanner.nextInt();
                    System.out.println("Salariu: ");
                    salariu = scanner.nextInt();
                    System.out.println("Longevitate: ");
                    longevitate = scanner.nextInt();
                    StaffCursa staffCursa = new StaffCursa(prenume, nume, varsta, salariu, longevitate);
                    inserareInTabele.addAngajat(staffCursa);
                    scriereInAudit.scrieInAudit("Adaugare un membru din staff-ul de cursa");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 3) {
                try {
                    scanner.nextLine();
                    String nume, prenume, hobby;
                    int varsta, salariu;
                    System.out.println("Nume: ");
                    nume = scanner.nextLine();
                    System.out.println("Prenume: ");
                    prenume = scanner.nextLine();
                    System.out.println("Varsta: ");
                    varsta = scanner.nextInt();
                    System.out.println("Salariu: ");
                    salariu = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Hobby: ");
                    hobby = scanner.nextLine();
                    AltJob altJob = new AltJob(prenume, nume, varsta, salariu, hobby);
                    inserareInTabele.addAngajat(altJob);
                    scriereInAudit.scrieInAudit("Adaugare un membru cu o alta slujba in echipa");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 4) {
                try {
                    scanner.nextLine();
                    String locatie, adresa;
                    int numarAngajati, suprafata;
                    System.out.println("Locatie: ");
                    locatie = scanner.nextLine();
                    System.out.println("Adresa: ");
                    adresa = scanner.nextLine();
                    System.out.println("Numar Angajati: ");
                    numarAngajati = scanner.nextInt();
                    System.out.println("Suprafata: ");
                    suprafata = scanner.nextInt();
                    Fabrica fabrica = new Fabrica(locatie, adresa, numarAngajati, suprafata);
                    inserareInTabele.addFabrica(fabrica);
                    scriereInAudit.scrieInAudit("Adaugare fabrica");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 5) {
                try {
                    scanner.nextLine();
                    String locatie, adresa;
                    int incasari, articoleVandute;
                    System.out.println("Locatie: ");
                    locatie = scanner.nextLine();
                    System.out.println("Adresa: ");
                    adresa = scanner.nextLine();
                    System.out.println("Incasari: ");
                    incasari = scanner.nextInt();
                    System.out.println("Articole Vandute: ");
                    articoleVandute = scanner.nextInt();
                    Magazin magazin = new Magazin(locatie, adresa, incasari, articoleVandute);
                    inserareInTabele.addMagazin(magazin);
                    scriereInAudit.scrieInAudit("Adaugare Magazin");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 6) {
                try {
                    scanner.nextLine();
                    String nume, domeniu, amplasareSticker;
                    int investitie;
                    System.out.println("Nume: ");
                    nume = scanner.nextLine();
                    System.out.println("Domeniu: ");
                    domeniu = scanner.nextLine();
                    System.out.println("Investitie: ");
                    investitie = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Amplasare Sticker: ");
                    amplasareSticker = scanner.nextLine();
                    Sponsor sponsor = new Sponsor(nume, domeniu, investitie, amplasareSticker);
                    inserareInTabele.addSponsor(sponsor);
                    scriereInAudit.scrieInAudit("Adaugare Sponsor");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 7) {
                try {
                    citireDinTabele.readAngajati();
                    scriereInAudit.scrieInAudit("Detalii despre angajati");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 8) {
                try {
                    citireDinTabele.readFabrici();
                    scriereInAudit.scrieInAudit("Detalii despre fabrici");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 9) {
                try {
                    citireDinTabele.readMagazine();
                    scriereInAudit.scrieInAudit("Detalii despre magazine");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 10) {
                try {
                    citireDinTabele.readSponsori();
                    scriereInAudit.scrieInAudit("Detalii despre sponsori");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 11) {
                try {
                    int salariuNou, id;
                    System.out.println("Salariu Nou: ");
                    salariuNou = scanner.nextInt();
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    updateInTabele.updateAngajat(salariuNou, id);
                    scriereInAudit.scrieInAudit("Actualizare de salariu a unui angajat");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 12) {
                try {
                    int numarAngajatiNou, id;
                    System.out.println("Numar Nou De Angajati: ");
                    numarAngajatiNou = scanner.nextInt();
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    updateInTabele.updateFabrica(numarAngajatiNou, id);
                    scriereInAudit.scrieInAudit("Actualizare numar de angajati al unei fabrici");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 13) {
                try {
                    int incasariNou, articoleVanduteNou, id;
                    System.out.println("Numar Nou De Incasari: ");
                    incasariNou = scanner.nextInt();
                    System.out.println("Numar Nou De Articole Vandute: ");
                    articoleVanduteNou = scanner.nextInt();
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    updateInTabele.updateMagazin(incasariNou, articoleVanduteNou, id);
                    scriereInAudit.scrieInAudit("Actualizare incasari si numar de articole vandute al unui magazin");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 14) {
                try {
                    int investitieNou, id;
                    System.out.println("Investitie Noua: ");
                    investitieNou = scanner.nextInt();
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    updateInTabele.updateSponsor(investitieNou, id);
                    scriereInAudit.scrieInAudit("Actualizare investie al unui sponsor");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 15) {
                try {
                    int id;
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    deleteInTabele.deleteAngajat(id);
                    scriereInAudit.scrieInAudit("Steregere angajat");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 16) {
                try {
                    int id;
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    deleteInTabele.deleteFabrica(id);
                    scriereInAudit.scrieInAudit("Steregere fabrica");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 17) {
                try {
                    int id;
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    deleteInTabele.deleteMagazin(id);
                    scriereInAudit.scrieInAudit("Steregere magazin");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 18) {
                try {
                    int id;
                    System.out.println("ID: ");
                    id = scanner.nextInt();
                    deleteInTabele.deleteSponsor(id);
                    scriereInAudit.scrieInAudit("Steregere sponsor");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (alegere == 19) {
                try {
                    System.out.println("Suma tuturor salariilor este: " + updateInTabele.sumaSalarii());
                    scriereInAudit.scrieInAudit("Afisare suma tuturor salariilor");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("1. Adauga un pilot");
            System.out.println("2. Adauga o persoana ce se afla in staff-ul de cursa");
            System.out.println("3. Adauga o persoana ce are alta slujba in cadrul echipei");
            System.out.println("4. Adauga o fabrica");
            System.out.println("5. Adauga un magazin");
            System.out.println("6. Adauga un sponsor");
            System.out.println("7. Afiseaza detalii despre angajati");
            System.out.println("8. Afiseaza detalii despre fabrici");
            System.out.println("9. Afiseaza detalii despre magazine");
            System.out.println("10. Afiseaza detalii despre sponsori");
            System.out.println("11. Actualizeaza salariul unui angajat");
            System.out.println("12. Actualizeaza numarul de angajati al unei fabrici");
            System.out.println("13. Actualizaeaza numarul de articole vandute si numarul incasarilor unui magazin");
            System.out.println("14. Actualizeaza investitie unui sponsor in echipa");
            System.out.println("15. Sterge un angajat");
            System.out.println("16. Sterge o fabrica");
            System.out.println("17. Sterge un magazin");
            System.out.println("18. Sterge un sponsor");
            System.out.println("19. Afiseaza suma tuturor salariilor");
            System.out.println("20. Iesi din meniu");
            alegere = scanner.nextInt();
        }
        try {
            scriereInAudit.scrieInAudit("Iesire din aplicatie");
        } catch (IOException e){
            e.printStackTrace();
        }
        ConexiuneBazaDeDate.closeConnection();
    }
}
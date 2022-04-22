package gestionareStructuraEchipaDeFormula1;

import gestionareStructuraEchipaDeFormula1.angajat.AltJob;
import gestionareStructuraEchipaDeFormula1.angajat.Pilot;
import gestionareStructuraEchipaDeFormula1.angajat.StaffCursa;

import static gestionareStructuraEchipaDeFormula1.Echipa.*;

public class Main {
    public static void main(String[] args) {

        Servicii servicii = new Servicii();
        Echipa echipa = getEchipa();
        // afisare date despre echipa care foloseste sistemul de gestionare
        servicii.IstorieEchipa();
        // creare de angajati noi pentru fabrica si verificarea calcului salariilor totale
        Pilot p1 = servicii.crearePilot("Max", "Verstappen", 24, 40471000, 21);
        Pilot p2 = servicii.crearePilot("Sergio", "Perez", 31, 8734000, 2);
        StaffCursa s1 = servicii.creareStaffCursa("Andy", "Chukz", 42, 64890, 10);
        StaffCursa s2 = servicii.creareStaffCursa("Christian", "Horner", 51, 980000, 15);
        AltJob a1 = servicii.creareAltJob("Ilaix", "Moriba" , 25, 36380, "pescuit");
        AltJob a2 = servicii.creareAltJob("Mikayla", "Green", 33, 52500, "plimbari lungi");
        servicii.detaliiAngajati();
        System.out.println("Salariul total al echipei in acest moment este de: " + servicii.salariuTotal());
        // verificare fabrici daca functioneaza
        Fabrica f1 = servicii.creareFabrica("Marea Britanie", "str. Workington nr. 65", 400, 7);
        Fabrica f2 = servicii.creareFabrica("Marea Britanie", "str. Mark Twain nr. 103", 342, 6);
        servicii.detaliiFabrici();
        // verificare magazine
        Magazin m1 = servicii.creareMagazin("Austria", "str. W.A.Mozart nr. 22", 26783, 5092);
        Magazin m2 = servicii.creareMagazin("Germania", "str. Independentei nr. 78", 40937, 6111);
        servicii.detaliiMagazine();
        // verificare sponsori
        Sponsor sp1 = servicii.creareSponsor("Oracle", "Informatica, baze de date", 20000000, "mare, pe lateral");
        Sponsor sp2 = servicii.creareSponsor("Telcel", "Telecomunicatii", 7000000, "pe halo si pe nasul masinii");
        servicii.detaliiSponsori();
    }
}

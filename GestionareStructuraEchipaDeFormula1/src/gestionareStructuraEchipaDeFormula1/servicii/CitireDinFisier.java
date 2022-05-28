package gestionareStructuraEchipaDeFormula1.servicii;
import gestionareStructuraEchipaDeFormula1.angajat.*;
import gestionareStructuraEchipaDeFormula1.entitati.*;
import gestionareStructuraEchipaDeFormula1.exceptii.ExceptiePilot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitireDinFisier {
    private Map<String, Integer> salarii = new HashMap<>();
    private static CitireDinFisier instanta;

    private CitireDinFisier() {
    }

    public static synchronized CitireDinFisier getInstance(){
        if(instanta == null)
        {
            instanta = new CitireDinFisier();
        }
        return instanta;
    }

    public List<Pilot> citestePiloti() {
        List<Pilot> piloti = new ArrayList<>();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("src/gestionareStructuraEchipaDeFormula1/fisiere/piloti.csv"));
            String line = buffer.readLine();
            while(line != null)
            {
                String[] vector = line.split(",");
                boolean ok = true;
                int varsta = Integer.parseInt(vector[2]);
                try{
                    if(varsta > 50) {
                        ok = false;
                        throw new ExceptiePilot("Prea batran ca sa mai concureze");
                    }
                } catch (ExceptiePilot exceptiePilot) {
                    System.out.println(exceptiePilot.getMessage());
                }
                if(ok) {
                    Pilot pilot = new Pilot(vector[0], vector[1], Integer.parseInt(vector[2]), Integer.parseInt(vector[3]), Integer.parseInt(vector[4]));
                    piloti.add(pilot);
                    salarii.put(pilot.getNume(), pilot.getSalariu());
                }
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return piloti;
    }
    public List<StaffCursa> citesteStaffCursa() {
        List<StaffCursa> staffCursa = new ArrayList<>();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("src/gestionareStructuraEchipaDeFormula1/fisiere/staffCursa.csv"));
            String line = buffer.readLine();
            while(line != null)
            {
                String[] vector = line.split(",");
                StaffCursa staff = new StaffCursa(vector[0], vector[1], Integer.parseInt(vector[2]), Integer.parseInt(vector[3]), Integer.parseInt(vector[4]));
                staffCursa.add(staff);
                salarii.put(staff.getNume(), staff.getSalariu());
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return staffCursa;
    }
    public List<AltJob> citesteAltJob() {
        List<AltJob> AltJob = new ArrayList<>();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("src/gestionareStructuraEchipaDeFormula1/fisiere/altJob.csv"));
            String line = buffer.readLine();
            while(line != null)
            {
                String[] vector = line.split(",");
                AltJob altJob = new AltJob(vector[0], vector[1], Integer.parseInt(vector[2]), Integer.parseInt(vector[3]), vector[4]);
                AltJob.add(altJob);
                salarii.put(altJob.getNume(), altJob.getSalariu());
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return AltJob;
    }
    public List<Fabrica> citesteFabrica() {
        List<Fabrica> fabrici = new ArrayList<>();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("src/gestionareStructuraEchipaDeFormula1/fisiere/fabrica.csv"));
            String line = buffer.readLine();
            while(line != null)
            {
                String[] vector = line.split(",");
                Fabrica fabrica = new Fabrica(vector[0], vector[1], Integer.parseInt(vector[2]), Integer.parseInt(vector[3]));
                fabrici.add(fabrica);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fabrici;
    }
    public List<Magazin> citesteMagazin() {
        List<Magazin> magazine = new ArrayList<>();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("src/gestionareStructuraEchipaDeFormula1/fisiere/magazin.csv"));
            String line = buffer.readLine();
            while(line != null)
            {
                String[] vector = line.split(",");
                Magazin magazin = new Magazin(vector[0], vector[1], Integer.parseInt(vector[2]), Integer.parseInt(vector[3]));
                magazine.add(magazin);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return magazine;
    }
    public List<Sponsor> citesteSponsor() {
        List<Sponsor> sponsori = new ArrayList<>();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("src/gestionareStructuraEchipaDeFormula1/fisiere/sponsor.csv"));
            String line = buffer.readLine();
            while(line != null)
            {
                String[] vector = line.split(",");
                Sponsor sponsor = new Sponsor(vector[0], vector[1], Integer.parseInt(vector[2]), vector[3]);
                sponsori.add(sponsor);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sponsori;
    }
    public Map<String, Integer> getSalarii(){
        return salarii;
    }
}

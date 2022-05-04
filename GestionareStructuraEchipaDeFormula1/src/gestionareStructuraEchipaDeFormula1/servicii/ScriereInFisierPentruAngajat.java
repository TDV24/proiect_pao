package gestionareStructuraEchipaDeFormula1.servicii;

import gestionareStructuraEchipaDeFormula1.angajat.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScriereInFisierPentruAngajat {
    private static ScriereInFisierPentruAngajat instanta;
    private static synchronized ScriereInFisierPentruAngajat getInstance(){
        if(instanta == null){
            instanta = new ScriereInFisierPentruAngajat();
        }
        return instanta;
    }
    public void stergereDinFisier() throws IOException {
        FileWriter FW = new FileWriter("src/gestionareStructuraEchipaDeFormula1/fisiere/dateAngajati.csv", false);
        BufferedWriter text = new BufferedWriter(FW);
        text.close();
        FW.close();
    }
    public <T extends Angajat> void afisareDateAngajatiInFisier(Class<T> clasa, Object obiect) throws IOException {
        FileWriter FW = new FileWriter("src/gestionareStructuraEchipaDeFormula1/fisiere/dateAngajati.csv", true);
        BufferedWriter text = new BufferedWriter(FW);
        if(clasa.toString().equals("class gestionareStructuraEchipaDeFormula1.angajat.Pilot")){
            text.write(((Pilot)obiect).getJob());
            text.write(",");
            text.write(String.valueOf(((Pilot)obiect).getIdAngajat()));
            text.write(",");
            text.write(((Pilot)obiect).getPrenume());
            text.write(",");
            text.write(((Pilot)obiect).getNume());
            text.write(",");
            text.write(String.valueOf(((Pilot)obiect).getVarsta()));
            text.write(",");
            text.write(String.valueOf(((Pilot)obiect).getSalariu()));
            text.write(",");
            text.write(String.valueOf(((Pilot)obiect).getVictorii()));
            text.write("\n");
        }
        else if(clasa.toString().equals("class gestionareStructuraEchipaDeFormula1.angajat.StaffCursa")){
            text.write(((StaffCursa)obiect).getJob());
            text.write(",");
            text.write(String.valueOf(((StaffCursa)obiect).getIdAngajat()));
            text.write(",");
            text.write(((StaffCursa)obiect).getPrenume());
            text.write(",");
            text.write(((StaffCursa)obiect).getNume());
            text.write(",");
            text.write(String.valueOf(((StaffCursa)obiect).getVarsta()));
            text.write(",");
            text.write(String.valueOf(((StaffCursa)obiect).getSalariu()));
            text.write(",");
            text.write(String.valueOf(((StaffCursa)obiect).getLongevitate()));
            text.write("\n");
        }
        else if(clasa.toString().equals("class gestionareStructuraEchipaDeFormula1.angajat.AltJob")){
            text.write(((AltJob)obiect).getJob());
            text.write(",");
            text.write(String.valueOf(((AltJob)obiect).getIdAngajat()));
            text.write(",");
            text.write(((AltJob)obiect).getPrenume());
            text.write(",");
            text.write(((AltJob)obiect).getNume());
            text.write(",");
            text.write(String.valueOf(((AltJob)obiect).getVarsta()));
            text.write(",");
            text.write(String.valueOf(((AltJob)obiect).getSalariu()));
            text.write(",");
            text.write(((AltJob)obiect).getHobby());
            text.write("\n");
        }
        text.close();
        FW.close();
    }
}

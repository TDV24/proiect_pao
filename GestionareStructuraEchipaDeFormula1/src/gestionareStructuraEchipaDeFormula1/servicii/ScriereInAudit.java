package gestionareStructuraEchipaDeFormula1.servicii;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class ScriereInAudit {
    private static ScriereInAudit instanta;
    private static synchronized ScriereInAudit getInstance() {
        if (instanta == null) {
            instanta = new ScriereInAudit();
        }
        return instanta;
    }
    public void stergeDinAudit() throws IOException {
        FileWriter FW = new FileWriter("src/gestionareStructuraEchipaDeFormula1/fisiere/audit.csv", false);
        BufferedWriter text = new BufferedWriter(FW);
        text.append("Comanda Utilizata,Ora Utilizarii\n");
        text.close();
        FW.close();
    }
    public void scrieInAudit(String comanda) throws IOException {
        FileWriter FW = new FileWriter("src/gestionareStructuraEchipaDeFormula1/fisiere/audit.csv", true);
        BufferedWriter text = new BufferedWriter(FW);
        text.append(comanda);
        text.append(",");
        text.append(String.valueOf(LocalTime.now()));
        text.append("\n");
        text.close();
        FW.close();
    }
}

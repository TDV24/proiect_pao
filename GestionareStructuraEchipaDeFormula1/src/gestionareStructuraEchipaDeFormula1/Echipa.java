package gestionareStructuraEchipaDeFormula1;

import java.util.Enumeration;

public class Echipa {

    private static String nume;
    private static int numarTrofeePiloti;
    private static int numarTrofeeConstructori;
    private static String taraDeOrigine;

    private static Echipa echipa;

    private Echipa(){
        nume = "Oracle Red Bull Racing";
        numarTrofeePiloti = 5;
        numarTrofeeConstructori = 4;
        taraDeOrigine = "Austria";
    }

    public static Echipa getEchipa(){
        if(echipa == null)
            echipa = new Echipa();
        return echipa;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarTrofeePiloti() {
        return numarTrofeePiloti;
    }

    public int getNumarTrofeeConstructori() {
        return numarTrofeeConstructori;
    }

    public String getTaraDeOrigine() {
        return taraDeOrigine;
    }

    public static void InformatiiEchipa(){
        System.out.println("Numele echipei este " + nume + ", avand "
                + numarTrofeePiloti + " trofee obtinute la piloti si " + numarTrofeeConstructori
                + " trofee castigate la constructori, fiind originara din " + taraDeOrigine);
    }
}

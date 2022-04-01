package gestionareStructuraEchipaDeFormula1;

import java.util.Enumeration;

public class Echipa {

    private static String nume;
    private static int numar_trofee_piloti;
    private static int numar_trofee_constructori;
    private static String tara_de_origine;

    private static Echipa echipa;

    private Echipa(){
        nume = "Oracle Red Bull Racing";
        numar_trofee_piloti = 5;
        numar_trofee_constructori = 4;
        tara_de_origine = "Austria";
    }

    public static Echipa getEchipa(){
        if(echipa == null)
            echipa = new Echipa();
        return echipa;
    }

    public String getNume() {
        return nume;
    }

    public int getNumar_trofee_piloti() {
        return numar_trofee_piloti;
    }

    public int getNumar_trofee_constructori() {
        return numar_trofee_constructori;
    }

    public String getTara_de_origine() {
        return tara_de_origine;
    }

    public static void detalii_echipa(){
        System.out.println("Numele echipei este " + nume + ", avand "
                + numar_trofee_piloti + " trofee obtinute la piloti si " + numar_trofee_constructori
                + " trofee castigate la constructori, fiind originara din " + tara_de_origine);
    }
}

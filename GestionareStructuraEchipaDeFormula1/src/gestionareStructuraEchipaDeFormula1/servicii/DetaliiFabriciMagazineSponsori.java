package gestionareStructuraEchipaDeFormula1.servicii;

import gestionareStructuraEchipaDeFormula1.entitati.Fabrica;
import gestionareStructuraEchipaDeFormula1.entitati.Magazin;
import gestionareStructuraEchipaDeFormula1.entitati.Sponsor;

import java.util.List;

public class DetaliiFabriciMagazineSponsori {
    private static DetaliiFabriciMagazineSponsori instanta;

    private DetaliiFabriciMagazineSponsori() {
    }

    public static synchronized DetaliiFabriciMagazineSponsori getInstance(){
        if(instanta == null)
        {
            instanta = new DetaliiFabriciMagazineSponsori();
        }
        return instanta;
    }
    public void detaliiFabrici(List<Fabrica> fabrici){
        for(int i = 0; i < fabrici.size(); i++)
        {
            System.out.println(fabrici.get(i).toString());
        }
    }
    public void detaliiMagazine(List<Magazin> magazine){
        for(int i = 0; i < magazine.size(); i++)
        {
            System.out.println(magazine.get(i).toString());
        }
    }
    public void detaliiSponsori(List<Sponsor> sponsori){
        for(int i = 0; i < sponsori.size(); i++)
        {
            System.out.println(sponsori.get(i).toString());
        }
    }
}

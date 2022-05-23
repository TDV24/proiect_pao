package gestionareStructuraEchipaDeFormula1.servicii;

import gestionareStructuraEchipaDeFormula1.angajat.AltJob;
import gestionareStructuraEchipaDeFormula1.angajat.Pilot;
import gestionareStructuraEchipaDeFormula1.angajat.StaffCursa;
import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiciiAngajat {
    private static ServiciiAngajat instanta;

    private ServiciiAngajat() {
    }

    public static synchronized ServiciiAngajat getInstance(){
        if(instanta == null)
        {
            instanta = new ServiciiAngajat();
        }
        return instanta;
    }
    public void detaliiPiloti(List<Pilot> piloti){
        for(int i = 0; i < piloti.size(); i++)
        {
            System.out.println(piloti.get(i).toString());
        }
    }
    public void detaliiStaffCursa(List<StaffCursa> staffcursa){
        for(int i = 0; i < staffcursa.size(); i++)
        {
            System.out.println(staffcursa.get(i).toString());
        }
    }
    public void detaliiAltJob(List<AltJob> altJob){
        for(int i = 0; i < altJob.size(); i++)
        {
            System.out.println(altJob.get(i).toString());
        }
    }
    public int salariuTotal(Map<Integer, Integer> salarii){
        int salariutotal = 0;
        for(Map.Entry<Integer, Integer> ang : salarii.entrySet()){
            salariutotal += ang.getValue();
        }
        return salariutotal;
    }
}

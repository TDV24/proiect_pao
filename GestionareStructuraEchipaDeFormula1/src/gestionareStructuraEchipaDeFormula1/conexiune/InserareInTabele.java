package gestionareStructuraEchipaDeFormula1.conexiune;

import gestionareStructuraEchipaDeFormula1.angajat.*;
import gestionareStructuraEchipaDeFormula1.entitati.Fabrica;
import gestionareStructuraEchipaDeFormula1.entitati.Magazin;
import gestionareStructuraEchipaDeFormula1.entitati.Sponsor;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserareInTabele {
    private static InserareInTabele inserareInTabele;
    private InserareInTabele(){

    }
    public static InserareInTabele getInstance(){
        if (inserareInTabele == null)
            inserareInTabele = new InserareInTabele();
        return inserareInTabele;
    }

    public void addAngajat(Angajat ang){
        String insert = "INSERT INTO angajati(prenume, nume, varsta, salariu, job, extra) VALUES(?, ?, ?, ?, ?, ?)";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, ang.getPrenume());
            preparedStatement.setString(2, ang.getNume());
            if (ang instanceof Pilot)
            {
                preparedStatement.setInt(3, ((Pilot) ang).getVarsta());
                preparedStatement.setInt(4, ((Pilot) ang).getSalariu());
                preparedStatement.setString(5, ((Pilot) ang).getJob());
                preparedStatement.setString(6, "Victorii: " + ((Pilot) ang).getVictorii());
            }
            if (ang instanceof StaffCursa)
            {
                preparedStatement.setInt(3, ((StaffCursa) ang).getVarsta());
                preparedStatement.setInt(4, ((StaffCursa) ang).getSalariu());
                preparedStatement.setString(5, ((StaffCursa) ang).getJob());
                preparedStatement.setString(6, "Longevitate: " + ((StaffCursa) ang).getLongevitate());
            }
            if (ang instanceof AltJob)
            {
                preparedStatement.setInt(3, ((AltJob) ang).getVarsta());
                preparedStatement.setInt(4, ((AltJob) ang).getSalariu());
                preparedStatement.setString(5, ((AltJob) ang).getJob());
                preparedStatement.setString(6, "Hobby: " + ((AltJob) ang).getHobby());
            }
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addFabrica(Fabrica fabrica){
        String insert = "INSERT INTO fabrici(locatie, adresa, numarAngajati, suprafata) VALUES(?, ?, ?, ?)";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, fabrica.getLocatie());
            preparedStatement.setString(2, fabrica.getAdresa());
            preparedStatement.setInt(3, fabrica.getNumarAngajati());
            preparedStatement.setInt(4, fabrica.getSuprafata());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addMagazin(Magazin magazin){
        String insert = "INSERT INTO magazine(locatie, adresa, incasari, articoleVandute) VALUES(?, ?, ?, ?)";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, magazin.getLocatie());
            preparedStatement.setString(2, magazin.getAdresa());
            preparedStatement.setInt(3, magazin.getIncasari());
            preparedStatement.setInt(4, magazin.getArticoleVandute());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addSponsor(Sponsor sponsor){
        String insert = "INSERT INTO sponsori(nume, domeniu, investitie, amplasareSticker) VALUES(?, ?, ?, ?)";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, sponsor.getNume());
            preparedStatement.setString(2, sponsor.getDomeniu());
            preparedStatement.setInt(3, sponsor.getInvestitie());
            preparedStatement.setString(4, sponsor.getAmplasareSticker());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

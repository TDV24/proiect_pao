package gestionareStructuraEchipaDeFormula1.conexiune;

import gestionareStructuraEchipaDeFormula1.angajat.*;
import gestionareStructuraEchipaDeFormula1.entitati.Fabrica;
import gestionareStructuraEchipaDeFormula1.entitati.Magazin;
import gestionareStructuraEchipaDeFormula1.entitati.Sponsor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class CitireDinTabele {
    private static CitireDinTabele citireDinTabele;
    private CitireDinTabele(){

    }
    public static CitireDinTabele getInstance(){
        if(citireDinTabele == null)
            citireDinTabele = new CitireDinTabele();
        return citireDinTabele;
    }

    public void readAngajati(){
        String select = "SELECT * FROM angajati";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(select);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                if(Objects.equals(resultSet.getString(6), "Pilot"))
                {
                    String victorii = resultSet.getString(7);
                    victorii = victorii.substring(victorii.length() - 2);
                    Pilot pilot = new Pilot(resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getInt(5), Integer.parseInt(victorii.trim()));
                    System.out.println(pilot);
                }
                if(Objects.equals(resultSet.getString(6), "StaffCursa"))
                {
                    String longevitate = resultSet.getString(7);
                    longevitate = longevitate.substring(longevitate.length() - 2);
                    StaffCursa staffCursa = new StaffCursa(resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getInt(5), Integer.parseInt(longevitate.trim()));
                    System.out.println(staffCursa);
                }
                if(Objects.equals(resultSet.getString(6), "AltJob"))
                {
                    String hobby = resultSet.getString(7);
                    hobby = hobby.substring(7);
                    AltJob altJob = new AltJob(resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getInt(5), hobby);
                    System.out.println(altJob);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void readFabrici(){
        String select = "SELECT * FROM fabrici";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(select);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Fabrica fabrica = new Fabrica(resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getInt(5));
                System.out.println(fabrica);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void readMagazine(){
        String select = "SELECT * FROM magazine";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(select);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Magazin magazin = new Magazin(resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getInt(5));
                System.out.println(magazin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void readSponsori(){
        String select = "SELECT * FROM sponsori";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(select);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Sponsor sponsor = new Sponsor(resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getString(5));
                System.out.println(sponsor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

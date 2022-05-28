package gestionareStructuraEchipaDeFormula1.conexiune;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateInTabele {
    private static UpdateInTabele updateInTabele;
    private UpdateInTabele(){

    }
    public static UpdateInTabele getInstance(){
        if(updateInTabele == null)
            updateInTabele = new UpdateInTabele();
        return updateInTabele;
    }
    public void updateAngajat(int salariuNou, int id){
        String update = "UPDATE angajati SET salariu=? WHERE idAngajat=?";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setInt(1, salariuNou);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateFabrica(int numarAngajatiNou, int id){
        String update = "UPDATE fabrici SET numarAngajati=? WHERE idFabrica=?";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setInt(1, numarAngajatiNou);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateMagazin(int incasariNou, int articoleVanduteNou, int id){
        String update = "UPDATE magazine SET incasari=? articoleVandute=? WHERE idMagazin=?";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setInt(1, incasariNou);
            preparedStatement.setInt(2, articoleVanduteNou);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateSponsor(int investitieNou, int id){
        String update = "UPDATE sponsori SET investitie=? WHERE idSponsor=?";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setInt(1, investitieNou);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int sumaSalarii(){
        int suma = 0 ;
        String s = "SELECT sum(salariu) FROM angajati";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(s);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
                suma = resultSet.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return suma;
    }
}

package gestionareStructuraEchipaDeFormula1.conexiune;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteInTabele {
    private static DeleteInTabele deleteInTabele;
    private DeleteInTabele(){

    }
    public static DeleteInTabele getInstance(){
        if(deleteInTabele == null)
            deleteInTabele = new DeleteInTabele();
        return deleteInTabele;
    }
    public void deleteAngajat(int id){
        String delete = "DELETE FROM angajati where idAngajat=?";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteFabrica(int id){
        String delete = "DELETE FROM fabrici where idFabrica=?";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteMagazin(int id){
        String delete = "DELETE FROM magazine where idMagazin=?";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteSponsor(int id){
        String delete = "DELETE FROM sponsori where idSponsor=?";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

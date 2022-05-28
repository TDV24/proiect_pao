package gestionareStructuraEchipaDeFormula1.conexiune;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreareTabele {
    private static CreareTabele tabele;
    private CreareTabele(){

    }

    public static CreareTabele getInstance(){
        if (tabele == null)
            tabele = new CreareTabele();
        return tabele;
    }

    public void creareTabele(){
        String createtablefabrica = "CREATE TABLE IF NOT EXISTS fabrici" +
                "(idFabrica int PRIMARY KEY AUTO_INCREMENT NOT NULL, " +
                "locatie varchar(70), " +
                "adresa varchar(70), " +
                "numarAngajati int NOT NULL, " +
                "suprafata int NOT NULL)";
        String createtablemagazin = "CREATE TABLE IF NOT EXISTS magazine" +
                "(idMagazin int PRIMARY KEY AUTO_INCREMENT NOT NULL, " +
                "locatie varchar(70), " +
                "adresa varchar(70), " +
                "incasari int NOT NULL, " +
                "articoleVandute int NOT NULL)";
        String createtablesponsori = "CREATE TABLE IF NOT EXISTS sponsori" +
                "(idSponsor int PRIMARY KEY AUTO_INCREMENT NOT NULL, " +
                "nume varchar(70), " +
                "domeniu varchar(70), " +
                "investitie int NOT NULL, " +
                "amplasareSticker varchar(70))";
        String createtableangajati = "CREATE TABLE IF NOT EXISTS angajati" +
                "(idAngajat int PRIMARY KEY AUTO_INCREMENT NOT NULL, " +
                "prenume varchar(70), " +
                "nume varchar(70), " +
                "varsta int NOT NULL, " +
                "salariu int NOT NULL, " +
                "job varchar(70), " +
                "extra varchar(70))";
        Connection connection = ConexiuneBazaDeDate.getConnection();
        try{
            Statement statement = connection.createStatement();
            statement.execute(createtablefabrica);
            statement.execute(createtablemagazin);
            statement.execute(createtablesponsori);
            statement.execute(createtableangajati);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConexiuneBazaDeDate.closeConnection();
    }
}

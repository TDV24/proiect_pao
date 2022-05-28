package gestionareStructuraEchipaDeFormula1.conexiune;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexiuneBazaDeDate {
    private static final String name = "jdbc:mysql://localhost:3307/echiparedbullracing";
    private static final String user = "root";
    private static final String password = "ciscosecpa55";
    private static Connection connection;

    private ConexiuneBazaDeDate(){

    }

    public static Connection getConnection(){
        try{
            if (connection == null || connection.isClosed())
            {
                connection = DriverManager.getConnection(name, user, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(){
        try{
            if (connection != null && !connection.isClosed())
            {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

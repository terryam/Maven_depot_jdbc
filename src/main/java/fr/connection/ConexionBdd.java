package fr.connection;
/**
 * Trois etapes pour se connecter à la bdd
 * 1- import librairie mariadb dans pomxml
 * 2- Pilote DriverManager
 * 3- end connection
 */

import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBdd {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // pilote DriverManager
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/compta",
                    "root",
                    "");
            System.out.println(connection);
            // end connection
            connection.close();
        } catch (SQLException throwables) {
            System.err.println("Connection non trouvée");
        }

    }
}

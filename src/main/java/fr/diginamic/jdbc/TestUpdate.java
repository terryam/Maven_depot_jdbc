package fr.diginamic.jdbc;

import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {
        /**
         * Connexion à la bdd
         */
        Connection connection = null;

        try {
            // chargement pilote Driver
            DriverManager.registerDriver(new Driver());

            // Création de la connexion
            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/compta",
                    "root",
                    "");

            // Opérations CRUD
            // Modifier un  fournisseur
            Statement echangeBdd = connection.createStatement();
            int nb = echangeBdd.executeUpdate("UPDATE fournisseur SET  NOM = 'La Maison des Peinture' WHERE  ID = '4'");

            if (nb>0){
                System.out.println("Succès modification");
            }

            System.out.println(connection);

            // Fermeture du crud
            echangeBdd.close();

            // fermeture de la connexion
            connection.close();
        } catch (SQLException throwables) {
            System.err.println("Connection non trouvée");
        }
    }
}

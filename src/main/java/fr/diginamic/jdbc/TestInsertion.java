package fr.diginamic.jdbc;

import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsertion {
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
                // Insérer un nouveau fournisseur
            Statement echangeBdd = connection.createStatement();
            int nb = echangeBdd.executeUpdate("INSERT INTO fournisseur (ID, NOM) VALUES ('4','La Maison de la peinture')");

            if (nb>0){
                System.out.println("Succès insertion");
            }

            System.out.println(connection);


            // fermeture de la connexion
            connection.close();
        } catch (SQLException throwables) {
            System.err.println("Connection non trouvée");
        }
    }
}

package fr.diginamic.jdbc;

import fr.diginamic.jdbc.entites.Fournisseur;
import org.mariadb.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class TestSelect {
    public static void main(String[] args) {

        // structure de stockage des fournisseurs
        ArrayList<Fournisseur> listeFournisseur = new ArrayList<>();
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
            // Selectionner les fournisseurs
            Statement echangeBdd = connection.createStatement();
            ResultSet resultat = echangeBdd.executeQuery("SELECT* FROM fournisseur");

            // Je crée une boucle pour selectionner les fournisseurs
            while (resultat.next()) {
                Integer id = resultat.getInt("ID");
                String nom = resultat.getString("NOM");

                Fournisseur fournisseur = new Fournisseur(id, nom);
                listeFournisseur.add(fournisseur);
            }
            resultat.close();

            echangeBdd.close();


            // fermeture de la connexion
            connection.close();
        } catch (SQLException throwables) {
            System.err.println("Connection non trouvée");
        }

        // J'affiche les fournisseurs
        for (Fournisseur fournisseur:listeFournisseur) {
            System.out.println(fournisseur.getNom());
        }
    }
}

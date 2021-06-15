package fr.connection;
/**
 * Configuration de la bdd à partir de ResourceBundle
 */

import java.util.ResourceBundle;

public class TestConfig {
    /**
     * On met en const l'accès à la bdd TESTCONFIG pour y accéder de n'importe où
     */
    public  static final ResourceBundle TESTCONFIG = ResourceBundle.getBundle("configurationBundle");

    public static void main(String[] args) {
        /**
         * Lecture des des données du fichier configuration
         */
        String nomAdmin = TESTCONFIG.getString("Nom");
        String pwd = TESTCONFIG.getString("pwd");
        String user = TESTCONFIG.getString("user");

        System.out.println(nomAdmin);
        System.out.println(pwd);
        System.out.println(user);

    }
}

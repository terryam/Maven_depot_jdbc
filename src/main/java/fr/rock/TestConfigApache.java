package fr.rock;
/**
 * Accès aux données du fichie de configuration avec
 * la librairie commons-configuration2
 */

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigApache {

    public static void main(String[] args) {
        Configurations configs = new Configurations();
        /**
         * try catch pour gérer les exceptions liées aux éventuelles érreurs
         */
        try {
            // accès au fichier de configuration
            Configuration configApache = configs.properties("configuration.properties");
            // accès aux éléments du fichier de configuration
            String nomAdmin = configApache.getString("Nom");
            String mailAdmin = configApache.getString("Mail");
            String urlAdmin = configApache.getString("url");

            // affichage des elements
            System.out.println(nomAdmin);
            System.out.println(mailAdmin);
            System.out.println(urlAdmin);


        }   catch (ConfigurationException e) {
            throw new RuntimeException("Fichier de configuration introuvable");
        };
    }

}

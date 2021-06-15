package fr.connection;
/**
 * Accès aux données du fichier configuration
 * en passant par le fichier xml
 */

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestconfigXML {
    public static void main(String[] args) {
        Configurations configs = new Configurations();
        try {
            Configuration configXML = configs.xml("configuration.XML");
            String nomDatabase = configXML.getString("database[@nom]");
            String nomAdmin = configXML.getString("admin.nom");
            String adresseAdminRue = configXML.getString("admin.adresse.rue");
            String nomAdminDroits = configXML.getString("admin.nom[@droits]");

            System.out.println(nomDatabase);
            System.out.println(nomAdmin);
            System.out.println(adresseAdminRue);
            System.out.println(nomAdminDroits);

        }catch (ConfigurationException e) {
            System.err.println("Fichier de configuration inexistant");
        }

        }
}

package fr.diginamic.jdbc.entites;

public class Fournisseur {
   private int id;
   private String nom;

   // Je génère un constructeur
    public Fournisseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Je gnénère mes getter et mes setter car mes attributs sont privés

    /**
     * Getter
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     * @param id
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter
     * @return id
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}

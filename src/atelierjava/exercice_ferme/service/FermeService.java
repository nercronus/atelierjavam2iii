/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.dao.FermeDAO;
import atelierjava.exercice_ferme.entite.Ferme;

/**
 *
 * @author Formation
 */
public class FermeService {

    public void inscription(String pseudo, String motdepasse) {

        if (pseudo.length() < 3 || pseudo.length() > 8) {
            throw new RuntimeException("le pseudo doit être compris entre 3 et 8 caractere");
        }
        if (!pseudo.matches("")) {
            ;
        }
        if (motdepasse.length() < 5 || motdepasse.length() > 10) {
            throw new RuntimeException("le mot de passe comprend 5 à 10 caractere");
        }
        if (!motdepasse.matches(".*[A-Z].*")) {
            throw new RuntimeException("le mot de passe à besoin d'une majuscule");
        }
        if (!motdepasse.matches(".*[0-9].*")) {
            throw new RuntimeException("le mot de passe à besoin de chiffre");
        }
        
        FermeDAO dao = new FermeDAO();
        if (dao.existe( pseudo )){
            throw new RuntimeException("ce pseudo existe déjà");
        }
        Ferme ferme = new Ferme();
        ferme.setNom(pseudo);
        ferme.setMotDePasse(motdepasse);
        dao.ajouter(ferme);
    }
}

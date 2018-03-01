/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.view.JoueurDAO;
import atelierjava.exercice_ferme.view.RessourceDAO;
import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.entite.Ressource;
import atelierjava.exercice_ferme.exception.PseudoExisteException;
import atelierjava.exercice_ferme.exception.ValidationException;

/**
 *
 * @author Formation
 */
public class JoueurService {
    
    public void ajouterRessource(long joueurID,Ressource.TypeRessource typeRessource,long quantite){
        
        
         JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.rechercher(joueurID);
       
            
            for(int i=0;i<quantite;i++){
                
                Ressource ressource = new Ressource();
                ressource.setDesignation(typeRessource);
                ressource.setJoueur(joueur);
                joueur.getRessourcesPossedees().add(ressource);
                
                RessourceDAO ressourceDAO = new RessourceDAO();
                ressourceDAO.ajouter(ressource);
            }
    }
    
    public void rejoindrePartie(long idJoueur){
        
        JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.rechercher(idJoueur);
       if (joueur.getRessourcesPossedees().isEmpty()){
           
           this.ajouterRessource(idJoueur, Ressource.TypeRessource.CAROTTE,5);
           
           this.ajouterRessource(idJoueur, Ressource.TypeRessource.BLE,5);
           
           this.ajouterRessource(idJoueur, Ressource.TypeRessource.FERMIER,2);
           
           this.ajouterRessource(idJoueur, Ressource.TypeRessource.CHEVRE, 5);
       }
    }
    
    
    
    
    public Joueur connexion(String pseudo, String motdepasse){
        
        JoueurDAO dao = new JoueurDAO();
        Joueur j = dao.rechecher(pseudo, motdepasse);
        
        return j;
    }
    
    
    
    
    public void inscription(String pseudo, String motdepasse) throws ValidationException, PseudoExisteException {

        if (pseudo.length() < 3 || pseudo.length() > 8) {
            throw new ValidationException("le pseudo doit être compris entre 3 et 8 caractere");
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
        
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe( pseudo )){
            throw new PseudoExisteException("ce pseudo existe déjà");
            
        }
        Joueur ferme = new Joueur();
        ferme.setPseudo(pseudo);
        ferme.setMotDePasse(motdepasse);
        dao.ajouter(ferme);
    }
}

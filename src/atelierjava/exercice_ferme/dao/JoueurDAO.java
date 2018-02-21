/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class JoueurDAO {
    
    public Boolean existe(String pseudo, String motdepasse){
        for (Joueur joueurAct : joueurs){
            if(joueurAct.getPseudo().equals(pseudo) && joueurAct.getMotDePasse().equals(motdepasse)){
                return true;
            }
               
        }
      return false;
    }
    

    public boolean existe(String login) {
        Joueur f = this.recherche(login);
        if (f==null) {
            return false;
        }
        return true;
        
    }

    public void ajouter(Joueur ferme) {
        
        joueurs.add( ferme );
    }
    
    public Joueur recherche(String pseudo){
        
        for ( Joueur fermeAct : joueurs){
            if(fermeAct.getPseudo().equals(pseudo)){
                return fermeAct;
            }
        }
        return null;
    }
    
    private static ArrayList<Joueur> joueurs = new ArrayList<>();
    
    
}



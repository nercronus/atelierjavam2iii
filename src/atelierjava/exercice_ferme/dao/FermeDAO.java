/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Ferme;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class FermeDAO {

    public boolean existe(String login) {
        Ferme f = this.recherche(login);
        if (f==null) {
            return false;
        }
        return true;
        
    }

    public void ajouter(Ferme ferme) {
        
        fermes.add( ferme );
    }
    
    public Ferme recherche(String pseudo){
        
        for ( Ferme fermeAct : fermes){
            if(fermeAct.getNom().equals(pseudo)){
                return fermeAct;
            }
        }
        return null;
    }
    
    private static ArrayList<Ferme> fermes = new ArrayList<>();
    
    
}



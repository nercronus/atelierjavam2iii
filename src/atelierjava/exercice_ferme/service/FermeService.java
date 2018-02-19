/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

/**
 *
 * @author Formation
 */
public class FermeService {
    public void incrcription (String pseudo, String motdepasse){
        
       if(pseudo.length()<3 || pseudo.length()>8)
          throw new RuntimeException("le pseudo doit être compris entre 3 et 8 caractere");
       
       if(motdepasse.length()<5 || motdepasse.length()>10)
           throw new RuntimeException("le mot de passe doit contenir 5 à 10 caractere");
       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service.test;

import atelierjava.exercice_ferme.service.JoueurService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class JoueurServiceTest {
    
    @Test
    public void connexionOK(){
        JoueurService service = new JoueurService();
        service.inscription("Acdkhhj", "Treyuuhh1");
        service.connexion("Acdkhhj", "Treyuuhh1");
    }
    
    @Test(expected = RuntimeException.class)
    public void connexionKO(){
        
        JoueurService service = new JoueurService();
        service.connexion("Acdkheh","Treyuuhh1");
    }

    @Test
    public void inscriptionOK(){
        JoueurService service = new JoueurService();
        service.inscription("Acdkhhh", "Treyuuhh1");
    }
    
    @Test(expected = RuntimeException.class)
    public void inscriptionKO() {

        JoueurService service = new JoueurService();
        service.inscription("abcd", "Aaaaaaaa");
    }
}

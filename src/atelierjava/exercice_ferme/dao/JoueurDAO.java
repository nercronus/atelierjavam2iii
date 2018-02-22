/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class JoueurDAO {
    
    
    public Boolean existe(String pseudo, String motdepasse){
        
      EntityManager em = Persistence.createEntityManagerFactory("PU_exerciceferme").createEntityManager();
      
      Query query = em.createQuery("select j from Joueur j where j.pseudo=:pseudoExistant and j.motDePasse=:motdepasse");
      query.setParameter("pseudoExistant", pseudo);
      query.setParameter("motDePasse", motdepasse);
      
      long nbREA = (long) query.getSingleResult();
      
      if(nbREA==0 )
          return false;
      
      return true;
    }
    

    public boolean existe(String login) {
        
    }

    public void ajouter(Joueur j) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU_exerciceferme").createEntityManager();
    
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
    }
    
    public Joueur recherche(String pseudo){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU_exerciceferme").createEntityManager();
        
        Query query = em.createQuery("select j from Joueur j where j.pseudo=:pseudoRecherche");
        query.setParameter("pseudoRecherche", pseudo);
        
        Joueur j = (Joueur) query.getSingleResult();
        return j;
    }
}



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
    
    
    public Boolean existe(String pseudo, String motDePasse){
        
      EntityManager em = Persistence.createEntityManagerFactory("PU_exerciceferme").createEntityManager();
      
      Query query = em.createQuery("select count(j) from Joueur j where j.pseudo=:pseudoExistant and j.motDePasse=:motDePasse");
      query.setParameter("pseudoExistant", pseudo);
      query.setParameter("motDePasse", motDePasse);
      
      long nbREA = (long) query.getSingleResult();
      
      if(nbREA==0 )
          return false;
      
      return true;
    }
    

    public boolean existe(String pseudo) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU_exerciceferme").createEntityManager();
        
        Query query = em.createQuery("select count(j) from Joueur j where j.pseudo=:pseudoExistant");
        query.setParameter("pseudoExistant", pseudo);
        
        long nbJoueurs = (long) query.getSingleResult();
        
        if( nbJoueurs>0 )
            return true;
        
        return false;
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



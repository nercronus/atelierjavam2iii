/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class ListTest {
    
    //@Test
    public void deleteOK(){
        ArrayList<String> prenom = new ArrayList<>();
        prenom.add("axel");
        prenom.add("thomas");
        prenom.add("gregoire");
        prenom.add("thomas");
        prenom.remove("thomas");
        System.out.println(prenom);
    }
        
        @Test
        public void removeallOK(){
        
          ArrayList<String> couleurs = new ArrayList<>();
        couleurs.add("vert");
        couleurs.add("rouge");
        couleurs.add("noir");
        ArrayList<String> couleurs2 = new ArrayList<>();
        couleurs2.add("noir");
        couleurs2.add("rouge");
        
        couleurs.removeAll(couleurs2);
            System.out.println(couleurs);
       
    }
        
    public int factorielle(int n){
        
        int res=n;
        for(int i=n-1;i>1;i--){
            res = res * i;
        }
        return res;
   }
   
    
  //@Test
    public void factorielleOK(){
        int r = factorielle(20);
        System.out.println( r );
    }
    
    //@Test
    public void mutiple2OK(){
        ArrayList<Integer> mutiples = new ArrayList<>();
        
        for(int i=1;i<2000;i++){
            mutiples.add(2*i);
        
        for(Integer mu : mutiples){
            System.out.println(mu);
        }
        }
    }
    
    //@Test
    public void addAvecIndiceOK(){
        
      ArrayList<Integer> nombresPremiers = new ArrayList<>();
      
      nombresPremiers.add(2);
      nombresPremiers.add(5);
      
      for(Integer np : nombresPremiers){
          System.out.println(np);
      }
    }
    
    //@Test
    public void removeOK(){
        
        ArrayList<String> capitale = new ArrayList<>();
        
        capitale.add("Brasilia");
        capitale.add("Havana");
        capitale.add("Karachie");
        
        for(String cap : capitale){
            System.out.println(cap);
        }
    }
    
}

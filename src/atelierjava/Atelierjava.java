/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Atelierjava {
     public static void main(String[] args) {
         
         ArrayList<String> liste = new ArrayList<>();
         
         liste.add("rouge");
         liste.add("vert");
         liste.add("jaune");
         for(int i=0; i<liste.size() ;i++){
             System.out.println( liste.get(i) );
             
         for (String couleur : liste){
            System.out.println(couleur);  
         }
         }
         }
    
    
    
    
    
     public static void mainFerme(String[] args) {
         
         Fermier f1 = new Fermier();
         f1.setNom("g");
         f1.setPrenom("goku");
         f1.setSpecialite("vigneron");
         System.out.println( f1 );
         
     }

     public static void mainVariableStatiques(String[] args) {
        
         
        Personne p1= new Personne();
        Personne p2 = new Personne();
        Personne p3 = new Personne();
        Personne p4 = new Personne();
        
        p1.setNom("aze");
        p1.setAge(2);
        p2.setNom("tyu");
        p2.setAge(99);
        p3.setNom("nwxc");
        p3.setAge(45);
        p4.setAge(0);
        p4.setNom("xxxxxx");
        
         System.out.println(p1.getNom() + p1.getAge());
         System.out.println(p2.getNom() + p2.getAge());
         System.out.println(p3.getNom() + p3.getAge());
         System.out.println(p4.getNom() + p4.getAge());
         System.out.println("agemin" + Personne.getAgeMini() + "agemaxi" + Personne.getAgeMaxi());
     
     }
    
    public static void mainAnimaux(String[] args) {
        Animal a1=new Animal();
        Animal a2=new Animal();
        
        a1.poidsEnKg = 12;
        a2.poidsEnKg = 20;
        a1.espece = "cochon";
        a2.espece = "hippopotame";
        a1.genre = "sus";
        a2.genre = "hippopotamidae";
        
        a1.afficher();
        a2.afficher();
        
        System.out.println(Animal.nbAnimaux);
        
       
        
      
    }
    
}

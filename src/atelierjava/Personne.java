/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

/**
 *
 * @author Formation
 */
public class Personne {

    private String nom;
    private int age;

    static private int ageMini = -1;
    static private int ageMaxi = 0;

    public static int getAgeMini() {
        return ageMini;
    }

    public static void setAgeMini(int ageMini) {
        Personne.ageMini = ageMini;
    }

    public static int getAgeMaxi() {
        return ageMaxi;
    }

    public static void setAgeMaxi(int ageMaxi) {
        Personne.ageMaxi = ageMaxi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age > ageMaxi) {
            Personne.ageMaxi = age;
        }

        if (Personne.ageMini == -1) {
            Personne.ageMini = age;
            if (age < Personne.ageMini) {
                Personne.ageMini = age;
            }
        }

    }

}

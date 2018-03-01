/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class EcransJeuView extends GridPane {
    
    private MiniHboxRessources MHRCarotte = new MiniHboxRessources(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelierjavam2iii\\src\\img\\carotte.jpg");
    private MiniHboxRessources MHRBle = new MiniHboxRessources(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelierjavam2iii\\src\\img\\ble.jpg");
    private MiniHboxRessources MHRFermier = new MiniHboxRessources(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelierjavam2iii\\src\\img\\fermier.jpg");
    private MiniHboxRessources MHRChevre = new MiniHboxRessources(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelierjavam2iii\\src\\img\\chevre.jpg");
    private MiniHboxRessources MHRFromage = new MiniHboxRessources(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelierjavam2iii\\src\\img\\fromage de chevre.jpg");

    public EcransJeuView() {
        this.add(MHRCarotte, 0 , 0);
        this.add(MHRBle, 1, 0);
        this.add(MHRFermier, 2, 0);
        this.add(MHRChevre, 3, 0);
        this.add(MHRFromage, 4, 0);
    }
    
    
}

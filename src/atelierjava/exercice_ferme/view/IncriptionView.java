/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import atelierjava.exercice_ferme.service.JoueurService;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class IncriptionView extends GridPane {
    
    private Label lpseudo = new Label("Pseudo");
    private TextField tfPseudo = new TextField();
    private Label lMotdepasse = new Label("Mot de passe");
    private PasswordField pfMotdepasse = new PasswordField();
    private Button bok = new Button("ok");
    
    
    public IncriptionView(BorderPane borderPaneDuParent) {
        
        this.add(lpseudo, 0, 0);
        this.add(tfPseudo, 1, 0);
        this.add(lMotdepasse, 0, 1);
        this.add(pfMotdepasse, 1, 1);
        this.add(bok, 1, 2);
        
       bok.setOnAction(e -> {
          try{
              
          String pseudoEntre = tfPseudo.getText();
          String MotdepasseEntre = pfMotdepasse.getText();
          
           JoueurService JR = new JoueurService();
           JR.inscription(pseudoEntre,MotdepasseEntre );
           
           borderPaneDuParent.setCenter(new Label("inscription reussie"));
           
          }catch(Exception exception){
            
              Alert alert = new Alert(Alert.AlertType.ERROR);
              alert.setTitle("Erreur");
              alert.setHeaderText("il c'est produits une erreur");
              alert.setContentText( exception.getMessage() );
              
              alert.showAndWait();
          }
          
       });
    }
}

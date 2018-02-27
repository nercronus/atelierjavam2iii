package atelierjava.exercice_ferme.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Formation
 */
public class NewFXMain extends Application {
    
    private Button bincription = new Button("incription");
    private Button bconnexion = new Button("connexion");
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        VBox vbox = new VBox();
        vbox.getChildren().add(bincription);
        vbox.getChildren().add(bconnexion);
        
        bincription.setOnAction(e -> {
            System.out.println("coucou");
            
            root.setCenter(new IncriptionView(root));
            
        });
        bconnexion.setOnAction(e -> {
            System.err.println("azerty");
            
            root.setCenter(new ConnexionView(root));
            
            
        });
        root.setTop(vbox);
        
        root.setBottom( new Label("copyright 2018 M2IIIII"));
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Zahia");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

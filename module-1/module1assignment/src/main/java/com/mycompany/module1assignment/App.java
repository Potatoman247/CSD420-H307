package com.mycompany.module1assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.File;
import java.util.Random;


/**
 * Aidan Jacoby 10/25/25
 */


public class App extends Application {

    @Override
    public void start(Stage stage) {
        Random rand = new Random();
        
        int card1 = 0;
        int card2 = 0;
        int card3 = 0;
        int card4 = 0;
        
        card1 = 1 + rand.nextInt(52);
        while (card2 == 0){
            card2 = 1 + rand.nextInt(52);
            if ( card2 == card1){
                card2 = 0;
            }
        }
        while (card2 == 0){
            card2 = 1 + rand.nextInt(52);
            if ( card2 == card1){
                card2 = 0;
            }
        }
        
        String imagePath ="cards/"+Integer.toString(card1)+".png";
        Image image = null;
        
        image = new Image(getClass().getResource(imagePath).toExternalForm());
        ImageView imageView = new ImageView(image);
        var scene = new Scene(new StackPane(), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
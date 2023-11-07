package org.openjfx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.*;

/**
 * JavaFX App
 */
public class Review extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane base = new BorderPane();

        base.setPadding(new Insets(10, 20, 10, 20));

        // GRID SET IN CENTER OF BORDER
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(100);
        gridPane.setVgap(10);

        // Grid stuff
        // Name
        Text nameLabel = new Text("Name: ");
        Text accName = new Text("Null");
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(accName, 1, 0);

        // Email
        Text emailLabel = new Text("Email: ");
        Text accEmail = new Text("Null");
        gridPane.add(emailLabel, 0, 1);
        gridPane.add(accEmail, 1, 1);

        // DOB
        Text dobLabel = new Text("Date of Birth: ");
        Text accDOB = new Text("Null");
        gridPane.add(dobLabel, 0, 2);
        gridPane.add(accDOB, 1, 2);

        // Gender
        Text genderLabel = new Text("Gender: ");
        Text accGender = new Text("Null");
        gridPane.add(genderLabel, 0, 3);
        gridPane.add(accGender, 1, 3);

        // Country of Origin
        Text countryLabel = new Text("Country of Origin: ");
        Text accCount = new Text("Null");
        gridPane.add(countryLabel, 0, 4);
        gridPane.add(accCount, 1, 4);

        // Medical History
        Text medicalLabel = new Text("Medical History: ");
        Text accMed = new Text("Null");
        gridPane.add(medicalLabel, 0, 5);
        gridPane.add(accMed, 1, 5);

        // Criminal Record
        Text crimLabel = new Text("Criminal Record: ");
        Text accCrim = new Text("Null");
        gridPane.add(crimLabel, 0, 6);
        gridPane.add(accCrim, 1, 6);

        // Reason for Entry
        Text reasonLabel = new Text("Reason for Entry: ");
        Text accReason = new Text("Null");
        gridPane.add(reasonLabel, 0, 7);
        gridPane.add(accReason, 1, 7);

        // Length of Stay
        Text lengthLabel = new Text("Length of Stay: ");
        Text accLength = new Text("Null");
        gridPane.add(lengthLabel, 0, 8);
        gridPane.add(accLength, 1, 8);

        // Username
        Text userLabel = new Text("Username: ");
        Text accUser = new Text("Null");
        gridPane.add(userLabel, 0, 9);
        gridPane.add(accUser, 1, 9);

        // Password
        Text passLabel = new Text("Password: ");
        Text accPass = new Text("Null");
        gridPane.add(passLabel, 0, 10);
        gridPane.add(accPass, 1, 10);

        // Alien Number
        Text aNumLabel = new Text("Alien Number: ");
        Text accANum = new Text("Null");
        gridPane.add(aNumLabel, 0, 11);
        gridPane.add(accANum, 1, 11);

        // ID in System
        Text idLabel = new Text("ID in System: ");
        Text accID = new Text("Null");
        gridPane.add(idLabel, 0, 12);
        gridPane.add(accID, 1, 12);

        // Status
        Text statusLabel = new Text("Current Status: ");
        Text accStatus = new Text("Null");
        gridPane.add(statusLabel, 0, 13);
        gridPane.add(accStatus, 1, 13);

        // Phone Number
        Text phoneLabel = new Text("Phone Number: ");
        Text accPhone = new Text("Null");
        gridPane.add(phoneLabel, 0, 14);
        gridPane.add(accPhone, 1, 14);

        // Additional Information
        Text extraLabel = new Text("Additional Information: ");
        Text accExtra = new Text("Null");
        gridPane.add(extraLabel, 0, 15);
        gridPane.add(accExtra, 1, 15);

        BorderPane.setAlignment(gridPane, Pos.CENTER);
        base.setCenter(gridPane);

        // BORDER BOTTOM
        HBox bar = new HBox(10);
        bar.setPrefWidth(100);
        bar.setAlignment(Pos.CENTER);
        Button nextApplicationButton = new Button("Next Application");
        Button runTestButton = new Button("Run Tests");

        runTestButton.setMinWidth(bar.getPrefWidth());
        nextApplicationButton.setMinWidth(bar.getPrefWidth());
        bar.getChildren().addAll(runTestButton, nextApplicationButton);
        BorderPane.setAlignment(bar, Pos.CENTER);
        base.setBottom(bar);

        var scene = new Scene(base, 700, 700);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}

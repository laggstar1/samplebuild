package org.openjfx;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;  
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.*;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        ArrayList<Account> acc = new ArrayList<>();

        acc.add(Account.addAccount("Feddy Faber", "urmom@gmail.com", LocalDate.now(), 0, "USA", "None", new CriminalRecord(), 0, "None", "None", "None", new PhoneNumber(1, 123456789), "None"));


        GridPane grid = new GridPane(640, 680);

        // Setting column and row gap
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));


        // Account Variable Headers

        // Name
        Text nameLabel = new Text("Name: ");
        Text accName = new Text(acc.get(0).getName());
        grid.add(nameLabel, 0, 0);
        grid.add(accName, 1, 0);

        // Email
        Text emailLabel = new Text("Email: ");
        Text accEmail = new Text(acc.get(0).getEmail());
        grid.add(emailLabel, 0, 1);
        grid.add(accEmail, 1, 1);

        // DOB
        Text dobLabel = new Text("Date of Birth: ");
        Text accDOB = new Text("None");
        grid.add(dobLabel, 0, 2);
        grid.add(accDOB, 1, 2);

        // Gender
        Text genderLabel = new Text("Gender: ");
        Text accGender = new Text("None");
        grid.add(genderLabel, 0, 3);
        grid.add(accGender, 1, 3);

        // Country of Origin
        Text countryLabel = new Text("Country of Origin: ");
        Text accCount = new Text("Null");
        grid.add(countryLabel, 0, 4);
        grid.add(accCount, 1, 4);

        // Medical History
        Text medicalLabel = new Text("Medical History: ");
        Text accMed = new Text("Null");
        grid.add(medicalLabel, 0, 5);
        grid.add(accMed, 1, 5);

        // Criminal Record
        Text crimLabel = new Text("Criminal Record: ");
        Text accCrim = new Text("Null");
        grid.add(crimLabel, 0, 6);
        grid.add(accCrim, 1, 6);

        // Reason for Entry
        Text reasonLabel = new Text("Reason for Entry: ");
        Text accReason = new Text("Null");
        grid.add(reasonLabel, 0, 7);
        grid.add(accReason, 1, 7);

        // Length of Stay
        Text lengthLabel = new Text("Length of Stay: ");
        Text accLength = new Text("Null");
        grid.add(lengthLabel, 0, 8);
        grid.add(accLength, 1, 8);

        // Username
        Text userLabel = new Text("Username: ");
        Text accUser = new Text("Null");
        grid.add(userLabel, 0, 9);
        grid.add(accUser, 1, 9);

        // Password
        Text passLabel = new Text("Password: ");
        Text accPass = new Text("Null");
        grid.add(passLabel, 0, 10);
        grid.add(accPass, 1, 10);

        // Alien Number
        Text aNumLabel = new Text("Alien Number: ");
        Text accANum = new Text("Null");
        grid.add(aNumLabel, 0, 11);
        grid.add(accANum, 1, 11);

        // ID in System
        Text idLabel = new Text("ID in System: ");
        Text accID = new Text("Null");
        grid.add(idLabel, 0, 12);
        grid.add(accID, 1, 12);

        // Status
        Text statusLabel = new Text("Current Status: ");
        Text accStatus = new Text(acc.get(0).getStatus().toString());
        grid.add(statusLabel, 0, 13);
        grid.add(accStatus, 1, 13);

        // Phone Number
        Text phoneLabel = new Text("Phone Number: ");
        Text accPhone = new Text("Null");
        grid.add(phoneLabel, 0, 14);
        grid.add(accPhone, 1, 14);

        // Additional Information
        Text extraLabel = new Text("Additional Information: ");
        Text accExtra = new Text("Null");
        grid.add(extraLabel, 0, 15);
        grid.add(accExtra, 1, 15);


        stage.setTitle("Account Approval Form");
        Button btnApprove = new Button("Approve");
        btnApprove.setOnAction( e -> { 
            acc.get(0).setStatus(Status.DONE);
            accStatus.setText(acc.get(0).getStatus().toString());
        });
        Button btnReject = new Button("Reject");
        btnReject.setOnAction( e -> { 
            acc.get(0).setStatus(Status.FAIL);
            accStatus.setText(acc.get(0).getStatus().toString());
        });
        ButtonBar bar = new ButtonBar();
        bar.getButtons().addAll(btnApprove, btnReject);

        grid.add(bar, 0, 16, 1, 1);

        

        // Column constraints
        

        

        grid.setAlignment(Pos.CENTER);

        // Creation of dummy Account business object here

        
        var scene = new Scene(grid, 640, 480);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
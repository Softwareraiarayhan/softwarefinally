
package com.example.sw_final;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

import static com.example.sw_final.WelcomeControl.logger;


public class AdminControll {
    public static boolean requestclicked=true;


    @FXML
    private Button addhouse;

    @FXML
    private Button modifyhouse;

    @FXML
    private Button request;

    @FXML
    private Button reservation;

    @FXML
    void addhouses(MouseEvent event) {
        try {
            NextPage.make("hello-view.fxml","Houses");

        }
        catch (IOException e) {
            logger.log(null, "An error occurred while opening a new window:");
        }
    }

    @FXML
    void modifyhouses(MouseEvent event) {


    }

    @FXML
    void requestcheck(MouseEvent event) {

    }

    @FXML
    void reservationcheck(MouseEvent event) {

    }

}


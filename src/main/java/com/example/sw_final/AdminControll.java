
package com.example.sw_final;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;
import java.util.logging.Logger;

import static com.example.sw_final.WelcomeControl.logger;


public class AdminControll {

    public static boolean requestclicked=true;
    public static boolean controlin=true;
    public static boolean modifyclicked=true;

    public static  boolean isaccept=false;
    public static  boolean isaccept2=true;



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
        try {
            Sakanat.M=0;
            NextPage.make("modify.fxml", "Houses");
        }
        catch (IOException e) {
            logger.log(null, "An error occurred while opening a new window:");
        }

       /* try {
            NextPage.make("modify_houses.fxml", "Houses");
        }
        catch (IOException e) {
            logger.log(null, "An error occurred while opening a new window:");
        }*/

    }

    @FXML
    void requestcheck(MouseEvent event) {
        Sakanat.ww=0;

            try {
                    NextPage.make("request.fxml", "Houses");
            }
            catch (IOException e) {
                logger.log(null, "An error occurred while opening a new window:");
            }

    }

    @FXML
    void reservationcheck(MouseEvent event) {

    }

}


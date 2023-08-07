package com.example.sw_final;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;


public class MyHouse implements Initializable{
    VBox houseBox;
    HouseClass house1;
    ImageView imageView;
    @FXML
    private VBox houseContainer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        populateHouses();
    }
    private void populateHouses() {

        houseContainer.getChildren().clear();

        for (  HouseClass house: Sakanat.house1) {
            house1 = house;
            createimge() ;

        }

    }
    public  void createimge() {
        if (house1.getIdOwner()==HelloController.ownerid) {
            houseBox = new VBox();
            houseBox.setSpacing(5);
            imageView = new ImageView();
            setlabel();
            houseContainer.getChildren().add(houseBox);
        }
    }
    public void setlabel()
    {

        String x=house1.getNumberhouse()+"";

        // Create labels to display house information
        Label floorLabel = new Label("Floor Number: " + x.charAt(2)+x.charAt(3)+"");
        Label apartment = new Label("Apartment Number: " +  x.charAt(4)+x.charAt(5)+x.charAt(6)+"");
        Label balconyLabel = new Label("Balcony: " + house1.getBalcony());
        Label bedroomLabel = new Label("Bedroom: " + house1.getBedroom());
        Label bathroomLabel = new Label("Bathroom: " + house1.getBathroom());
        houseBox.getChildren().addAll(
           floorLabel,apartment,    balconyLabel, bedroomLabel,bathroomLabel

        );
    }


}
























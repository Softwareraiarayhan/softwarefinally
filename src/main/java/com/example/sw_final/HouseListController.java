package com.example.sw_final;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Label;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.VBox;
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.net.URL;
        import java.util.ResourceBundle;
public class HouseListController implements Initializable {
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
        if (house1.getaccepted()) {
            houseBox = new VBox();
            houseBox.setSpacing(5);
            imageView = new ImageView();
            try {
                Image image = new Image(new FileInputStream(house1.getPicture()));
                imageView.setImage(image);
                imageView.setFitWidth(200);
                imageView.setPreserveRatio(true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            setlabel();
            houseContainer.getChildren().add(houseBox);
        }
    }


    public void setlabel()
    {
        // Create labels to display house information
        Label houseNumberLabel = new Label("House Number: " + house1.getNumberhouse());
        Label locationLabel = new Label("Location: " + house1.getLocation());
        Label priceLabel = new Label("Price: $" + house1.getPrice());
        Label servicesLabel = new Label("Services: " + house1.getServices());
        Label balconyLabel = new Label("Balcony: " + house1.getBalcony());
        Label bedroomLabel = new Label("Bedroom: " + house1.getBedroom());

        houseBox.getChildren().addAll(
                imageView, houseNumberLabel, locationLabel, priceLabel,
                servicesLabel, balconyLabel, bedroomLabel
        );
    }



}

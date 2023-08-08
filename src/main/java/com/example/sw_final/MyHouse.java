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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class MyHouse implements Initializable{
   protected static ArrayList<Integer> index = new ArrayList<>();

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
            try {
                createimge() ;
            } catch (FileNotFoundException e) {

            }

        }

    }
    public  void createimge() throws FileNotFoundException {
        if (house1.getIdOwner()==HelloController.ownerid) {
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
Label tenantuser=new Label();

        String  x=house1.getNumberhouse()+"";
for(int i=0;i<Sakanat.request.size();i++)
{
    if(house1.getNumberhouse()==Sakanat.request.get(i).getHouseNum())
    {
        tenantuser.setText(Sakanat.request.get(i).getUsername());
for(int j=0;j<Sakanat.tenant1.size();j++)
{
    if(Sakanat.tenant1.get(j).getUsername().equals(Sakanat.request.get(i).getUsername().trim()))
        index.add(j);
}
    }

    else
    {
        tenantuser.setText("This house is not Booked yet");
    }
}
for(int i=0;i<index.size();i++)
{
    if(tenantuser.getText().trim().contains("This house is not Booked yet".trim()))continue;

   else if(index.size()==1&&tenantuser.getText().trim().equals("This house is not Booked yet".trim()))
    {
        tenantuser.setText(Sakanat.tenant1.get(index.get(i)).getUsername()+" phone :"+Sakanat.tenant1.get(index.get(i)).getPhoneNumber()+"\n");
    }
   else
   tenantuser.setText(tenantuser.getText()+"  "+Sakanat.tenant1.get(index.get(i)).getUsername()+" phone :"+Sakanat.tenant1.get(index.get(i)).getPhoneNumber()+"\n");

}

        // Create labels to display house information
        Label  floorLabel = new Label("Floor Number: " + x.charAt(2)+x.charAt(3)+"");
        Label apartment = new Label("Apartment Number: " +  x.charAt(4)+x.charAt(5)+x.charAt(6)+"");
        Label balconyLabel = new Label("Balcony: " + house1.getBalcony());
        Label bedroomLabel = new Label("Bedroom: " + house1.getBedroom());
        Label bathroomLabel = new Label("Bathroom: " + house1.getBathroom());
        houseBox.getChildren().addAll(
                imageView,  floorLabel,apartment,    balconyLabel, bedroomLabel,bathroomLabel,tenantuser

        );


    }


}
























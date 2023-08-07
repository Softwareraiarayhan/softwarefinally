
package com.example.sw_final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;

import static com.example.sw_final.WelcomeControl.logger;

public class requestcontroll {
    @FXML
    private RadioButton accept;
    @FXML
    private Text numberhouse;

    @FXML
    private Button click;

    @FXML
    private Text l1;

    @FXML
    private Text l2;

    @FXML
    private Text l3;

    @FXML
    private Text l4;

    @FXML
    private Text l5;

    @FXML
    private Text l6;

    @FXML
    private ImageView l7;

    @FXML
    private Button next;

    @FXML
    private RadioButton reject;

    @FXML
    void click(ActionEvent event) {
        if(Sakanat.ww!=Sakanat.house1.size())
        {
            while (Sakanat.house1.get(Sakanat.ww).getaccepted())
                Sakanat.ww++;

            if(!Sakanat.house1.get(Sakanat.ww).getaccepted())
            {
                l1.setText(Sakanat.house1.get(Sakanat.ww).getLocation());
                l2.setText(Sakanat.house1.get(Sakanat.ww).getPrice()+"");
                l3.setText(Sakanat.house1.get(Sakanat.ww).getServices());
                l4.setText(Sakanat.house1.get(Sakanat.ww).getBedroom()+"");
                l5.setText(Sakanat.house1.get(Sakanat.ww).getBathroom()+"");
                l6.setText(Sakanat.house1.get(Sakanat.ww).getBalcony()+"");
                numberhouse.setText(Sakanat.house1.get(Sakanat.ww).getNumberhouse()+"");
                l7.setImage(new Image(Sakanat.house1.get(Sakanat.ww).getPicture()));
            }

        }
        else{
            try {
                NextPage.make("adminpage.fxml", "Houses");
            }
            catch (IOException e) {
                logger.log(null, "An error occurred while opening a new window:");
            }
        }

    }

    @FXML
    void next(ActionEvent event) {
        if(Sakanat.ww!=Sakanat.house1.size())
        {
            if(!Sakanat.house1.get(Sakanat.ww).getaccepted())
            {
                if(accept.isSelected()) {
                    Sakanat.house1.get(Sakanat.ww).setaccepted(true);
                }
                Sakanat.ww++;
                try {
                    NextPage.make("request.fxml", "Houses");
                }
                catch (IOException e) {
                    logger.log(null, "An error occurred while opening a new window:");
                }
            }

        }

    }



}
































/*package com.example.sw_final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;

import java.io.IOException;

import static com.example.sw_final.WelcomeControl.logger;

public class raiaabdullah {
    @FXML
    private RadioButton accept;

    @FXML
    private Button click;

    @FXML
    private Text l1;

    @FXML
    private Text l2;

    @FXML
    private Text l3;

    @FXML
    private Text l4;

    @FXML
    private Text l5;

    @FXML
    private Button next;

    @FXML
    private RadioButton reject;

    @FXML
    void click(ActionEvent event) {
        if(Sakanat.ww!=Sakanat.house1.size())
        {
            l1.setText(Sakanat.house1.get(Sakanat.ww).getServices());
            l2.setText(Sakanat.house1.get(Sakanat.ww).getLocation());
            l3.setText("hello");
            l4.setText("rrrrr");
            l5.setText("hhhhhhh");

        }
        else{
            try {
                NextPage.make("adminpage.fxml", "Houses");
            }
            catch (IOException e) {
                logger.log(null, "An error occurred while opening a new window:");
            }
        }

    }

    @FXML
    void next(ActionEvent event) {
if(Sakanat.ww!=Sakanat.house1.size())
{
    if(accept.isSelected()) {
        System.out.println("acccccccccccccept");

    }

    Sakanat.ww++;
    try {
        NextPage.make("request.fxml", "Houses");
    }
    catch (IOException e) {
        logger.log(null, "An error occurred while opening a new window:");
    }
}


    }

}
















/*ackage com.example.sw_final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;

public class raiaabdullah {
public  int i=0;
    @FXML
    private RadioButton accept;

    @FXML
    private Button click;

    @FXML
    private Text l1;

    @FXML
    private Text l2;

    @FXML
    private Text l3;

    @FXML
    private Text l4;

    @FXML
    private Text l5;

    @FXML
    private RadioButton reject;

    @FXML
    void click(ActionEvent event) {
        for(;i<Sakanat.house1.size();)
        {

        }

    }

}*/

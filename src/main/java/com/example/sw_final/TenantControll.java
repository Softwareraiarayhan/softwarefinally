package com.example.sw_final;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class TenantControll {

    @FXML
    private Button view;

    @FXML
    void viewhouseclick(MouseEvent event) {
        try {
            NextPage.make("HouseListView.fxml","HousesList");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

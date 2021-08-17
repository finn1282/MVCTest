package mvctest.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvctest.view.ViewFactory;

public class InsertController extends BaseController{
    
    public InsertController(ViewFactory viewfactory, String fxml) {
        super(viewfactory, fxml);
    }
    
    @FXML
    private TextField NameBox;

    @FXML
    private TextField AgeBox;
    
    @FXML
    void nextAction() {
        viewfactory.showResult();
        Stage stage = (Stage) NameBox.getScene().getWindow();
        viewfactory.close(stage);
    }
    
}
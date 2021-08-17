package mvctest.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvctest.view.ViewFactory;

public class ResultController extends BaseController {
    
    public ResultController(ViewFactory viewfactory, String fxml) {
        super(viewfactory, fxml);
    }
    
    @FXML
    private TextField NameBox;

    @FXML
    private TextField ResultBox;
    
    @FXML
    void backAction() {
        viewfactory.showInsert();
        Stage stage = (Stage) NameBox.getScene().getWindow();
        viewfactory.close(stage);
    }
    
}
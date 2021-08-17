package mvctest.view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mvctest.controller.BaseController;
import mvctest.controller.InsertController;
import mvctest.controller.ResultController;

public class ViewFactory {

    public ViewFactory() {
    }
    
    public void showInsert() {
        BaseController controller = new InsertController(this, "insertpage.fxml");
        Initialize(controller);
    }
    
    public void showResult() {
        BaseController controller = new ResultController(this, "resultpage.fxml");
        Initialize(controller);
    }
    
    private void Initialize(BaseController controller) {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource(controller.getFXML()));
        fxmlloader.setController(controller);
        Parent parent;
        try {
            parent = fxmlloader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    public void close(Stage stage) {
        stage.close();
    }
    
}
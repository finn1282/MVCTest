package mvctest;
 
import javafx.application.Application;
import javafx.stage.Stage;
import mvctest.view.ViewFactory;
 
public class MVCTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewFactory viewfactory = new ViewFactory();
        viewfactory.showInsert();
    }
}

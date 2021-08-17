package mvctest.controller;

import mvctest.view.ViewFactory;

public class BaseController {
    ViewFactory viewfactory;
    String fxml;

    public BaseController(ViewFactory viewfactory, String fxml) {
        this.viewfactory = viewfactory;
        this.fxml = fxml;
    }
    
    public String getFXML() {
        return fxml;
    }
    
}
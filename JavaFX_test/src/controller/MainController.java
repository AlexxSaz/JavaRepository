package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Person;

public class MainController {

    @FXML
    private TextField loginField;

    @FXML
    private TextField passwordField;

    public void initialize() {

    }

    public void handleSingin() {
        String login = loginField.getText();
        String password = passwordField.getText();
        Person person = new Person(login, password);
        loginField.clear();
        passwordField.clear();
    }
}
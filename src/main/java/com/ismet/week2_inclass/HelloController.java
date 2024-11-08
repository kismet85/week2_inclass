package com.ismet.week2_inclass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label distanceLabel;
    @FXML
    private Label fuelLabel;
    @FXML
    private Label resultLabel;
    @FXML
    private TextField distanceField;
    @FXML
    private TextField fuelField;
    @FXML
    private Button calculateButton;

    private ResourceBundle bundle;

    public HelloController() {
        bundle = ResourceBundle.getBundle("message", Locale.getDefault());
    }

    @FXML
    private void initialize() {

        distanceLabel.setText(bundle.getString("distance.label"));
        fuelLabel.setText(bundle.getString("fuel.label"));
        calculateButton.setText(bundle.getString("calculate.button"));
        resultLabel.setText("");
    }

    @FXML
    private void onCalculateButtonClick() {
        try {
            double distance = Double.parseDouble(distanceField.getText());
            double fuel = Double.parseDouble(fuelField.getText());
            double consumption = (fuel / distance) * 100;

            String formattedResult = String.format("%.2f", consumption);
            resultLabel.setText(String.format(bundle.getString("result.label"), formattedResult));
        } catch (NumberFormatException e) {
            resultLabel.setText(bundle.getString("invalid.input"));
        }
    }


    @FXML
    public void onbtnENClick(ActionEvent actionEvent) {
        loadLanguage("en", "UK");
    }

    @FXML
    public void onbtnFRClick(ActionEvent actionEvent) {
        loadLanguage("fr", "FR");
    }

    @FXML
    public void onbtnJPClick(ActionEvent actionEvent) {
        loadLanguage("ja", "JP");
    }

    @FXML
    public void onbtnIRClick(ActionEvent actionEvent) {
        loadLanguage("fa", "IR");
    }

    private void loadLanguage(String lang, String country) {
        Locale locale = new Locale(lang, country);
        bundle = ResourceBundle.getBundle("message", locale);
        updateLabels();
    }

    private void updateLabels() {
        distanceLabel.setText(bundle.getString("distance.label"));
        fuelLabel.setText(bundle.getString("fuel.label"));
        calculateButton.setText(bundle.getString("calculate.button"));
        resultLabel.setText("");
    }
}

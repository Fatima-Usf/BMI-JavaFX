/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author fatima
 */
public class BmiController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private JFXTextField weight;

    @FXML
    private JFXTextField height;

    @FXML
    private JFXButton btn;

    @FXML
    private JFXTextField value;

    @FXML
    private JFXTextField status;

    @FXML
    void calculate(ActionEvent event) {
        try {
            Double weightval = Double.parseDouble(weight.getText());
            Double heightval = Double.parseDouble(height.getText());
            Double bmi = weightval/((heightval/100)*(heightval/100));
            
            setResult(bmi);
        } catch(Exception e){
        //TODO 
        }
    }
    void setResult(Double bmi){
        value.setText(bmi.toString());
        if(bmi<=18.5){
            status.setText("Underweight");
        }else if (18.6<= bmi && bmi <= 24.9){
            status.setText("Normal weight");
        }else if (25 <= bmi && bmi <= 29.9){
            status.setText("Overweight");
        }else {status.setText("Obesity");}
    }
}

    


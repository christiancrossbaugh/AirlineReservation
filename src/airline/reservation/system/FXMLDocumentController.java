/*
 * Cindy Nguyen and Christian Crosser
 * COP3330C Fall 2018
 * Project: Airline Resevation
 * Description: Create a GUI application to manage flight information 
 */


package airline.reservation.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField DepCityOne;
    
     @FXML
    private TextField flightNumOne;

    @FXML
    private TextField AvailSeatsOne;
    
     @FXML
    private TextField DeptTimeOne;
    
       @FXML
    private TextField DestCityOne;

    @FXML
    private TextField ArrTimeOne;
    
     @FXML
    private TextField flightDateOne;
    
    @FXML
    void submitButtonOne(ActionEvent event) {

    }
     
    
    
     
     @FXML
    private TextField flightNumTwo;
   
    @FXML
    private TextField IdNumTwo;

    @FXML
    private TextField nameTwo;

    @FXML
    private TextArea AllPassResGivenSix;

    @FXML
    private TextField seatNumTwo;

    @FXML
    private TextField enterFlightThree;

    @FXML
    private TextArea allFlightInfoFour;

    @FXML
    private TextArea allPassResAllFlightFive;

    @FXML
    private TextField enterFlightNumSix;

    @FXML
    private TextArea seatMapAreaTwo;


   

    @FXML
    void provideInfoTwo(ActionEvent event) {

    }

    @FXML
    void processFlightInfoTwo(ActionEvent event) {

    }

    @FXML
    void showMapThree(ActionEvent event) {

    }

    @FXML
    void displayPassResSix(ActionEvent event) {

    }

    @FXML
    void exitSeven(ActionEvent event) {
    
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        
    }    
    
}

package UserGuis.Manager;

import Classes.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ReportController implements Initializable {

    @FXML
    private Label report;
    @FXML
    private Label report1;
String u = "";

public void sendInfo(String s1) {
        u = s1;
       report.setText(u + " there is no Report..");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         report1.setText("Hellooooo...........");
    }    
    
    
    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        String s = ""; 
        if(u.equals("manager")) s = "ManagerMainPanel.fxml" ;
        else s = "/UserGuis/Trainer/TrainerMainPanel.fxml";
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource(s));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserGuis.Manager;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class ManagerMainPanelController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutButtonOnClick(ActionEvent event) throws IOException {
        ButtonType yes = new ButtonType("Yes");
        ButtonType no = new ButtonType("No");
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText("Do you want to Sign Out?");
        alert.getButtonTypes().clear();
        alert.getButtonTypes().addAll(yes, no);
        Optional<ButtonType> option = alert.showAndWait();
        
        if (option.get() == null) {
            System.out.println("ERROR 404!");
        } else if (option.get() == yes) {
        Parent root = FXMLLoader.load(getClass().getResource("/ampm_gym_and_fitness/LogIn.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
        }
    }

    @FXML
    private void listOfMembersbuttonOnClick(ActionEvent event) {
        try{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("listOfAllMenebers.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
        }
        catch(Exception e)
        {
            ButtonType b = new ButtonType("Ok");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("No Scene found");
            alert.getButtonTypes().clear();
            alert.getButtonTypes().addAll(b);
            Optional<ButtonType> option = alert.showAndWait();
            if(option.get().equals(null))
            {
                System.out.println("Print 404...!!!");
            }
        }
    }
    @FXML
    private void feedBackButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("feedBack.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void reportButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("report.fxml"));
        Parent customer = loader.load();
        Scene customerScene = new Scene(customer);
        ReportController controller = loader.getController();
        controller.sendInfo("manager");
        Stage customerWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        customerWindow.setScene(customerScene);
        customerWindow.show();
    }

    @FXML
    private void updatePaymentStatusButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("UpdatePaymentStatus.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void listOfMembersButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void changePasswordButtonOnClick(ActionEvent event) {
    }
}

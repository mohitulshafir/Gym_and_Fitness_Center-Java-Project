package ampm_gym_and_fitness;


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
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private PasswordField password;

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void logInUserOnClick(ActionEvent event) throws IOException {
        String s = id.getText();
        if ( id.getText().toString().equals("1234")) // admin
        {
            if(password.getText().equals("1111"))
            {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("/UserGuis/Admin/AdminMainPanel.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Invalid Username or Password!");
                alert.showAndWait();
            }
        }
        else if ( s.charAt(0) == '2') {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("/UserGuis/Manager/ManagerMainPanel.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene2);
            window.show();
        }
        else if ( s.charAt(0) == '4') {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("/UserGuis/Member/MemberMainPanel.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene2);
            window.show();
        }
        else if ( s.charAt(0) == '3') {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("/UserGuis/Trainer/TrainerMainPanel.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene2);
            window.show();
        }
        
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Invalid Username or Password!");
            alert.showAndWait();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void forgetPassButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Forget_Passwrod.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene2);
            window.show();
    }

}

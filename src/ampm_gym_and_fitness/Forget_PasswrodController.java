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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.stage.Stage;

public class Forget_PasswrodController implements Initializable {

    @FXML    private TextField id ;
    @FXML    private Label password;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void forgetPasswrodButtonOnClick(ActionEvent event) {
        if(id.getText().charAt(0) == '1')
        {
            password.setText("Done...");
            System.out.println("Your passwrod iS " + id.getText());
        }
        else 
        {
            password.setText("ID is Incorrect ");
        }
        id.setText("");
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }

    
}

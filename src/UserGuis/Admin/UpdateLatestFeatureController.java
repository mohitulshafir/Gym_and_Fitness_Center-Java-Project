package UserGuis.Admin;

import java.io.IOException;
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class UpdateLatestFeatureController implements Initializable {

    @FXML
    private TextArea features;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMainPanel.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
        System.out.println("Working...");
        features.setText("");
        ButtonType b = new ButtonType("Ok");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("Successfully Done");
                alert.getButtonTypes().clear();
                alert.getButtonTypes().addAll(b);
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(null))
                {
                    System.out.println("Print 404...!!!");
                }
    }
    
}

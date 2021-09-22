/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserGuis.Admin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AhNAF TAzWAR
 */
public class GenerateGraphController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private ComboBox programCombo;
    @FXML
    private ComboBox graphCombo;

    ObservableList<String> programType = FXCollections.observableArrayList("GYM", "Spa", "Massage", "Parlour");
    ObservableList<String> graphType = FXCollections.observableArrayList("Line Chart", "Bar Chart", "Pie Chart");

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminMainPanel.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    @FXML
    private void generateOnClick(ActionEvent event) throws IOException {
        //Generate Graph
        String graphType = graphCombo.getSelectionModel().getSelectedItem().toString();
        if (graphType == "Line Chart") {
            Parent root = FXMLLoader.load(getClass().getResource("LineChartPanel.fxml"));
            Scene scene = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();
        } else if (graphType == "Bar Chart") {
            Parent root = FXMLLoader.load(getClass().getResource("BarChartPanel.fxml"));
            Scene scene = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();
        } else if (graphType == "Pie Chart") {
            Parent root = FXMLLoader.load(getClass().getResource("PieChartPanel.fxml"));
            Scene scene = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        programCombo.setValue("GYM");
        programCombo.setItems(programType);

        graphCombo.setValue("Line Chart");
        graphCombo.setItems(graphType);
    }

}

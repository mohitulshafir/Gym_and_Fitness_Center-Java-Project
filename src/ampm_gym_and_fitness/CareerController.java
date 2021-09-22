/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampm_gym_and_fitness;

import UserGuis.Trainer.Trainer;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AhNAF TAzWAR
 */
public class CareerController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField address;
    @FXML
    private TextField contactNumber;
    @FXML
    private TextField email;
    @FXML
    private TextArea education;
    @FXML
    private TextField experience;
    @FXML
    private TextField dateOfBirth;
    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("jobInformation.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonOnClick(ActionEvent event) throws FileNotFoundException, IOException {
        Trainer t = new Trainer(name.getText(),address.getText(),contactNumber.getText(),email.getText(),education.getText(),experience.getText(),dateOfBirth.getText()); 
        String s = t.toString();
        
        File f = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("Trainer.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            dos.writeUTF(s);
            
        } 
        catch (IOException ex) {
            
        } 
        finally 
        {
            try {
                if(dos != null) dos.close();
                
            } catch (IOException ex) {
                
            }
            
            //======================================================= show bin file
               
        f = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("Trainer.bin");
            if(!f.exists()){
                System.out.println("No File...");
            }
            else{
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
                while(true){
                    str+= dis.readUTF() + '\n';
                    System.out.println(str);
                }
            }
        } 
        catch (IOException ex) {
            //System.out.println("3333");
        } 
        finally 
        {
            try 
            {
                if(dis != null) dis.close();
                
            } catch (IOException ex) {
               
            }
        }  
        }
        name.setText("");
        address.setText("");
        contactNumber.setText("");
        dateOfBirth.setText("");
        email.setText("");
        education.setText("");
        experience.setText("");
    }

    @FXML
    private void nameMouseOnClick(MouseEvent event) {
        name.setText("");
    }

    @FXML
    private void addressMouseOnClick(MouseEvent event) {
        address.setText("");
    }

    @FXML
    private void conNumMouseOnClick(MouseEvent event) {
        contactNumber.setText("");
    }

    @FXML
    private void dobMouseOnClick(MouseEvent event) {
       dateOfBirth.setText("");
    }

    @FXML
    private void emailMouseOnClick(MouseEvent event) {
        email.setText("");
    }

    @FXML
    private void eduMouseOnClick(MouseEvent event) {
        education.setText("");
    }

    @FXML
    private void expMouseOnClick(MouseEvent event) {
        experience.setText("");
    }
    
    class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException 
        {
            super(out);
        }
        @Override
        protected void writeStreamHeader() throws IOException {
        }
        
        
        
    }
        
        
}

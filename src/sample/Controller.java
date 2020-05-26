package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField DataField;

    @FXML
    private Button FaceButton;

    @FXML
    private TextField FaceFiled;

    @FXML
    void initialize() {
         FaceButton.setOnAction(event -> {
             FaceButton.getScene().getWindow().hide();
             FXMLLoader loader = new FXMLLoader();
             loader.setLocation(getClass().getResource("/sample/signUp.fxml"));
             try {
                 loader.load();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             Parent root = loader.getRoot();
             Stage stage = new Stage();
             stage.setScene(new Scene(root));
             stage.showAndWait();
         });

    }
}

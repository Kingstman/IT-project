package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.xml.namespace.QName;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> Criminal;

    @FXML
    private Button HomeButton;

    @FXML
    private TableColumn<?, ?> Address;

    @FXML
    private TableColumn<?, ?> ID;

    @FXML
    private TableColumn<?, ?> LastName;

    @FXML
    private TableColumn<?, ?> MiddleName;

    @FXML
    private Button IzmenitButton;


    @FXML
    void initialize() {
        HomeButton.setOnAction( event -> {
            HomeButton.getScene().getWindow().hide();
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/sample/sample.fxml"));
            try {
                load.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = load.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }}




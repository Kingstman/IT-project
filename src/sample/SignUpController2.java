package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SignUpController2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button HomeButton3;

    @FXML
    void initialize() {
        assert HomeButton3 != null : "fx:id=\"HomeButton2\" was not injected: check your FXML file 'signup2.fxml'.";

    }
}

package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public javafx.scene.control.TextField numberOfChars;
    public javafx.scene.control.TextField passwordOutput;
    public javafx.scene.control.Button generate;


    @FXML
    private void AlertOne() {
        Alert a1 = new Alert(Alert.AlertType.WARNING);
        a1.setTitle("Ostrzeżenie");
        a1.setContentText("Podana liczba musi być większa niż 5 znaków!");
        a1.setHeaderText(null);
        a1.showAndWait();
    }

    @FXML
    private void AlertTwo() {
        Alert a2 = new Alert(Alert.AlertType.WARNING);
        a2.setTitle("Ostrzeżenie");
        a2.setContentText("Podana liczba musi być mniejsza niż 25 znaków!");
        a2.setHeaderText(null);
        a2.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
    public void generateRandomPassword () {

        String charArray[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "X", "Y", "Z"
                , "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "w", "x", "y", "z"
                , "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"
                , "!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};

        Integer numberToInt = Integer.valueOf(numberOfChars.getText());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberToInt; i++) {
            int index = (int) (Math.random() * charArray.length);
            sb.append(charArray[index]);
            passwordOutput.setText(String.valueOf(sb));
        }
    }

    public void generatePassword(MouseEvent mouseEvent) {
        Integer numberToInt = Integer.valueOf(numberOfChars.getText());
        if (numberToInt < 5) {
            AlertOne();
        } else if (numberToInt > 25) {
            AlertTwo();
        } else {
            generateRandomPassword();
        }

    }

}



import java.sql.Connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Connection.ConnectionClass;
import Connection.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controller {
    @FXML
    private Button submit;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField regTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField emailTextField;

    public void submitButtonOnAction() {
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            Connection connection = connectionClass.getConnection();

            String sql = "INSERT INTO user VALUES('" + nameTextField.getText() + "','" +
                    regTextField.getText() + "','"
                    + addressTextField.getText() + "','" + phoneTextField.getText() + "','" +
                    emailTextField.getText()
                    + "');";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("added");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

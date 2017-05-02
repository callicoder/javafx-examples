package javafx.example;

import javafx.scene.control.Alert;
import javafx.stage.Window;

/**
 * Created by rajeevkumarsingh on 02/05/17.
 */
public class AlertHelper {

    public static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
}

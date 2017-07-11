package javafx.example.stackpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by rajeevkumarsingh on 26/06/17.
 */
public class StackPaneApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        primaryStage.setTitle("JavaFX Built-in Layout Panes Example");
        primaryStage.setScene(new Scene(root, 600, 340));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

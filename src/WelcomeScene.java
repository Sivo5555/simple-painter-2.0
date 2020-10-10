import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WelcomeScene {

    public WelcomeScene() throws Exception
    {
        setUpScene();
    }

    public void setUpScene() throws Exception
    {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
        stage.setTitle("Simple Painter 2.0 - Добро пожаловать");
        stage.setScene(new Scene(root, 500, 500));
        stage.setResizable(false);
        stage.show();
    }

}

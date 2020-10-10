import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class CanvasScene {

    public int getScreenWidth()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();

        return (int)width;
    }

    public int getScreenHeight()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double height = screenSize.getHeight();

        return (int)height;
    }

    public void setUpScene() throws Exception
    {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("canvas.fxml"));
        stage.setTitle("Simple Painter 2.0 - Холст");
        stage.setScene(new Scene(root, getScreenWidth(), getScreenHeight()));
        stage.show();
    }

    public CanvasScene() throws Exception
    {
        setUpScene();
    }
}

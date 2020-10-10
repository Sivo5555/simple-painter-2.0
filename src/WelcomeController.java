import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class WelcomeController {

    public void setUpCanvasScene() throws Exception
    {
        new CanvasScene();
    }

    public void newPictureButAction(ActionEvent event) throws Exception {
        setUpCanvasScene();
    }

    public void loadPictureButAction(ActionEvent event) throws Exception{
        //setUpCanvasStage();
    }
}

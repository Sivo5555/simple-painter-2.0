import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class CanvasController {

    @FXML
    Canvas canvas;

    double x0,y0,x1,y1;

    Color c = Color.BLACK;
    ToolType tool = ToolType.PEN;

    public void setStartPoint(MouseEvent mouseEvent)
    {
        x0 = mouseEvent.getX();
        y0 = mouseEvent.getY();
    }

    public void setEndPoint(MouseEvent mouseEvent)
    {
        x1 = mouseEvent.getX();
        y1 = mouseEvent.getY();
    }

    public void updateStartPoint()
    {
        x0 = x1;
        y0 = y1;
    }

    public void penDraw()
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(c);
        gc.strokeLine(x0,y0,x1,y1);
        gc.stroke();
    }

    public void usePen(MouseEvent mouseEvent)
    {
        setEndPoint(mouseEvent);
        penDraw();
        updateStartPoint();
    }

    public void usePolyline()
    {

    }

    public void usePolygon()
    {

    }

    public void useTool(MouseEvent mouseEvent)
    {
        switch (tool) {
            case BRUSH:
                System.out.println("brush");
                break;
            case PEN:
                usePen(mouseEvent);
                break;
            case POLYLINE:
                System.out.println("polyline");
                break;
            case SQUARE:
                System.out.println("square");
                break;
            case OVAL:
                System.out.println("oval");
                break;
            case POLYGON:
                System.out.println("polygon");
                break;
        }
    }

    public void setUpZoomCanvasScene()
    {
        //
    }

    public void setUpZoomPictureScene()
    {
        //
    }

    public void zoomCanvas(ActionEvent actionEvent) {
        setUpZoomCanvasScene();
    }

    public void zoomPicture(ActionEvent actionEvent) {
    }

    public void mousePressedCanvas(MouseEvent mouseEvent) {
        setStartPoint(mouseEvent);
    }

    public void mouseDraggedCanvas(MouseEvent mouseEvent) {

        useTool(mouseEvent);

    }

    public void mouseMovedCanvas(MouseEvent mouseEvent) {
    }
}

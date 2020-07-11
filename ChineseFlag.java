/*Alex Bowman
 *Hw#4
 *Professor Silvestri
 *3/13
 */
 package chineseFlag;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ChineseFlag extends Application {

	@Override // Override the start method in the Application class

	public void start(Stage primaryStage) {

		// Create a scene and place it in the stage
		Scene scene = new Scene(retPane(), 600, 400);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		primaryStage.setResizable(false);
	}

	public static Pane retPane() {
		Pane pane = new Pane();
		pane.setStyle("-fx-background-color : #de2910ff");
		Image image = new Image("https://cs.stcc.edu/wp-content/uploads/2020/03/chineseflagstar.png");
		ImageView iv = new ImageView(image);
	
		
		iv.setFitHeight(6 / 20.0 * 400);
		iv.setFitWidth(6 / 30.0 * 600);
		iv.setX(2 / 30.0 * 600);
		iv.setY(2 / 20.0 * 400);
		pane.getChildren().add(iv);

		for (int i = 0; i < 4; i++) {
			ImageView imageView2 = new ImageView(image);
			imageView2.setFitHeight(2 / 20.0 * 400);
			imageView2.setPreserveRatio(true);
			imageView2.setFitWidth(2 / 30.0 * 600);
			imageView2.setRotate(30*((i!=2)?1:0));
		

			pane.getChildren().add(imageView2);

			imageView2.setX((9 + ((i == 1 || i == 2) ? 2 : 0)) / 30.0 * 600);

			imageView2.setY((1 + 2*i+((i ==2 || i == 3) ? 1 : 0)) / 20.0 * 400);

		}
		return pane;

	}

	

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

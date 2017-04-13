package application;
	
import java.io.File;
import java.io.InputStream;

import Sprites.Sprite;
import Sprites.SpriteAnimation;
import javafx.animation.Animation;
import javafx.animation.ParallelTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	private Image im;
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = new Pane();
			ParallelTransition x = new ParallelTransition();
			Sprite.initSprites();
			im = new Image(Sprite.getSprite("orc").path);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ImageView iv = new ImageView(im);
			iv.relocate(0, 0);
			
			
			
			ImageView iv1 = new ImageView(im);
			iv1.relocate(200, 200);
			
			iv.setFitWidth(200);
			iv.setPreserveRatio(true);
			iv.setSmooth(true);
			iv.setCache(true);
			iv1.setFitWidth(200);
			iv1.setPreserveRatio(true);
			iv1.setSmooth(true);
			iv1.setCache(true);
			root.getChildren().addAll(iv,iv1);
			Animation or = new SpriteAnimation(iv,Duration.millis(500),Sprite.getSprite("orc").death);
			Animation or1 = new SpriteAnimation(iv1,Duration.millis(1000),Sprite.getSprite("orc").attack);
			or.play();
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

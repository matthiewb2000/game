import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
//import javafx.animation.KeyFrame;
//import javafx.animation.KeyValue;
//import javafx.animation.Timeline;
//import javafx.util.Duration;
import javafx.scene.text.Text;
import java.io.*;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.*;
import java.util.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.input.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;




public class game extends Application {
    @Override
    public void start(Stage stage) throws  IOException {
        boolean spread = true;
        
        
        
        
        
        
        

        
        
        
        Button play=new Button();
        play.setText("play");
        play.setTranslateX(150);
        play.setTranslateY(100);
        play.setVisible(true);
        
        Button playAgain=new Button();
        playAgain.setText("play Again");
        playAgain.setTranslateX(150);
        playAgain.setTranslateY(300);
        playAgain.setVisible(false);
        
        
        final ScrollPane sc = new ScrollPane();
        
        Group root = new Group(play,playAgain);
        Scene scene = new Scene(root, 300, 600);
        stage.setTitle("Drawing stuff");
        stage.setScene(scene);
        stage.show();
        
        play.setOnAction(new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                sc.setPrefViewportWidth(300);
                sc.setPrefViewportHeight(500);
                sc.setTranslateX(0);
                sc.setTranslateY(100);
                Text v=new Text();
                v.setX(100);
                v.setY(50);
                v.setFont(Font.font("Arial", 20));
                v.setFill(Color.BLACK);
                v.setStroke(Color.BLACK);
                v.setStrokeWidth(1);
                v.setText("choose team");
                v.setVisible(true);
                sc.setContent(v);
                sc.setVbarPolicy(ScrollBarPolicy.ALWAYS);
                sc.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
                Group root2 = new Group(sc,v);
                Scene sScene = new Scene(root2, 300, 600);
                stage.setTitle("scroller");
                stage.setScene(sScene);
                stage.show();
                
            }
        });
        
        playAgain.setOnAction(new EventHandler<ActionEvent>() {
                @Override
            public void handle(ActionEvent event) {
                
                }
        });
        
        

    }
    public static void main(String args[]){
        launch(args);
        
    }
    
   }


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
import javafx.scene.layout.FlowPane;




public class game extends Application {
    @Override
    public void start(Stage stage) throws  IOException {
        boolean spread = true;
        final FlowPane container = new FlowPane();
        
        ArrayList<team>divisionI=new ArrayList<team>();
        team UCF=new team();
        divisionI.add(UCF);
        UCF.setName("Central Florida");
        UCF.setRank(12);
        UCF.setTBut(new Button());
        UCF.setAccro("CF");
        UCF.tBut.setText("Central Florida");
        UCF.tBut.setTranslateX(100-(divisionI.indexOf(UCF)*100));
        UCF.tBut.setTranslateY(50+(divisionI.indexOf(UCF)*50));
        UCF.tBut.setPrefWidth(100);
        container.getChildren().add(UCF.tBut);
        
        team Temple=new team();
        divisionI.add(Temple);
        Temple.setName("Temple");
        Temple.setRank(26);
        Temple.setTBut(new Button());
        Temple.setAccro("TPL");
        Temple.tBut.setText("Temple");
        Temple.tBut.setTranslateX(100-(divisionI.indexOf(Temple)*100));
        Temple.tBut.setTranslateY(50+(divisionI.indexOf(Temple)*50));
        Temple.tBut.setPrefWidth(100);
        container.getChildren().add(Temple.tBut);
        
        team Cincinnati=new team();
        divisionI.add(Cincinnati);
        Cincinnati.setName("Cincinnati");
        Cincinnati.setRank(27);
        Cincinnati.setTBut(new Button());
        Cincinnati.setAccro("CNC");
        Cincinnati.tBut.setText("Cincinnati");
        Cincinnati.tBut.setTranslateX(100-(divisionI.indexOf(Cincinnati)*100));
        Cincinnati.tBut.setTranslateY(50+(divisionI.indexOf(Cincinnati)*50));
        Cincinnati.tBut.setPrefWidth(100);
        container.getChildren().add(Cincinnati.tBut);

        team USF=new team();
        divisionI.add(USF);
        USF.setName("South Florida");
        USF.setRank(28);
        USF.setTBut(new Button());
        USF.setAccro("SF");
        USF.tBut.setText("South Florida");
        USF.tBut.setTranslateX(100-(divisionI.indexOf(USF)*100));
        USF.tBut.setTranslateY(50+(divisionI.indexOf(USF)*50));
        USF.tBut.setPrefWidth(100);
        container.getChildren().add(USF.tBut);
        
        team ECU=new team();
        divisionI.add(ECU);
        ECU.setName("East Carolina");
        ECU.setRank(29);
        ECU.setTBut(new Button());
        ECU.setAccro("EC");
        ECU.tBut.setText("East Carolina");
        ECU.tBut.setTranslateX(100);
        ECU.tBut.setTranslateY(50-(divisionI.indexOf(ECU)/4*25)+((divisionI.indexOf(ECU))*50));
        ECU.tBut.setPrefWidth(100);
        container.getChildren().add(ECU.tBut);
        
        team UConn=new team();
        divisionI.add(UConn);
        UConn.setName("Connecticut");
        UConn.setRank(30);
        UConn.setTBut(new Button());
        UConn.setAccro("CTT");
        UConn.tBut.setText("Connecticut");
        UConn.tBut.setTranslateX(100-((divisionI.indexOf(UConn)%4)*100));
        UConn.tBut.setTranslateY(50-(divisionI.indexOf(UConn)/4*25)+(divisionI.indexOf(UConn)*50));
        UConn.tBut.setPrefWidth(100);
        container.getChildren().add(UConn.tBut);
        
        team HOU=new team();
        divisionI.add(HOU);
        HOU.setName("Houston");
        HOU.setRank(30);
        HOU.setTBut(new Button());
        HOU.setAccro("HOU");
        HOU.tBut.setText("Houston");
        HOU.tBut.setTranslateX(100-((divisionI.indexOf(HOU)%4)*100));
        HOU.tBut.setTranslateY(50-(divisionI.indexOf(HOU)/4*25)+(divisionI.indexOf(HOU)*50));
        HOU.tBut.setPrefWidth(100);
        container.getChildren().add(HOU.tBut);
        
        team SMU=new team();
        divisionI.add(SMU);
        SMU.setName("Dallas");
        SMU.setRank(30);
        SMU.setTBut(new Button());
        SMU.setAccro("DAL");
        SMU.tBut.setText("Dallas");
        SMU.tBut.setTranslateX(100-((divisionI.indexOf(SMU)%4)*100));
        SMU.tBut.setTranslateY(50-(divisionI.indexOf(SMU)/4*25)+(divisionI.indexOf(SMU)*50));
        SMU.tBut.setPrefWidth(100);
        container.getChildren().add(SMU.tBut);
        
        team Tulane=new team();
        divisionI.add(Tulane);
        Tulane.setName("New Orleans");
        Tulane.setRank(30);
        Tulane.setTBut(new Button());
        Tulane.setAccro("NO");
        Tulane.tBut.setText("New Orleans");
        Tulane.tBut.setTranslateX(100-((divisionI.indexOf(Tulane)%4)*100));
        Tulane.tBut.setTranslateY(50-(divisionI.indexOf(Tulane)/4*25)+(divisionI.indexOf(Tulane)*50));
        Tulane.tBut.setPrefWidth(100);
        container.getChildren().add(Tulane.tBut);
        
        team Navy=new team();
        divisionI.add(Navy);
        Navy.setName("Navy");
        Navy.setRank(30);
        Navy.setTBut(new Button());
        Navy.setAccro("NAVY");
        Navy.tBut.setText("Navy");
        Navy.tBut.setTranslateX(100);
        Navy.tBut.setTranslateY(50);
        Navy.tBut.setPrefWidth(100);
        container.getChildren().add(Navy.tBut);
        
        
        
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
                sc.setPrefViewportWidth(285);
                sc.setPrefViewportHeight(1000);
                sc.setTranslateX(0);
                sc.setTranslateY(100);
                //UCF.tBut.setVisible(true);
                //Temple.tBut.setVisible(true);
                //Cincinnati.tBut.setVisible(true);
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
                sc.setContent(container);
                sc.setVbarPolicy(ScrollBarPolicy.ALWAYS);
                sc.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
                Group root2 = new Group(sc,v);
                Scene sScene = new Scene(sc, 300, 500);
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


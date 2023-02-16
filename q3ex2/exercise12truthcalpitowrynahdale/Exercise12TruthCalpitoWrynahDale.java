package exercise12truthcalpitowrynahdale;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import static javafx.scene.text.TextAlignment.CENTER;
import javafx.stage.Stage;

public class Exercise12TruthCalpitoWrynahDale extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("PSHS-MC Subject Records");
        
        //INITIALIZING VARIABLES
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
      
        Subject displayedSubject = bio;

        //INITIALIZING BORDER PANE (MAIN LAYOUT)
        BorderPane main = new BorderPane();
        Scene scene = new Scene(main, 1000, 400);
        primaryStage.setScene(scene);
        
        //HEADER (TOP)
        FlowPane headerDiv = new FlowPane();
        main.setTop(headerDiv);
        headerDiv.setBackground(new Background(new BackgroundFill(Color.web("113f92", 1.0), CornerRadii.EMPTY, Insets.EMPTY)));
        headerDiv.setAlignment(Pos.TOP_CENTER);
        headerDiv.setPadding(new Insets(20, 50, 20, 50));
        headerDiv.setHgap(20);
        
        ImageView headerlogo = new ImageView();
        headerlogo.setFitHeight(60);
        headerlogo.setFitWidth(60);
        Image pisayLogo = new Image(Exercise12TruthCalpitoWrynahDale.class.getResourceAsStream("pisay.png"));
        headerlogo.setImage(pisayLogo);
        headerDiv.getChildren().add(headerlogo);
        
        Text header = new Text("PSHS-MC Subject Records");
        header.setFont(Font.font("Times New Roman", FontWeight.BOLD, 45));
        header.setFill(Color.web("f0f1f2", 1.0));
        headerDiv.getChildren().add(header);    
        
        //CONTENT (CENTER)
        GridPane display = new GridPane();
        display.setBackground(new Background(new BackgroundFill(Color.web("f0f1f2", 1.0), CornerRadii.EMPTY, Insets.EMPTY)));
        display.setVgap(20); 
        display.setHgap(20);
        display.setAlignment(Pos.CENTER);
        main.setCenter(display);
        
        Text subject = new Text(displayedSubject.getName());
        subject.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        subject.setFill(Color.web("113f92", 1.0));
        display.add(subject, 0, 0);

        ImageView subjimg = new ImageView();
        subjimg.setFitHeight(100);
        subjimg.setFitWidth(100);
        Image subjectImage = new Image(Exercise12TruthCalpitoWrynahDale.class.getResourceAsStream(displayedSubject.getImgFileName()));
        subjimg.setImage(subjectImage);
        display.add(subjimg, 0, 2);
        
        String str1 = Double.toString(displayedSubject.getUnits());
        String str2 = Double.toString(displayedSubject.getGrade());
        Text details = new Text(str1 + " | " + str2);
        details.setFill(Color.web("113f92", 1.0));
        details.setFont(new Font("Calibri", 20));
        display.add(details, 1, 0);
        
        Button button = new Button("Next");
        display.add(button, 1, 2);
        
        //FOOTER (BOTTOM)
        FlowPane footerDiv = new FlowPane();
        main.setBottom(footerDiv);
        footerDiv.setBackground(new Background(new BackgroundFill(Color.web("113f92", 1.0), CornerRadii.EMPTY, Insets.EMPTY)));
        footerDiv.setAlignment(Pos.BOTTOM_CENTER);
        footerDiv.setPadding(new Insets(20, 50, 20, 50));
        
        Text footer = new Text("All Rights Reserved © Philippine Science High School - Main Campus");
        footer.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.ITALIC, 25));
        footer.setFill(Color.web("f0f1f2", 1.0));
        footerDiv.getChildren().add(footer);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
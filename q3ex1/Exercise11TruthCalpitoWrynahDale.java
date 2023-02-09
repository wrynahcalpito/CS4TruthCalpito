package exercise11truthcalpitowrynahdale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise11TruthCalpitoWrynahDale extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("PSHS-MC Student Records");
        
        //INITIALIZING VARIABLES
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
      
        Subject displayedSubject = chem;

        //SETTING LAYOUT
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 450, 450);
        primaryStage.setScene(scene);

        //ADDING IMAGE
        ImageView sampleImage = new ImageView();
        Image img = new         Image(Exercise11TruthCalpitoWrynahDale.class.getResourceAsStream(displayedSubject.getImgFileName()));
        sampleImage.setImage(img);
        root.getChildren().add(sampleImage);
      
        //ADDING TEXT
        Text name = new Text(displayedSubject.getName());
        name.setFill(Color.BLUE);
        name.setFont(new Font("Times New Roman", 15));
        root.getChildren().add(name);

        String str1 = Double.toString(displayedSubject.getUnits());
        Text units = new Text(" | "+str1);
        units.setFill(Color.BLUE);
        units.setFont(new Font("Calibri", 12));
        root.getChildren().add(units);

        String str2 = Double.toString(displayedSubject.getGrade());
        Text grade = new Text(" | "+str2);
        grade.setFill(Color.BLUE);
        grade.setFont(new Font("Calibri", 12));
        root.getChildren().add(grade);
        
        
        //ADDING BUTTON
        Button button = new Button("Next");
        root.getChildren().add(button);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
     
}
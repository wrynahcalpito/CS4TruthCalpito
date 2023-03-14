package exercise14truthcalpitowrynahdale;

import static exercise14truthcalpitowrynahdale.Subject.subjectList;
import java.io.FileNotFoundException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import static javafx.scene.control.ContentDisplay.GRAPHIC_ONLY;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14TruthCalpitoWrynahDale extends Application {
    
    //INITIALIZING VARIABLES
    Subject math = new Subject("Math", "math.png", 4, 1.75);
    Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
    Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
    Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
    Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
      
    volatile Subject displayedSubject = chem;
        
    BorderPane main = new BorderPane();
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("PSHS-MC Subject Records");

        //INITIALIZING BORDER PANE (MAIN LAYOUT)
        Scene scene = new Scene(main, 1000, 400);
        primaryStage.setScene(scene);
        
        main.setTop(HeaderDisplay()); 
        main.setCenter(InitialDisplay());
        main.setBottom(FooterDisplay());
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private Node InitialDisplay() {
        HBox choices = new HBox(10);
        Button[] btn = new Button[5];
                
        for(int i = 0; i < 5; i++) {
            btn[i] = new Button("Button-"+i);            
            ImageView choiceView = new ImageView();
            Image photo = new Image(Exercise14TruthCalpitoWrynahDale.class.getResourceAsStream(Subject.getSubjectList().get(i).getImgFileName()));   
            choiceView.setImage(photo);
            btn[i].setGraphic(choiceView);
            btn[i].setContentDisplay(GRAPHIC_ONLY);
            choices.getChildren().add(btn[i]);
            int j = i;
            
            btn[i].setOnAction((ActionEvent event) -> {
                displayedSubject = subjectList.get(j);
                main.setCenter(ContentDisplay());
            });
        }
        choices.setAlignment(Pos.CENTER);
        
        return choices;
    }
    
    private Pane ContentDisplay() {
        GridPane display = new GridPane();
        display.setBackground(new Background(new BackgroundFill(Color.web("f0f1f2", 1.0), CornerRadii.EMPTY, Insets.EMPTY)));
        display.setVgap(20); 
        display.setHgap(20);
        display.setAlignment(Pos.CENTER);
        
        Text subject = new Text(displayedSubject.getName());
        subject.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        subject.setFill(Color.web("113f92", 1.0));
        display.add(subject, 0, 0);

        ImageView subjimg = new ImageView();
        subjimg.setFitHeight(100);
        subjimg.setFitWidth(100);
        Image subjectImage = new Image(Exercise14TruthCalpitoWrynahDale.class.getResourceAsStream(displayedSubject.getImgFileName()));
        subjimg.setImage(subjectImage);
        display.add(subjimg, 0, 2);
        
        String str1 = Double.toString(displayedSubject.getUnits());
        String str2 = Double.toString(displayedSubject.getGrade());
        Text details = new Text(str1 + " | " + str2);
        details.setFill(Color.web("113f92", 1.0));
        details.setFont(new Font("Calibri", 20));
        display.add(details, 1, 0);

        display.add(NavDisplay(), 1, 2);
        
        return display;
    }
    
    private Pane HeaderDisplay() {
        FlowPane headerDiv = new FlowPane();
                
        headerDiv.setBackground(new Background(new BackgroundFill(Color.web("113f92", 1.0), CornerRadii.EMPTY, Insets.EMPTY)));
        headerDiv.setAlignment(Pos.TOP_CENTER);
        headerDiv.setPadding(new Insets(20, 50, 20, 50));
        headerDiv.setHgap(20);
        
        ImageView headerlogo = new ImageView();
        headerlogo.setFitHeight(60);
        headerlogo.setFitWidth(60);
        Image pisayLogo = new Image(Exercise14TruthCalpitoWrynahDale.class.getResourceAsStream("pisay.png"));
        headerlogo.setImage(pisayLogo);
        headerDiv.getChildren().add(headerlogo);
        
        Text header = new Text("PSHS-MC Subject Records");
        header.setFont(Font.font("Times New Roman", FontWeight.BOLD, 45));
        header.setFill(Color.web("f0f1f2", 1.0));
        headerDiv.getChildren().add(header);    
        
        HBox search = new HBox(20);
        TextField searchBox = new TextField("Search for subject");
        search.getChildren().add(searchBox);
        Button searchBtn = new Button("Search");
        search.getChildren().add(searchBtn);
        headerDiv.getChildren().add(search);
                
        searchBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String searchInput = searchBox.getText();
                
                if(Subject.searchSubject(searchInput)== null) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Not Found");
                    alert.setHeaderText("Error");
                    alert.setContentText("SUBJECT NOT FOUND");

                    alert.showAndWait();
                }
                else if(Subject.searchSubject(searchInput)!= null) {
                    displayedSubject = Subject.searchSubject(searchInput);
                    main.setCenter(ContentDisplay());     
                }
            }
        });
        
        return headerDiv;
    }
    
    private Node NavDisplay() {
        VBox nav = new VBox(10);
        
        Button nextBtn = new Button("Next");
        nav.getChildren().add(nextBtn);      
        
        nextBtn.setOnAction((ActionEvent event) -> {
            int i = Subject.getSubjectIndex(displayedSubject) + 1;
            
            if(i == Subject.getListLength()) {
                nextBtn.setDisable(true);
            }
            else {
                displayedSubject = subjectList.get(i);
                main.setCenter(ContentDisplay());
            }
        });
        
        Button prevBtn = new Button("Previous");
        nav.getChildren().add(prevBtn);
        
        prevBtn.setOnAction((ActionEvent event) -> {
            int j = Subject.getSubjectIndex(displayedSubject) - 1;
            
            if(j == -1) {
                prevBtn.setDisable(true);
            }
            else {
                displayedSubject = subjectList.get(j);
                main.setCenter(ContentDisplay());
            }
        });
        
        Button backBtn = new Button("Back to Home");
        nav.getChildren().add(backBtn);
        
        backBtn.setOnAction((ActionEvent event) -> {
            main.setCenter(InitialDisplay());
        });
        
        return nav;
    }
    
    private Pane FooterDisplay() {
        FlowPane footerDiv = new FlowPane();
        footerDiv.setBackground(new Background(new BackgroundFill(Color.web("113f92", 1.0), CornerRadii.EMPTY, Insets.EMPTY)));
        footerDiv.setAlignment(Pos.BOTTOM_CENTER);
        footerDiv.setPadding(new Insets(20, 50, 20, 50));
        
        Text footer = new Text("All Rights Reserved © Philippine Science High School - Main Campus");
        footer.setFont(Font.font("Times New Roman", FontWeight.LIGHT, FontPosture.ITALIC, 25));
        footer.setFill(Color.web("f0f1f2", 1.0));
        footerDiv.getChildren().add(footer);
        
        return footerDiv;
    }
}
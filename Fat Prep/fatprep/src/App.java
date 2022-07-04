import java.beans.EventHandler;
import java.io.FileReader;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.CheckBox;
// import javafx.scene.control.ComboBox;
// import javafx.scene.control.Label;
// import javafx.scene.control.ListView;
// import javafx.scene.control.RadioButton;
import javafx.scene.control.*;
import javafx.scene.layout.*;
// import javafx.scene.control.SelectionMode;
// import javafx.scene.control.TextField;
// import javafx.scene.control.ToggleGroup;
// import javafx.scene.layout.GridPane;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) throws Exception {
        // TextField txt = new TextField();
        // txt.setMaxWidth(100);

        // Button btn1 = new Button("1");
        // Button btn2 = new Button("2");
        // Button btn3 = new Button("3");
        // Button btn4 = new Button("4");
        // Button btn5 = new Button("5");
        // Button btn6 = new Button("6");
        // Button btn7 = new Button("7");
        // Button btn8 = new Button("8");
        // Button btn9 = new Button("9");
        // // HBox h1 = new HBox();
        // // HBox h2 = new HBox();
        // // HBox h3 = new HBox();
        // // VBox v = new VBox();
        // // h1.getChildren().add(btn1);
        // // h1.getChildren().add(btn2);
        // // h1.getChildren().add(btn3);
        // // h2.getChildren().add(btn4);
        // // h2.getChildren().add(btn5);
        // // h2.getChildren().add(btn6);
        // // h3.getChildren().add(btn7);
        // // h3.getChildren().add(btn8);
        // // h3.getChildren().add(btn9);
        // // v.getChildren().add(h1);
        // // v.getChildren().add(h2);
        // // v.getChildren().add(h3);

        // GridPane g = new GridPane();
        // VBox h = new VBox();
        // g.add(btn1, 0, 0);
        // g.add(btn2, 1, 0);
        // g.add(btn3, 2, 0);
        // g.add(btn4, 0, 1);
        // g.add(btn5, 1, 1);
        // g.add(btn6, 2, 1);
        // g.add(btn7, 0, 2);
        // g.add(btn8, 1, 2);
        // g.add(btn9, 2, 2);

        // g.setHgap(15);
        // g.setVgap(15);

        // h.getChildren().add(txt);
        // h.getChildren().add(g);
        // h.setSpacing(30);
        // // h.setAlignment(Pos.CENTER);

        // Scene sc = new Scene(h);
        // primarystage.setScene(sc);
        // primarystage.setTitle("Calculator");
        // primarystage.setWidth(500);
        // primarystage.setHeight(500);
        // primarystage.show();

        // //using radio button

        // Label lbl = new Label("Select your favourite subject");
        // ToggleGroup toggle = new ToggleGroup();
        // RadioButton btn1 = new RadioButton("English");
        // RadioButton btn2 = new RadioButton("Chemistry");
        // RadioButton btn3 = new RadioButton("Maths");
        // RadioButton btn4 = new RadioButton("CS");
        // btn1.setToggleGroup(toggle);
        // btn2.setToggleGroup(toggle);
        // btn3.setToggleGroup(toggle);
        // btn4.setToggleGroup(toggle);
        // VBox v = new VBox();
        // // v.getChildren().add(lbl);
        // v.getChildren().addAll(lbl, btn1, btn2, btn3, btn4);
        // Scene sc = new Scene(v);
        // primarystage.setHeight(500);
        // primarystage.setWidth(500);
        // primarystage.setTitle("Radio Button Demo");
        // primarystage.setScene(sc);
        // primarystage.show();

        // //using check box

        // Label lbl = new Label("Select your favourite subjects : ");
        // CheckBox opt1 = new CheckBox("English");
        // CheckBox opt2 = new CheckBox("Maths");
        // CheckBox opt3 = new CheckBox("DBMS");
        // CheckBox opt4 = new CheckBox("CS");
        // VBox v = new VBox();
        // v.getChildren().addAll(lbl, opt1, opt2, opt3, opt4);
        // Scene sc = new Scene(v);
        // primarystage.setTitle("Checkbox Demo");
        // primarystage.setScene(sc);
        // primarystage.show();

        // //using hyperlink :

        // Hyperlink h= new Hyperlink("http://www.....");

        // //using comboBox

        // ComboBox<String> subjects = new ComboBox<String>();
        // subjects.getItems().add("English");
        // subjects.getItems().add("Cs");
        // subjects.getItems().add("Maths");
        // subjects.getItems().add("Physics");
        // VBox v = new VBox();
        // v.getChildren().add(subjects);
        // Scene sc = new Scene(v);
        // primarystage.setScene(sc);
        // primarystage.show();

        // ListView<String> subjects = new ListView<String>();
        // subjects.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        // subjects.getItems().add("English");
        // subjects.getItems().add("physics");
        // subjects.getItems().add("chemistry");
        // subjects.getItems().add("history");
        // VBox root = new VBox();
        // // we need to add this button to this layout
        // root.getChildren().add(subjects);
        // // we need to add this layout to a scene
        // Scene sc = new Scene(root);
        // primarystage.setHeight(500);
        // primarystage.setWidth(500);
        // primarystage.setTitle("Controls Demo");
        // primarystage.setScene(sc);
        // primarystage.show();

        // // using Main menu

        // MenuBar main_menu = new MenuBar();
        // Menu Home = new Menu("Home");
        // Menu Edit = new Menu("Edit");
        // Menu Selection = new Menu("Selection");
        // Menu Help = new Menu("Help");

        // main_menu.getMenus().add(Home);
        // main_menu.getMenus().add(Edit);
        // main_menu.getMenus().add(Selection);
        // main_menu.getMenus().add(Help);

        // Menu New = new Menu("New");

        // MenuItem Save = new MenuItem("Save");
        // MenuItem Close = new MenuItem("Close");

        // MenuItem NewFile = new MenuItem("Create new file");
        // MenuItem NewFolder = new MenuItem("Create new Folder");

        // New.getItems().addAll(NewFile, NewFolder);

        // Home.getItems().addAll(New, Save, Close);

        // BorderPane b = new BorderPane();
        // b.setTop(main_menu);
        // Scene sc = new Scene(b);
        // primarystage.setScene(sc);
        // primarystage.show();

        //datepicker usage

        // DatePicker d = new DatePicker();
        // d.setOnAction(new EventHandler<ActionEvent>() {
        // @Override
        // public void handle(ActionEvent event) {
        // // TODO Auto-generated method stub
        // System.out.println(d.getValue());
        // }
        // });
        // BorderPane root = new BorderPane();
        // root.setCenter(d);
        // //add this layout to a scene
        // Scene sc = new Scene(root);
        // //set scene with primary stage
        // primarystage.setTitle("Javafx UI Control Demo");
        // primarystage.setScene(sc);
        // primarystage.setWidth(500);
        // primarystage.setHeight(500);
        // primarystage.show();

        // // Event handler

        TextField name = new TextField();
        name.setMaxWidth(300);
        PasswordField pass = new PasswordField();
        pass.setMaxWidth(300);
        Button bt1 = new Button("Click here");
        Label lbl = new Label();
        bt1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            lbl.setText("Welcome Mr. " +name.getText());
            lbl.setTextFill(Color.RED);
            lbl.setFont(new Font(32));
            }
            });
            VBox root = new VBox();
            root.getChildren().addAll(name,pass,bt1,lbl);
            //add this layout to a scene
            Scene sc = new Scene(root);
            //set scene with primary stage
            primarystage.setTitle("Javafx UI Control Demo");
            primarystage.setScene(sc);
            primarystage.setWidth(500);
            primarystage.setHeight(500);
            primarystage.show();

        
            }
        }
        
    
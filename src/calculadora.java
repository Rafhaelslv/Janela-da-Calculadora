import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class calculadora extends Application {
    public void start(Stage primaryStage){
        primaryStage.setTitle("Calculadora");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(4);
        gridPane.setVgap(5);

       Button btn1 = new Button(" 1 ");
       Button btn2 = new Button(" 2 ");
       Button btn3 = new Button(" 3 ");
       Button btn4 = new Button(" 4 ");
       Button btn5 = new Button(" 5 ");
       Button btn6 = new Button(" 6 ");
       Button btn7 = new Button(" 7 ");
       Button btn8 = new Button(" 8 ");
       Button btn9 = new Button(" 9 ");
       Button btn0 = new Button(" 0 ");
       Button btnponto = new Button(" . ");
       Button btnigual = new Button(" = ");
       Button btndiv = new Button(" / ");
       Button btnmulti = new Button(" * ");
       Button btnsoma = new Button(" + ");
       Button btnsub = new Button(" - ");
       Button btnCE = new Button(" CE ");
       TextField txtresultado = new TextField();

       gridPane.add(btn1, 1, 2);
       gridPane.add(btn2, 2, 2);
       gridPane.add(btn3, 3, 2);
       gridPane.add(btnsoma, 4, 2);
       gridPane.add(btn4, 1, 3);
       gridPane.add(btn5, 2, 3);
       gridPane.add(btn6, 3, 3);
       gridPane.add(btnsub, 4, 3);
       gridPane.add(btn7, 1, 4);
       gridPane.add(btn8, 2, 4);
       gridPane.add(btn9, 3, 4);
       gridPane.add(btnmulti, 4, 4);
       gridPane.add(btnponto, 1, 5);
       gridPane.add(btn0, 2, 5);
       gridPane.add(btnigual, 3, 5);
       gridPane.add(btndiv, 4, 5);
       gridPane.add(txtresultado, 1, 1);
       gridPane.add(btnCE, 4, 1);

       Scene scene = new Scene(gridPane, 350, 180);

       primaryStage.setScene(scene);

       primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
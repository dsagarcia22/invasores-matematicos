package juego;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // Inicializa la ventana con la escena del menu principal
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Invasores Matematicos");

        ControlEscenas sceneManager = new ControlEscenas(stage);
        sceneManager.mostrarMenuPrincipal();
    }
}

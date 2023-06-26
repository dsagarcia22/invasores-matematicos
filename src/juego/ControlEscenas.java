package juego;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.cert.CertPathValidatorException.BasicReason;

public class ControlEscenas {

    private Stage primaryStage;

    public ControlEscenas(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    // Crea la ventana principal con el archivo FXML
    public void mostrarMenuPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menuPrincipal.fxml"));
            Parent root = loader.load();

            MenuPrincipalController mainMenuController = loader.getController();
            mainMenuController.setSceneManager(this);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Crea la ventana de juego con el archivo FXML e inizializa el juego cuando es llamado
    public void mostrarVentanaJuego() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventanaJuego.fxml"));
            Parent root = loader.load();

            VentanaJuegoController gameWindowController = loader.getController();
            gameWindowController.setSceneManager(this);
            // Set up the game window controller as needed
            gameWindowController.EmpezarJuego();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Crea la ventana de Game Over con el archivo FXML
    public void mostrarVentanaGameOver() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gameOver.fxml"));
            Parent root = loader.load();

            VentanaGameOverController gameOverWindowController = loader.getController();
            gameOverWindowController.setSceneManager(this);
            // Set up the game window controller as needed

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Crea la ventana de victoria con el archivo FXML
    public void mostrarVentanaCompletado(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("completado.fxml"));
            Parent root = loader.load();

            VentanaCompletadoController victoryWindowController = loader.getController();
            victoryWindowController.setSceneManager(this);
            // Set up the game window controller as needed

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package juego;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Objects;

public class MenuPrincipalController {
    private ControlEscenas sceneManager;

    @FXML
    public TextField nombreInput;

    // Inicializa el control de escenas
    public void setSceneManager(ControlEscenas sceneManager) {
        this.sceneManager = sceneManager;
    }

    // Ejecuta el mostrar la ventaja de juego en pantalla cuando el boton es presionado
    @FXML
    private void empezarJuego() {
        if (Objects.equals(nombreInput.getText(), "")){
            sceneManager.mostrarVentanaJuego("Usuario");
        }else{
            sceneManager.mostrarVentanaJuego(nombreInput.getText());
        }

    }
}

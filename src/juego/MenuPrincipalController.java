package juego;

import javafx.fxml.FXML;
public class MenuPrincipalController {
    private ControlEscenas sceneManager;

    // Inicializa el control de escenas
    public void setSceneManager(ControlEscenas sceneManager) {
        this.sceneManager = sceneManager;
    }

    // Ejecuta el mostrar la ventaja de juego en pantalla cuando el boton es presionado
    @FXML
    private void empezarJuego() {
        sceneManager.mostrarVentanaJuego();
    }
}

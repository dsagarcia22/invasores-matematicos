package juego;

import javafx.fxml.FXML;
public class VentanaCompletadoController {
    private ControlEscenas sceneManager;

    // Inicializa el control de escenas
    public void setSceneManager(ControlEscenas sceneManager) {
        this.sceneManager = sceneManager;
    }

    // Ejecuta el mostrar el menu principal en pantalla
    @FXML
    private void irMenuPrincipal() {
        sceneManager.mostrarMenuPrincipal();
    }
}

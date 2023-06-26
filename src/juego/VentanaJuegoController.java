package juego;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class VentanaJuegoController {
    private ControlEscenas sceneManager;

    // Crea un objeto de clase juego
    Juego juego;

    // Objeto que controla la logica del juego como las vidas, niveles, y preguntas.
    @FXML
    Button opcion1;
    @FXML
    Button opcion2;
    @FXML
    Button opcion3;
    @FXML
    Label vidasTexto;
    @FXML
    Label operacionTexto;
    @FXML
    Label nivelTexto;

    // Incializa el control de escenas
    public void setSceneManager(ControlEscenas sceneManager) {
        this.sceneManager = sceneManager;
    }

    // Inicializa el objeto de clase juego y genera un nivel
    public void EmpezarJuego() {
        this.juego = new Juego();
        generarNivel();
    }

    // Genera los datos mostrados en pantalla como el nivel, numero pregunta, operacion, respuestas y vidas
    public void generarNivel() {
        nivelTexto.setText("Nivel " + juego.getNivel() + " Pregunta " + juego.getNumeroPregunta());
        vidasTexto.setText("Vidas " + juego.getVidas());
        String informacionPregunta = juego.generarPregunta();
        operacionTexto.setText(informacionPregunta);
        randomPosicionBtns(juego.getResultado());
    }

    // Randomiza la posicion del resultado y las opciones en los botones en pantalla
    private void randomPosicionBtns(int result) {
        Random random = new Random();
        List<Button> buttons = Arrays.asList(opcion1,opcion2,opcion3);
        String text1 = result + "";
        String text2 = (result + random.nextInt(100) + 1 )+ "";
        String text3 = (result - random.nextInt(100) + 1 )+ "";
        List<String> texts = Arrays.asList(text1, text2, text3);

        Collections.shuffle(texts);

        for (int i = 0; i < buttons.size(); i++) {
            Button button = buttons.get(i);
            String text = texts.get(i);
            button.setText(text);
        }
    }

    // Evento para el primer boton en pantalla, devuelve el texto que se encuentra en el boton
    @FXML
    public void opcion1Evento (ActionEvent e) {
        int opcion = Integer.parseInt(opcion1.getText());
        procesarRespuesta(opcion);
    }

    // Evento para el segundo boton en pantalla, devuelve el texto que se encuentra en el boton
    @FXML
    public void opcion2Evento (ActionEvent e) {
        int opcion = Integer.parseInt(opcion2.getText());
        procesarRespuesta(opcion);
    }

    // Evento para el ultimo boton en pantalla, devuelve el texto que se encuentra en el boton
    @FXML
    public void opcion3Evento (ActionEvent e) {
        int opcion = Integer.parseInt(opcion3.getText());
        procesarRespuesta(opcion);
    }

    // Procesa la respueta enviada por los botones con el resultado dado por el objeto de juego y actualiza los datos en pantalla dependiendo si la respuesta es correcta o no
    // Termina el juego si el nivel es 5 y 10 preguntas, o si las vidas llegan a 0
    private void procesarRespuesta(int opcion) {
        Boolean validacion = juego.validarRespuesta(opcion);
        if (!validacion) {
            juego.reducirVidas();
        }
        if (juego.getNumeroPregunta() == 10) {
            juego.setNumeroPregunta(0);
            juego.avanzarNivel();
            juego.restaurarVidas();
        }
        if (juego.getNivel() == 6) {
            ganarJuego();
        }
        if (juego.getVidas() == 0) {
            gameOver();
        }
        juego.avanzarNumberoPregunta();
        generarNivel();
    }

    // Ejecuta para mostrar la ventana de Game Over en pantalla
    @FXML
    private void gameOver() {
        sceneManager.mostrarVentanaGameOver();
    }

    // Ejecuta para mostrar la ventana de victoria en pantalla
    @FXML
    private void ganarJuego() {
        sceneManager.mostrarVentanaCompletado();
    }
}

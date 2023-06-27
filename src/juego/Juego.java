package juego;

public class Juego {
    // Datos para la pantalla y control del juego
    private int numeroPregunta;
    private int vidas;
    private int nivel;
    private int resultado;

    // Inizializa los datos para el juego
    public Juego() {
        numeroPregunta = 1;
        vidas = 5;
        nivel = 1;
    }

    // Retorna las vidas actuales
    public int getVidas() {
        return vidas;
    }

    // Reducte por 1 las vidas
    public void reducirVidas() {
        this.vidas -= 1;
    }

    // Restaura las vidas a 5
    public void restaurarVidas() {
        this.vidas = 5;
    }

    // Retorna el nivel actual
    public int getNivel() {
        return nivel;
    }

    // Avanaza por 1 el nivel
    public void avanzarNivel() {
        this.nivel += 1;
    }

    // Retorna el numero de la pregunta actual
    public int getNumeroPregunta() {
        return numeroPregunta;
    }

    // Avanza por 1 el numero de la pregunta
    public void avanzarNumberoPregunta() {
        this.numeroPregunta += 1;
    }

    // Ajusta el numero de pregunta
    public void setNumeroPregunta(int numero) {
        this.numeroPregunta = numero;
    }

    // Retorna el resultado actual
    public int getResultado() {
        return resultado;
    }

    // Ajusta el resultado
    private void setResultado(int resultado) {
        this.resultado = resultado;
    }

    // Genera una operacion de suma o resta (Proxima Actualizacion: Genera una operacion de suma, resta, multiplicacion y division dependiendo del nivel actual)
    public String generarPregunta() {
        GeneradorPregunta pregunta = new GeneradorPregunta();
        String preguntaTexto = pregunta.getOperacion(this.nivel);
        setResultado(pregunta.getSolucion());
        return preguntaTexto;
    }

    // Valida la opcion recivida con la respuesta actual
    public Boolean validarRespuesta(int opcion) {
        if (opcion == getResultado()) {
            return true;
        }
        return false;
    }
}

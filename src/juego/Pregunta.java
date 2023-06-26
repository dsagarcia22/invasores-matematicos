package juego;

import java.util.Random;

public class Pregunta {

    // Datos para la operacion
    private int operando1;
    private int operando2;
    private int operador;
    private int resultado;

    // Inicializa los datos de la operacion
    public Pregunta() {
        operando1 = generarNumeroRandom();
        operando2 = generarNumeroRandom();
        operador = generarOperacionRandom();

        if (operador == 0) {
            resultado = operando1 + operando2;
        } else {
            resultado = operando1 - operando2;
        }
    }

    // Genera un numero random entre 0 a 99
    private int generarNumeroRandom() {
        Random random = new Random();
        return random.nextInt(100);
    }

    // Genera un numero random (0 o 1) para selecionar el operador
    private int generarOperacionRandom() {
        Random random = new Random();
        return random.nextInt(2);
    }

    // Devuelve la operacion en forma de texto
    public String getOperacion() {
        String simboloOperador;
        if (operador == 0) {
            simboloOperador = "+";
        } else {
            simboloOperador = "-";
        }

        return operando1 + " " + simboloOperador + " " + operando2 + " = ?";
    }

    // Devuelve la respuesta de la operacion generada
    public int getSolucion() {
        return resultado;
    }
}

package juego;

import java.util.Random;

public class GeneradorPregunta {

    // Datos para la operacion
    private int resultado;



    // Genera un numero random entre 0 a 99
    private int generarNumeroRandom() {
        Random random = new Random();
        return random.nextInt(50) + 1;
    }

    // Devuelve la operacion en forma de texto
    public String getOperacion(int nivel) {
        switch (nivel){
            case 1:
                return generarOperacionNivel1();
            case 2:
                return generarOperacionNivel2();
            case 3:
                return generarOperacionNivel3();
            case 4:
                return generarOperacionNivel4();
            case 5:
                return generarOperacionNivel5();
            default:
                throw new IllegalArgumentException("Invalid level: " + nivel);
        }
    }
    // Operaciones de suma
    private String generarOperacionNivel1() {
        int operando1 = generarNumeroRandom();
        int operando2 = generarNumeroRandom();
        resultado = operando1 + operando2;
        return  operando1 + " + " + operando2 + " = ?";
    }
    // Operaciones de resta
        private String generarOperacionNivel2() {
        int operando1 = generarNumeroRandom();
        int operando2 = generarNumeroRandom();
        resultado = operando1 - operando2;
        return  operando1 + " - " + operando2 + " = ?";
    }
    // Operaciones de suma, resta y multiplicacion
    private String generarOperacionNivel3() {
        int operando1 = generarNumeroRandom();
        int operando2 = generarNumeroRandom();
        int operando3 = generarNumeroRandom();
        int operando4 = generarNumeroRandom();
        Random opcion = new Random();
        switch(opcion.nextInt(4)){
            case 0:
                resultado = operando1 + operando2 - operando3 * operando4;
                return  operando1 + " + " + operando2 + " - " + operando3 + " * " + operando4 + " = ?";
            case 1:
                resultado = operando1 * operando2 - operando3 + operando4;
                return  operando1 + " * " + operando2 + " - " + operando3 + " + " + operando4 + " = ?";
            case 2:
                resultado = operando1 + operando2 * operando3 - operando4;
                return  operando1 + " + " + operando2 + " * " + operando3 + " - " + operando4 + " = ?";
            case 3:
                resultado = operando1 - operando2 * operando3 + operando4;
                return  operando1 + " - " + operando2 + " * " + operando3 + " + " + operando4 + " = ?";
            default:
                return null;
        }
    }
    // Operaciones de suma, resta y division
    private String generarOperacionNivel4() {
        int operando1 = generarNumeroRandom();
        int operando2 = generarNumeroRandom();
        int operando3 = generarNumeroRandom();
        int operando4 = generarNumeroRandom();
        Random opcion = new Random();
        switch(opcion.nextInt(4)){
            case 0:
                resultado = operando1 + operando2 - operando3 / operando4;
                return  operando1 + " + " + operando2 + " - " + operando3 + " / " + operando4 + " = ?";
            case 1:
                resultado = operando1 / operando2 - operando3 + operando4;
                return  operando1 + " / " + operando2 + " - " + operando3 + " + " + operando4 + " = ?";
            case 2:
                resultado = operando1 + operando2 / operando3 - operando4;
                return  operando1 + " + " + operando2 + " / " + operando3 + " - " + operando4 + " = ?";
            case 3:
                resultado = operando1 - operando2 / operando3 + operando4;
                return  operando1 + " - " + operando2 + " / " + operando3 + " + " + operando4 + " = ?";
            default:
                return null;
        }
    }

    // Operacion de suma, resta, multiplicacion y division;
    private String generarOperacionNivel5() {
        int operando1 = generarNumeroRandom();
        int operando2 = generarNumeroRandom();
        int operando3 = generarNumeroRandom();
        int operando4 = generarNumeroRandom();
        int operando5 = generarNumeroRandom();
        Random opcion = new Random();
        switch(opcion.nextInt(6)) {
            case 0:
                resultado = operando1 + operando2 - operando3 * operando4 / operando5;
                return operando1 + " + " + operando2 + " - " + operando3 + " * " + operando4 + " / " + operando5 + " = ?";
            case 1:
                resultado = operando1 * operando2 - operando3 / operando4 + operando5;
                return operando1 + " * " + operando2 + " - " + operando3 + " / " + operando4 + " + " + operando5 + " = ?";
            case 2:
                resultado = operando1 / operando2 + operando3 * operando4 - operando5;
                return operando1 + " / " + operando2 + " + " + operando3 + " * " + operando4 + " - " + operando5 + " = ?";
            case 3:
                resultado = operando1 - operando2 * operando3 + operando4 / operando5;
                return operando1 + " - " + operando2 + " * " + operando3 + " + " + operando4 + " /" + operando5 + " = ?";
            case 4:
                resultado = operando1 * operando2 / operando3 - operando4 + operando5;
                return operando1 + " * " + operando2 + " / " + operando3 + " - " + operando4 + " + " + operando5 + " = ?";
            case 5:
                resultado = operando1 / operando2 - operando3 + operando4 * operando5;
                return operando1 + " / " + operando2 + " - " + operando3 + " + " + operando4 + " * " + operando5 + " = ?";
            default:
                return null;
        }
    }

    // Devuelve la respuesta de la operacion generada
    public int getSolucion() {
        return resultado;
    }
}

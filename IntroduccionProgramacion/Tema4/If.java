package Tema4;

/*Usando un if, crear una condición que compare si la variable numeroIf es
positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/

public class If {

    public static void main(String[] args) {

        int numeroIf = -42; // Puedes cambiar el valor de la variable aquí

        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

    }
}
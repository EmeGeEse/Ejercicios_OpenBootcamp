package Tema3;
public class FuncionSuma {

    // Crear una función con tres parámetros que sean números que se suman entre sí
    public static int Suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Llamar a la función en el main y darle valores
    public static void main(String[] args) {
        int resultado = Suma(1, 2, 3);
        System.out.println(resultado);
    }
}

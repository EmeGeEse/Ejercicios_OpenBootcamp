package Tema3;
public class Coche {
    // Dentro de la clase coche, una variable numérica que almacene el número de
    // puertas que tiene
    int NumPtas;

    // Una función que incremente el número de puertas que tiene el coche
    public void SumaPta() {
        NumPtas = NumPtas + 1;
    }

    // Crear un objeto miCoche en el main y añadirle una puerta
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumaPta();

        // Mostrar el número de puertas que tiene el objeto
        System.out.println(miCoche.NumPtas);
    }
}

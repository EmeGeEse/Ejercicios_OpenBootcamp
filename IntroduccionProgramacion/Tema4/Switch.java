package Tema4;

/*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones 
del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de 
la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una 
estación.*/

public class Switch {

    public static void main(String[] args) {

        String estacion = "Otoño";

        switch (estacion) {
            case "Verano":
                System.out.println("Es verano.");
                break;
            case "Invierno":
                System.out.println("Es Invierno.");
                break;
            case "Otoño":
                System.out.println("Es Otoño.");
                break;
            case "Primavera":
                System.out.println("Es Primavera.");
                break;
            default:
                System.out.println("Esto [" + estacion + "] no es una estacion.");
                break;
        }

    }

}

package Tema8;

/*Para practicar la encapsulación:
     Crear clase Persona.
     Crear variables las privadas edad, nombre y telefono de la clase Persona.
     Crear gets y sets de cada propiedad.
     Crear un objeto persona en el main.
     Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.*/

public class Encapsulacion {

    public static void main(String[] args) {

        Persona persona1 = new Persona(); // He corregido un fallo, definiendo static a la clase Persona?

        persona1.setEdad(46);
        persona1.setNombre("Manuel");
        persona1.setTelefono(123456789);

        int edadCliente = persona1.getEdad();
        String nombreCliente = persona1.getNombre();
        int telefonoCliente = persona1.getTelefono();

        System.out.println(edadCliente + " " + nombreCliente + " " + telefonoCliente);

    }

    static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getTelefono() {
            return this.telefono;
        }
    }

}
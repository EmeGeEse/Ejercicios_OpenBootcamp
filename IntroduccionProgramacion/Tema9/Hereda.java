package Tema9;

/* Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, 
tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
y con una variable salario que solo tenga la clase Trabajador.*/

public class Hereda {

    public static void main(String[] args) {

        // Objeto cliente heredado de persona.

        Cliente cliente1 = new Cliente();

        cliente1.setEdad(46);
        cliente1.setNombre("Manuel");
        cliente1.setTelefono(123456789);
        cliente1.setCredito(100);

        int edadCliente = cliente1.getEdad();
        String nombreCliente = cliente1.getNombre();
        int telefonoCliente = cliente1.getTelefono();
        int creditoCliente = cliente1.getCredito();

        System.out.println(edadCliente + " " + nombreCliente + " " + telefonoCliente + " " + creditoCliente);

        // Objeto trabajador heredado de persona.
        Trabajador trabajador1 = new Trabajador();

        trabajador1.setEdad(46);
        trabajador1.setNombre("Manuel");
        trabajador1.setTelefono(123456789);
        trabajador1.setSalario(1000);

        int edadTrabajador = trabajador1.getEdad();
        String nombreTrabajador = trabajador1.getNombre();
        int telefonoTrabajador = trabajador1.getTelefono();
        int salarioTrabajador = trabajador1.getSalario();

        System.out.println(edadTrabajador + " " + nombreTrabajador + " " + telefonoTrabajador + " " + salarioTrabajador);


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

    static class Cliente extends Persona {

        private int credito;

        public void setCredito(int credito) {
            this.credito = credito;
        }

        public int getCredito() {
            return this.credito;
        }
    }

    static class Trabajador extends Persona {

        private int salario;

        public void setSalario(int salario) {
            this.salario = salario;
        }

        public int getSalario() {
            return this.salario;
        }
    }

}

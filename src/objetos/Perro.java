package objetos;

/**
 *
 * @author Jhon Achata Limachi
 */
public class Perro {
    private String nombre, raza, color;
    private int edad;

    public Perro(String nombre, String raza, String color, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;

        mostrarDatos(edad);
    }

    /* ---------- CODIGO SIN IMPORTANCIA -------------- */
    private void mostrarDatos(int edad) {if (edad == 1) {/*System.out.println("Tu perro se llama " + nombre + ", es de raza " + raza + ", de color " + color + " y tiene " + edad + " año.");*/System.out.printf("Tu perro se llama %s, es de raza %s, de color %s, y tiene %d año.\n", nombre, raza, color, edad);} else {/*System.out.println("Tu perro se llama " + nombre + ", es de raza " + raza + ", de color " + color + " y tiene " + edad + " años.");*/System.out.printf("Tu perro se llama %s, es de raza %s, de color %s, y tiene %d años.\n", nombre, raza, color, edad);}}
    /* ---------- CODIGO SIN IMPORTANCIA -------------- */

    public void ladrar(){
        System.out.println(this.nombre + " esta ladrando");
    }
    public void correr(){
        System.out.println(this.nombre + " esta corriendo");
    }
    public void jugar(){
        System.out.println(this.nombre + " esta jugando");
    }
    public void jugarConNinio(String ninio){
        System.out.println(this.nombre + " esta jugando con " + ninio);
    }
}

package objetos;
/**
 *
 * @author Jhon Achata Limachi
 */
public class Objetos {

    public static void main(String[] args) {
        // TODO code application logic here

        Perro nuevoPerro = new Perro("puppy", "cool","blanco", 1);
        nuevoPerro.ladrar();
        nuevoPerro.correr();
        nuevoPerro.jugar();
        nuevoPerro.jugarConNinio("Carlitos");

        System.out.println();

        Automovil nuevo = new Automovil("ferrari","amarillo", 0);
        nuevo.encender();
        nuevo.arrancar();
        nuevo.apagar();
    }

}

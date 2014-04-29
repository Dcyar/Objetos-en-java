package objetos;

/**
 *
 * @author Jhon Achata Limachi
 */
public class Automovil {
    private String marca, color;
    private int km;

    public Automovil(String marca, String color, int km){
        this.marca = marca;
        this.color = color;
        this.km = km;

        mostrardatos();
    }
    public void mostrardatos(){
        System.out.printf("Tu automovil es un %s de color %s con %d kilometros\n", marca, color, km);
    }
    public void encender(){
        System.out.printf("Tu automovil esta encendido\n");
    }
    public void arrancar(){
        System.out.printf("Tu automovil esta avanzando\n");
    }
    public void apagar(){
        System.out.printf("Tu automovil esta apagado\n");
    }
}

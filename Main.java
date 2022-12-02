package observer;

/**
 * @author <a href="mailto:jagmig@hotmail.com">
 *
 * Implementación del patrón Observer.
 * Esta es la clase principal donde se hacen las llamadas a todos los métodos
 * creando nuevas instancias de cada uno para poder usar esos metodos.
 * Y por último el objeto emisora usa el método emite para mandar el mensaje todos.
 * Y saber si lo recibieron o no.
 *
 * @author Jorge Gomez
 * */
public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();
        Radio radio = new Radio();
        Satelite satelite = new Satelite();
        emisora.meteReceptor(radio);
        emisora.meteReceptor(satelite);

        emisora.emite();
    }
}

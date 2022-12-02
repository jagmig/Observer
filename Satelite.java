package observer;

/**
 * @class satelite que implementa la interfaz Receptor para sobreescribir el método recibe.
 * @Method recibe que tiene como funcion mandar un mensaje de que recibió la información
 *
 */

public class Satelite implements Receptor{
    @Override
    public void recibe() {
        System.out.println("señal recibida en satelite");
    }
}

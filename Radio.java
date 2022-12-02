package observer;


/**
 * @Class Radio que implementea la interface  Receptor para sobreescribir su método "recibe"
 *

 */
public class Radio implements Receptor{

    /**
     * @Method recibe que su función es emitir un mensaje de que recibió la información
     */
    @Override
    public void recibe() {
        System.out.println("recibido Radio");
    }
}

package observer;

import java.util.ArrayList;

/**
 * @Class Emisora que  tiene como objetivo crear un arraylist de receptores para enviarles la información
 *
 *
 *
 */
public class Emisora {
    private ArrayList<Receptor> receptor = new ArrayList<>();

    /**@Method meteReceptor que recibie como parametro un receptor y lo añade al arraylist
     *
     * @param receptor
     */
    public void meteReceptor(Receptor receptor){
        this.receptor.add(receptor);
    }

    /**
     * @Method emite recorre el arraylist y envía la información
     */
    public void emite(){
        for(Receptor receptor : receptor){
            receptor.recibe();
        }
    }
}

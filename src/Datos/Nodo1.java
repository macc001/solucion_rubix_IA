/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author user
 */
public class Nodo1 {
    String Data;
    Nodo1 link;

    public Nodo1() {
        Data="";
        link=null;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public Nodo1 getLink() {
        return link;
    }

    public void setLink(Nodo1 link) {
        this.link = link;
    }


}

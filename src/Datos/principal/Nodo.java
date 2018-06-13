/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos.principal;


import rubik.modelo.Cubo;

/**
 *
 * @author user
 */
class Nodo {
    Cubo dat;
    Nodo link;
    public Nodo() {
        dat=null;
        link=null;
    }

    public Cubo getDat() {
        return dat;
    }

    public void setDat(Cubo dat) {
        this.dat = dat;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

}

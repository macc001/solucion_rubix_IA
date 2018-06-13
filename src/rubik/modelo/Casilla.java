/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rubik.modelo;

/**
 * Clase que encapsula una casilla del curbo de Rubik.
 * Mantiene el color de la casilla y su posición correcta en su respectiva cara (la que corresponde a su color)
 */
public class Casilla {
    public byte color;
    public byte posicionCorrecta;
    public byte dato;

    public Casilla(byte color, byte posicionCorrecta) {
        this.color = color;
        this.posicionCorrecta = posicionCorrecta;
        this.dato=0;
    }

    public byte getColor() {
        return color;
    }

    public void setColor(byte color) {
        this.color = color;
    }

    public byte getPosicionCorrecta() {
        return posicionCorrecta;
    }

    public void setPosicionCorrecta(byte posicionCorrecta) {
        this.posicionCorrecta = posicionCorrecta;
    }
    public void setdato(byte k){
    this.dato=k;
    }
    public byte getdato(){
    return dato;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Casilla other = (Casilla) o;
        if ((this.color != other.color) ||
            (this.posicionCorrecta != other.posicionCorrecta)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 10 * hash + this.color;
        hash = 17 * hash + this.posicionCorrecta;
        return (10 * this.color + this.posicionCorrecta);
    }

    public Casilla clone() {
        return (new Casilla(this.color, this.posicionCorrecta));
    }




}

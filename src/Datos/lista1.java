/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author user
 */
public class lista1 {
    Nodo1 L;

    public lista1() {
        L=null;
    }
    public void insertar(String x){
        if(L==null){
            L=new Nodo1();
            L.setData(x);
        }
        else{
            Nodo1 P=L;
            while(P.getLink()!=null){
                P=P.getLink();
            }
            Nodo1 Aux= new Nodo1();
            Aux.setData(x);
            P.setLink(Aux);

        }
    }

    public boolean vacia() {
       return L==null;
    }

    public String eliminar() {
        String X=L.getData();
        L=L.getLink();
        return X;

    }


}

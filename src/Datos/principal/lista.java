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
public class lista {
    Nodo l;

    public lista() {
        l= null;
    }

    public void insertar(Cubo x){
        if(l==null){
            l= new  Nodo();
            l.setDat(x);
        }
        Nodo P = l;
        while(P.link!= null){
            P=P.getLink();
        }
        Nodo aux= new Nodo();
        aux.setDat(x);
        P.setLink(aux);
    }

   public Cubo ultimo() {
        Nodo p= l;
        while(p.getLink()!=null){
            p=p.getLink();
        }
        return p.getDat();
    }

    public int length() {
        int ac=0;
        Nodo p= l;
        while(p.getLink()!=null){
            p=p.getLink();
            ac++;
        }
        return ac;


    }
    private boolean compare(Cubo A, Cubo B){
        for(int i=1; i<13;i++){
            for (int j=1; j<10; j++){
               if( A.equals(B))
                   return false;
            }
        }
        return true;
    }

    public boolean repite(Cubo datos) {
        if(length()==1) return false;
        Nodo p=l;
       while(p.getLink()!=null){
            if(!compare(datos, p.getDat())) return false;
            p=p.getLink();
       }
       return true;
    }

    public boolean vacia() {
        return (l==null);
    }

    public void eliminarult() {
        Nodo p= l;
        Nodo ant=null;
        while(p.getLink()!=null){
            ant=p;
            p=p.getLink();

        }
        if(ant==null){
            l=null;
        }
 else{
    ant.setLink(null);
 }

    }
    //elimina el primer nodo de la lista
    public Cubo eliminar(){
        Cubo g =l.getDat();
        l=l.getLink();
        return g;
    }

    public void mostrar() {
        Nodo p=l;
        while(p.getLink()!=null){
       // p.getDat().mostrar();
        System.out.println();
        p=p.getLink();
                
        }
    }

}

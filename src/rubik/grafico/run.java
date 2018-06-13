/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rubik.grafico;

import Datos.lista1;
import Datos.principal.lista;
import rubik.modelo.Cubo;

/**
 *
 * @author ESTUDIANTE
 */
public class run {
    public int limite=10;
    JPanelRubik x= new JPanelRubik();
    public boolean backtrack1(lista l){
         Cubo datos=l.ultimo();
         x.setCubo(datos);
        l.mostrar();
        if(terminacion(datos)) return true;
        if(l.length()>limite) return false;
        if(l.repite(datos)) return false;
        lista1 LR= reglaAplicables(datos);
        while(!LR.vacia()){
            String R = mejorRegla(LR);
            JFrameRubik A= new JFrameRubik();
            A.AplicarRegla(R);
            l.insertar(datos);
            if(backtrack1(l)) return true;
            else{
            l.eliminarult();
            desaplicarregla(R);
            }
        }
        return false;
    }

    private boolean terminacion(Cubo datos) {
        return (datos.esConfiguracionFinal());
    }

    private lista1 reglaAplicables(Cubo datos) {
        lista1 a= new lista1();
        a.insertar("U");
        a.insertar("Ui");
        a.insertar("L");
        a.insertar("Li");
        a.insertar("F");
        a.insertar("Fi");
        a.insertar("R");
        a.insertar("Ri");
        a.insertar("B");
        a.insertar("Bi");
        a.insertar("D");
        a.insertar("Di");
        return a;
        
    }

    private String mejorRegla(lista1 LR) {
        return(LR.eliminar());
    }

    private void desaplicarregla(String R) {
        if(R.equals("U")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("Ui");
        }
        if(R.equals("Ui")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("U");
        }
        if(R.equals("L")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("Li");
        }
        if(R.equals("Li")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("L");
        }
        if(R.equals("F")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("Fi");
        }
        if(R.equals("Fi")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("F");
        }
        if(R.equals("R")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("Ri");
        }
        if(R.equals("Ri")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("R");
        }
        if(R.equals("B")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("Bi");
        }if(R.equals("Bi")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("B");
        }
        if(R.equals("D")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("Di");
        }
        if(R.equals("Di")){
            JFrameRubik A=new JFrameRubik();
            A.AplicarRegla("D");
        }
        
        
    }

    
       
}

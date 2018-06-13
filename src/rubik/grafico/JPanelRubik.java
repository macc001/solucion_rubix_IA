
package rubik.grafico;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.JPanel;

import rubik.modelo.Cubo;
import rubik.modelo.Movimiento;

public class JPanelRubik extends JPanel {

    private AnimCube animCube;


    
    public JPanelRubik() {
        this(new Cubo());
    }

    
    public JPanelRubik(Cubo c) {
        super();
        animCube = new AnimCube();
        animCube.setPreferredSize(new Dimension(250, 250));//250,250
        animCube.init();
        animCube.setCubo(c);
                
        this.setLayout(new BorderLayout());
        

        this.add(animCube, BorderLayout.CENTER);
             

    }

    public Cubo getCubo() {
        return (animCube.getCubo());
    }

    public void setCubo(Cubo cubo) {
        this.animCube.setCubo(cubo);
    }
     public void animarCubo(Vector<Movimiento> movimientos)  {
        Cubo cuboActual = animCube.getCubo();
        
        for (Movimiento m : movimientos){
            cuboActual.mover(m);
            animCube.setCubo(cuboActual);
            
        }
        
    }
    
    
        
    }



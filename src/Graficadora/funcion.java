    
package Graficadora;


import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;     // importamos las funciones JEP

public class funcion {
    JEP j=new JEP();
    public funcion(String def){  //CONSTRUCTOR CREANDO LA DEFINICION DE LA FUNCION
    j.addVariable("x",0); // VALIDAR LA VARIABLE X
    j.addStandardConstants(); //Constantes
    j.addStandardFunctions(); //Funciones
    j.setImplicitMul(true);//Permite ingresar, pe: 2X en lugar de 2*X
    j.parseExpression(def);
    if(j.hasError()){  //Verificar errores.
       System.out.print(j.getErrorInfo());  
    }
    }
    public double evaluar (double x){ //Metodo para evaluar X
    double r; // crear variable r
    j.addVariable("x", x); //Variabe X evaluada
    r=j.getValue(); // Resultado de la funcion anterior, almacenado en la variable creada r
        if(j.hasError()){  // si hay un error
            JOptionPane.showMessageDialog(null,"Error");
            
        }
        return r; // 
    
    }
}
    

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public aspect verificarsesion {	
    // Definir el pointcut, es decir, el punto donde ocurrirá la llamada al inicio de sesión.
	private JFrame frame ;
	
	
    pointcut funcion(): call(* consultar (*)); 
    
  //Advices. Se ejecutarán en el lugar indicado por el pointcut.
    before() : funcion() {
        // MétodoInicioSesión
    	if(IniciarSesion.sesionIniciada==false) {
    		IniciarSesion.initialize();
    	}
    
    	
    }
     

    
}
    

   

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public aspect verificarsesion {	
    // Definir el pointcut, es decir, el punto donde ocurrir� la llamada al inicio de sesi�n.
	private JFrame frame ;
	
	
    pointcut funcion(): call(* consultar (*)); 
    
  //Advices. Se ejecutar�n en el lugar indicado por el pointcut.
    before() : funcion() {
        // M�todoInicioSesi�n
    	if(IniciarSesion.sesionIniciada==false) {
    		IniciarSesion.initialize();
    	}
    
    	
    }
     

    
}
    

   

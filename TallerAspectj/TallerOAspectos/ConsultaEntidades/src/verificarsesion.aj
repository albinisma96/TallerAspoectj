import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public aspect verificarsesion  {	
    // Definir el pointcut, es decir, el punto donde ocurrir� la llamada al inicio de sesi�n.
	private JFrame frame ;
	
	
    pointcut funcion(): call(* consultar(*)); 
    
  //Advices. Se ejecutar�n en el lugar indicado por el pointcut.
    before() : funcion() {
        // M�todoInicioSesi�n
    	
    	if(IniciarSesion.sesionIniciada==false) { 
    		IniciarSesion.initialize() ;
    	}else {
    		JFrame mensaje = new JFrame("hola");
    		mensaje.setTitle("hola");
    		mensaje.setSize(400,600);
    		mensaje.setBounds(100, 100, 450, 300);
    		mensaje.getContentPane().setLayout(null);
    		JLabel label = new JLabel("has consultado:" +Entidad.data);
    		
    		mensaje.setVisible(true);
    		
    		
    		label.setBounds(100, 100, 200, 100);
    		mensaje.getContentPane().add(label);
    	}
    	
    	
    }
}
    
    
  
    		


    	
   	
    

     

    


    

   

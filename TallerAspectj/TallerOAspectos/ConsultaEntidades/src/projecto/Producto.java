package projecto;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Producto extends Entidad {

	private String[] listprod={"Refrigeradora","Lavadora","Cocina"};

	/**
	 * Create the application.
	 */
	public Producto() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame();
		mensaje = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		llenarPane();
		frame.setVisible(true);
					

	}
	
	public void consultar(String producto) {
			
			System.out.println("consultando: ");
			// TODO: Utilizar el Frame mensaje para mostrar el nombre de lo que se ha consultado		
		
	}
	
	public void llenarPane() {
		int i;
		for(i=0;i<listprod.length;i++) {
			JLabel lblNewLabel = new JLabel(listprod[i]);
			lblNewLabel.setBounds(187, 57+i*14, 100, 14);
			frame.getContentPane().add(lblNewLabel);
			
			lblNewLabel.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					consultar(lblNewLabel.getText());
				}
				@Override
				public void mouseEntered(MouseEvent e) {}
				@Override
				public void mouseExited(MouseEvent e) {}
				@Override
				public void mousePressed(MouseEvent e) {}
				@Override
				public void mouseReleased(MouseEvent e) {}
				
			});
		}
	}

}

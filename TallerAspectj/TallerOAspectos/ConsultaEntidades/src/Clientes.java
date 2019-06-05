import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clientes extends Entidad{
	private String[] listclient={"Juan Perez","Manuel Castillo","Luisa Mera","Andrea Paez"};

	public Clientes() {
		
	}
	
	@Override
	public void initialize() {
		frame = new JFrame();
		mensaje = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.llenarPane();
		frame.setVisible(true);		
	}

	@Override
	public void llenarPane() {
		int i;
		for(i=0;i<listclient.length;i++) {
			JLabel lblNewLabel = new JLabel(listclient[i]);
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

	public void consultar(String cliente) {
		System.out.println("Consultando");
		JLabel msj = new JLabel("Has consultado "+cliente);
		// TODO: Utilizar el Frame mensaje para mostrar el msj		
	}

}

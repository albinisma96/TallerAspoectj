import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal {

	private JFrame frame;
	static VentanaPrincipal window;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Entidad p= new Producto();
				p.initialize();
				
			}
		});
		btnProductos.setBounds(172, 97, 112, 23);
		frame.getContentPane().add(btnProductos);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entidad c=new Clientes();
				c.initialize();
			}
		});
		btnClientes.setBounds(172, 131, 112, 23);
		frame.getContentPane().add(btnClientes);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		JButton btnCerrarSesion = new JButton("Cerrar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!IniciarSesion.sesionIniciada) {
					IniciarSesion.initialize();
					btnIniciarSesion.setVisible(false);
					btnCerrarSesion.setVisible(true);
				}
				else {
					System.out.println("Sesion ya ha sido iniciada");
				}
				
			}
		});
		btnIniciarSesion.setBounds(299, 11, 125, 23);
		frame.getContentPane().add(btnIniciarSesion);
		
		btnCerrarSesion.setVisible(false);
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(IniciarSesion.sesionIniciada) {
					IniciarSesion.cerrarSesion();
				}
				else {
					System.out.println("Sesion no ha sido iniciada");
				}
				btnIniciarSesion.setVisible(true);
				btnCerrarSesion.setVisible(false);
				
			}
		});
		btnCerrarSesion.setBounds(299, 11, 125, 23);
		frame.getContentPane().add(btnCerrarSesion);
		
		
		
	}
}

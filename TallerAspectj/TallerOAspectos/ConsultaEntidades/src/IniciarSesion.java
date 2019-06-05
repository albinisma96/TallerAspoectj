import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IniciarSesion {

	public static JFrame frame;
	public static boolean sesionIniciada=false;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JButton btnOk;

	/**
	 * Create the application.
	 */
	public IniciarSesion() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public static void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 450, 200);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(80, 46, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(70, 71, 90, 14);
		frame.getContentPane().add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(170, 43, 131, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 68, 131, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarSesion();
				
			}
		});
		btnOk.setBounds(315, 127, 89, 23);
		frame.getContentPane().add(btnOk);
		frame.setVisible(true);
	}
	
	public static void verificarSesion() {
		
    		if(IniciarSesion.textField.getText().equals("curso") && IniciarSesion.textField_1.getText().equals("labfiec")) {
    				System.out.println("Sesion correcta");
    				IniciarSesion.sesionIniciada=true;
    				IniciarSesion.frame.setVisible(false);
    		}
    		else {
    				System.out.println("Sesion incorrecta");
    		}
		
	
	}

	public static void cerrarSesion() {
		IniciarSesion.sesionIniciada = false;
	}
		
}

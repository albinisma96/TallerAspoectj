import javax.swing.JFrame;

public abstract class Entidad {
	public JFrame frame;
	public static JFrame mensaje;
	
	public abstract void initialize();
	public abstract void llenarPane();
	public abstract void consultar(String entidad);

}

import javax.swing.JFrame;

public abstract class Entidad {
	public JFrame frame;
	public static JFrame mensaje;
	public static String data;
	public abstract void initialize();
	public abstract void llenarPane();
	public abstract void consultar(String entidad);

}

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
class OperacionArchivo{
	public void guardar (String fa,String texto){
		//guardar
	}
}
public class Ventana extends JFrame{
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JButton btnGuardar;
	private JButton btnLimpiar;

	public Ventana(){
		super("Datos");
		setLayout(new GridLayout(3,2));
		//invocar la creacion
		crearComponentes();
		agregarComponentes();
		agregarEventos();
		setSize (300,300);
		setVisible(true);
	}

	private void crearComponentes(){
		lblNombre = new JLabel ("Nombre");
		txtNombre = new JTextField(20);
		lblEmail = new JLabel ("Email");
		txtEmail = new JTextField(20);	
		btnGuardar = new JButton("Guardar");
		btnLimpiar = new JButton ("Limpiar");
	}
	private void agregarComponentes(){
		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);
		add(btnGuardar);
		add(btnLimpiar);
	}

	private void limpiar(){
		txtNombre.setText("");
		txtEmail.setText("");
	}

	private void agregarEventos(){
		addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						System.exit(0);
					}
				});
		btnGuardar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						//llamar metodo guardar
						OperacionArchivo oa = new OperacionArchivo();
						String txtN = txtNombre.getText();
						String txtE = txtEmail.getText();
						oa.guardar("guardar.txt",txtN+","+txtE);
						limpiar();
					}
			}
		);
		btnLimpiar.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//Limpiamos
					limpiar();
				}
			}
		);

	}

	public static void main (String args[]){
		Ventana v= new Ventana();
	}

}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
public class CalcularIVA extends JFrame{
	private JLabel precio;
	private JTextField x;
	private JLabel iva;
	private JTextField res;
	private JButton calcular;
	public CalcularIVA(){
		super ("CalcularIVA");
		setLayout (new FlowLayout());
		crearComponentes();
		agregarComponentes();
		agregarEventos();
		//setSize(300,400);
		pack();
		setVisible(true);
	}
	public void crearComponentes(){
		precio = new JLabel ("Ingresa el precio:");
		x = new JTextField (10);
		calcular = new JButton ("Calcular");
		iva = new JLabel ("El 16% de iva es: ");
		res = new JTextField (10);
		
	}
	
	public void agregarComponentes(){
		add (precio);
		add (x);
		add (calcular);
		add (iva);
		add (res);
		
	}
	private void agregarEventos(){
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("Saliendo");
				System.exit(0);
			}
		});

		calcular.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String precio0 = precio.getText();
				double precioDouble = Double.parseDouble(precio0);
				double iva=0.16;
				double ivaCalculado=precioDouble*iva;
				double total=precioDouble +ivaCalculado;
				res.setText(String.valueOf(total));
			}
		});

	}
	public static void main (String args[]){
		CalcularIVA civa= new CalcularIVA();
	}
}


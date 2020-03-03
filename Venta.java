import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

public class Venta extends JFrame{
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lbliva;
	private JTextField txtiva;
	private JLabel lblTotal;
	private JTextField txtTotal;
	private JButton calcular;
	public Venta (){
		super("Venta");
		setLayout (new FlowLayout());
		crearComponentes();
		agregarComponentes();
		agregarEventos();
		//setSize(300,400);
		pack();
		setVisible(true);
	}
	public void crearComponentes(){
		lblPrecio = new JLabel ("Precio:");
		txtPrecio = new JTextField (10);
		lbliva = new JLabel ("IVA");
		txtiva = new JTextField (10);
		lblTotal = new JLabel ("Total");
		txtTotal = new JTextField(10);
		calcular = new JButton ("Calcular");

	}
	
	public void agregarComponentes(){
		add (lblPrecio);
		add (txtPrecio);
		add (lbliva);
		add (txtiva);
		add (lblTotal);
		add (txtTotal);
		add (calcular);
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
				String precio = txtPrecio.getText();
				double precioDouble = Double.parseDouble(precio);
				double iva=0.16;
				double ivaCalculado=precioDouble*iva;
				double total=precioDouble +ivaCalculado;
				txtTotal.setText(String.valueOf(total));
			}
		});

	}
	public static void main (String args[]){
		Venta venta= new Venta();
	}
}
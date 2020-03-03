import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Calculadora extends JFrame{
	private JTextField txtResultado;
	private JPanel pnlCentral;
	private JButton numero1;
	private JButton numero2;
	private JButton numero3;
	private JButton numero4;
	private JButton numero5;
	private JButton numero6;
	private JButton numero7;
	private JButton numero8;
	private JButton numero9;
	private JButton numero0;
	private JButton suma;
	private JButton resta;
	private JButton multiplicacion;
	private JButton division;
	private JButton igual;
	private JButton borrar;
	private JButton masmenos;
	private JButton btnCE;
	private JButton btnC;
	private JButton punto;

	public Calculadora(){
		super ("Calculadora");
		setLayout(new BorderLayout());
		crearComponentes();
		agregarComponentes();
		agregarEventos();
		setSize (400,400);
		pack();
		setVisible(true);
	}

	public void crearComponentes(){
		txtResultado = new JTextField(20);
		pnlCentral = new JPanel();
		pnlCentral.setLayout(new GridLayout(5,4));

		numero1 = JButton ("1");
		numero2 = JButton ("2");
		numero3	= JButton ("3");
		numero4	= JButton ("4");
		numero5	= JButton ("5");
		numero6	= JButton ("6");
		numero7	= JButton ("7");
		numero8	= JButton ("8");
		numero9	= JButton ("9");
		numero0	= JButton ("0");
		suma	= JButton ("+");
		resta = JButton ("-");
		multiplicacion = JButton ("x");
		division = JButton ("÷");
		igual = JButton ("=");
		borrar = JButton ("Borrar");
		masmenos = JButton ("±");
		btnCE = JButton ("CE");
		btnC = JButton ("C");
		punto = JButton (".");
	}
	public void agregarComponentes(){
		add (txtResultado,BorderLayout.NORTH);
		add (pnlCentral,BorderLayout.CENTER);

		pnlCentral.add(btnCE);
		pnlCentral.add(btnC);
		pnlCentral.add(borrar );
		pnlCentral.add(division);
		pnlCentral.add(numero7);
		pnlCentral.add(numero8);
		pnlCentral.add(numero9);
		pnlCentral.add(multiplicacion);
		pnlCentral.add(numero4);
		pnlCentral.add(numero5);
		pnlCentral.add(numero6);
		pnlCentral.add(resta);
		pnlCentral.add(numero1);
		pnlCentral.add(numero2);
		pnlCentral.add(numero3);
		pnlCentral.add(suma);
		pnlCentral.add(masmenos);
		pnlCentral.add(numero0);
		pnlCentral.add(punto);
		pnlCentral.add(igual);
	}
	public void agregarEventos(){

	}
	public static void main (String args[]){
		Calculadora cal= new Calculadora();
	}	
}
import javax.swing.*;

public class Formulario extends JFrame {

	private JLabel lbnumero1 ;
	private JLabel lbnumero2 ;
	private JTextField txNumero1;
	private JTextField txNumero2;
	private JButton btBotaoMais;
	private JButton btBotaoMenos;
	
	
	public Formulario() {
		
		setTitle("Calculador");
		setSize(900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		
		lbnumero1 = new JLabel();
		lbnumero1.setText("Numero 1: ");
		lbnumero1.setBounds(200, 180, 100, 35);
		add(lbnumero1);
		
		txNumero1 = new JTextField();
		txNumero1.setBounds(280, 180, 100, 35);
		add(txNumero1);

		btBotaoMais = new JButton();
		btBotaoMais.setText("+");
		btBotaoMais.setBounds(405, 160, 50, 35);
		add(btBotaoMais);
		
		btBotaoMenos = new JButton();
		btBotaoMenos.setText("-");
		btBotaoMenos.setBounds(405, 200, 50, 35);
		add(btBotaoMenos);
		
		
		lbnumero2 = new JLabel();
		lbnumero2.setText("Numero 2: ");
		lbnumero2.setBounds(480, 180, 100, 35);
		add(lbnumero2);
		
		txNumero2 = new JTextField();
		txNumero2.setBounds(560, 180, 100, 35);
		add(txNumero2);
		
				
		setVisible(true);
	}
}

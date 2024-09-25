import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class Formulario extends JFrame {

	private JLabel lbnumero1;
	private JLabel lbnumero2;
	private JTextField txNumero1;
	private JTextField txNumero2;
	private JButton btBotaoMais;
	private JButton btBotaoMenos;
	private JButton btBotaoMultiplicacao;
	private JButton btBotaoDivisao;
	
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
		
		lbnumero2 = new JLabel();
		lbnumero2.setText("Numero 2: ");
		lbnumero2.setBounds(200, 220, 100, 35);
		add(lbnumero2);
		
		txNumero2 = new JTextField();
		txNumero2.setBounds(280, 220, 100, 35);
		add(txNumero2);

		btBotaoMais = new JButton();
		btBotaoMais.setText("+");
		btBotaoMais.setBounds(200, 300, 50, 35);
		
		btBotaoMais.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double n1 = Double.parseDouble(txNumero1.getText()), n2 = Double.parseDouble(txNumero2.getText());
				JOptionPane.showMessageDialog(null, contaMais(n1, n2));
			}
		});
		
		add(btBotaoMais);
		
		btBotaoMenos = new JButton();
		btBotaoMenos.setText("-");
		btBotaoMenos.setBounds(280, 300, 50, 35);
		
		btBotaoMenos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double n1 = Double.parseDouble(txNumero1.getText()), n2 = Double.parseDouble(txNumero2.getText());
				JOptionPane.showMessageDialog(null, contaMenos(n1, n2));
			}
		});
		
		add(btBotaoMenos);
		
		btBotaoMultiplicacao = new JButton();
		btBotaoMultiplicacao.setText("*");
		btBotaoMultiplicacao.setBounds(360, 300, 50, 35);
		
		btBotaoMultiplicacao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double n1 = Double.parseDouble(txNumero1.getText()), n2 = Double.parseDouble(txNumero2.getText());
				JOptionPane.showMessageDialog(null, contaMultiplicacao(n1, n2));
			}
		});
		
		add(btBotaoMultiplicacao);
		
		btBotaoDivisao = new JButton();
		btBotaoDivisao.setText("/");
		btBotaoDivisao.setBounds(440, 300, 50, 35);
		
		btBotaoDivisao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double n1 = Double.parseDouble(txNumero1.getText()), n2 = Double.parseDouble(txNumero2.getText());
				String resultado = "" + contaDivisao(n1, n2);
				JOptionPane.showMessageDialog(null, resultado);
			}
		});
		
		add(btBotaoDivisao);
		
		
		setVisible(true);
	}
	
	public double contaMais(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	public double contaMenos(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	public double contaMultiplicacao(double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	public String contaDivisao(double numero1, double numero2) {
		if(numero2 == 0) {
			return "Tento dividir por 0";
		}
		return "" + (numero1 / numero2);
	}
	
}

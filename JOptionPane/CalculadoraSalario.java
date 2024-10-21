import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class CalculadoraSalario extends JFrame {

	private JButton btBotaoComecar;

	public CalculadoraSalario() {

		setTitle("Salario");
		setSize(900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

		btBotaoComecar = new JButton();
		btBotaoComecar.setText("Comecar");
		btBotaoComecar.setBounds(350, 255, 200, 30);
		add(btBotaoComecar);

		btBotaoComecar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				double parteFixa = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga a parte fixa"));
				double porcCom = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga a porcentagem da comissao"));

				int quantPecas = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga a quantidade pecas"));
				double valorPecas = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga o valor das pecas"));

				double valorTotalVendido = quantPecas * valorPecas;
				double porcSobreValor = valorTotalVendido * porcCom / 100;
				double salario = porcSobreValor + parteFixa;

				JOptionPane.showMessageDialog(null, salario);
			}
		});
		
		setVisible(true);
	}
}

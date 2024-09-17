import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class Formulario extends JFrame {

	private JButton btBotaoConfirm;
	private JButton btBotaoInput;
	private JButton btBotaoMessage;
	private JButton btBotaoOption;

	public Formulario() {

		setTitle("JOptionPane");
		setSize(900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

		btBotaoConfirm = new JButton();
		btBotaoConfirm.setText("Show Confirm Dialog");
		btBotaoConfirm.setBounds(350, 255, 200, 30);

		btBotaoConfirm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int confirmou = JOptionPane.showConfirmDialog(null, "Aperta Sim");
				
				JOptionPane.showMessageDialog(null, confirmou);
			}
		});
		
		add(btBotaoConfirm);
		
		btBotaoInput = new JButton();
		btBotaoInput.setText("Show Input Dialog");
		btBotaoInput.setBounds(350, 405, 200, 30);

		btBotaoInput.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String input = JOptionPane.showInputDialog(null, "Escreve algo");
				
				JOptionPane.showMessageDialog(null, input);
			}
		});
		
		add(btBotaoInput);

		btBotaoMessage = new JButton();
		btBotaoMessage.setText("Show Message Dialog");
		btBotaoMessage.setBounds(350, 315, 200, 30);

		btBotaoMessage.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "mensagem");
			}
		});

		add(btBotaoMessage);
		
		setVisible(true);
		
		btBotaoOption = new JButton();
		btBotaoOption.setText("Show Input Dialog");
		btBotaoOption.setBounds(350, 105, 200, 30);

		btBotaoOption.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Object[] options = { "OK", "CANCEL" };
				int input = JOptionPane.showOptionDialog(null, "Escreve algo", "LOL", 0, JOptionPane.QUESTION_MESSAGE, null, options, "");
				
				JOptionPane.showMessageDialog(null, input);
			}
		});
		
		add(btBotaoOption);
	}

}

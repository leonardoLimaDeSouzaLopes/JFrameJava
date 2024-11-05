package Loljinha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class CadastrarCategoria extends JFrame {

	private JLabel lbCategoria;
	private JTextField txCategoria;
	private JButton btCadastrarCategoria;

	public CadastrarCategoria() {

		setTitle("Cadastrar Categoria");
		setSize(900, 600);
	    this.setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);

		lbCategoria = new JLabel();
		lbCategoria.setText("Categoria: ");
		lbCategoria.setBounds(415, 220, 70, 15);
		add(lbCategoria);

		txCategoria = new JTextField();
		txCategoria.setBounds(350, 260, 200, 35);
		add(txCategoria);

		btCadastrarCategoria = new JButton();
		btCadastrarCategoria.setText("Cadastrar");
		btCadastrarCategoria.setBounds(400, 325, 100, 35);

		btCadastrarCategoria.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String categoria = txCategoria.getText();

				JOptionPane.showMessageDialog(null, cadastrarCategoria(categoria) ? "Categoria " + categoria + " Cadastrada Com Sucesso" : "Categoria " + categoria + " Nao Cadastrada Com Sucesso");
			}
		});

		add(btCadastrarCategoria);
	}

	public boolean cadastrarCategoria(String categoria) {
		return true;
	}
}
package Loljinha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CadastrarTelefone extends JFrame  {

	private JLabel lbTelefone;
	private JTextField txTelefone;
	
	public CadastrarTelefone() {
		setTitle("Cadastrar Telefone");
		setSize(600, 400);
		this.setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
	}
}

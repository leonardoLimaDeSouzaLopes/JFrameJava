

import javax.swing.*;

public class CadastrarCliente extends JFrame {
	private JLabel lbNomeCliente;
	private JTextField txNomeCliente;
	private JLabel lbIdadeCliente; //Obs: Vamos colocar para numero dps
	private JTextField txIdadeCliente;
	private JLabel lbCpfCliente;
	private JTextField txCpfCliente;
	private JLabel lbEnderecoCliente;
	private JTextField txEnderecoCliente;
	private JButton btCadastrarCliente;
	
	
	public CadastrarCliente() {		
		this.setTitle("Cadastar Cliente");
	    this.setSize(900,600);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    
	   
	}
}

import javax.swing.*;

public class CadastrarCategoria extends JFrame {
	private JLabel  lbCategoria;
	private JTextField txCategoria;
	private JButton btCadastrarCategoria;

	public CadastrarCategoria() {		
		this.setTitle("Cadastrar Categoria");
	    this.setSize(900,600);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);		
	    
		//Obs: Ainda falta arrumar a posicao
	    lbCategoria = new JLabel();
	    lbCategoria.setText("Categoria: ");
	    lbCategoria.setBounds(300, 180, 100, 35);
		add(lbCategoria);
		
		txCategoria = new JTextField();
		txCategoria.setBounds(280, 180, 40, 20);
		add(txCategoria);
		
		btCadastrarCategoria = new JButton();
		btCadastrarCategoria.setText("Cadastar");
		btCadastrarCategoria.setBounds(200, 300, 50, 35);
	}
}


import javax.swing.*;


public class CadastrarProduto extends JFrame{
	private JLabel lbNomeProduto;
	private JTextField txNomeProduto;
	private JLabel lbTipoProduto;
	private JTextField txTipoProduto;
	private JButton btCadastarProduto;
	
	public CadastrarProduto() {		
		this.setTitle("Cadastrar Produto");
	    this.setSize(900,600);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);		

	}
}

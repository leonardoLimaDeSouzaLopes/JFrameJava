import javax.swing.*;

public class CadastrarPedido extends JFrame {
	private JButton btnovoPedido;
	private JButton btverPedido;
	
	public CadastrarPedido() {		
		this.setTitle("Cadastrar Categoria");
	    this.setSize(900,600);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    setLayout(null); // Importante
	    
	    btnovoPedido = new JButton();
	    btnovoPedido.setText("Novo Pedido");
	    btnovoPedido.setBounds(250,20,400,100);
	    add(btnovoPedido);
	    
	    btverPedido = new JButton();
	    btverPedido.setText("Ver Pedidos");
	    btverPedido.setBounds(250,200,400,100);	    
	    add(btverPedido);
	}
	
}

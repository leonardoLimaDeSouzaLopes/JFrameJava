import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	    btnovoPedido.setBounds(300,20,250,80);
	    add(btnovoPedido);
	    
	    btnovoPedido.addActionListener((ActionListener) new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
    			novoPedido novoPedido = new novoPedido();
    			novoPedido.setVisible(true);
    		}
	    });
	    
	    btverPedido = new JButton();
	    btverPedido.setText("Ver Pedidos");
	    btverPedido.setBounds(300,150,250,80);	    
	    add(btverPedido);
	}
	
}

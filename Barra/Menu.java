import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Menu extends JFrame{
 
    public Menu(){   // Criando o menu
        
    	// Cria as coisas basicas da Aplicacao
    	this.setTitle("Aplicacao");
    	this.setSize(960, 540);
    	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	this.setExtendedState(MAXIMIZED_BOTH); // Maxima a janela

    	// Cria a Barra de Menu
    	JMenuBar barra = new JMenuBar();
    	setJMenuBar(barra); 
    	
    	// Cria o menu Arquivo
    	JMenu arquivo = new JMenu("Arquivo");
    	barra.add(arquivo);
    	
    	//Cria a opcao de novo arquivo
    	JMenuItem novo = new JMenuItem("Novo");
    	
    	arquivo.add(novo);
    	
    	//Cria o item Salvar
    	JMenuItem salvar = new JMenuItem("Salvar");
    	
    	arquivo.add(salvar);
    	
    	//Cria o item Salvar Como
    	JMenuItem salvarComo = new JMenuItem("Salvar Como");
    	
    	arquivo.add(salvarComo);
    	
    	//Cria o Item Carregar
    	JMenuItem carregar = new JMenuItem("Carregar");
    	
    	arquivo.add(carregar);
    	
    	// Cria o item Sair
    	JMenuItem sair = new JMenuItem("Sair");
    	sair.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent evento) {
    			System.exit(0);
    		}
    	});
    	arquivo.add(sair);
    	
    	//Cria o menu cadastrar
    	JMenu cadastrar = new JMenu("Cadastrar");
    	barra.add(cadastrar);   	
    	
    	//Cria o item categoria
    	JMenuItem categoria = new JMenuItem("Categoria");
    	categoria.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent evento) {
    			CadastrarCategoria categoria = new CadastrarCategoria();
    			categoria.setVisible(true);
    		}
    	} );
    	
    	cadastrar.add(categoria);
    	
    	//Cria o item Produto
    	JMenuItem produto = new JMenuItem("Produto");
    	produto.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent evento) {
    			CadastrarProduto produto = new CadastrarProduto();
    			produto.setVisible(true);
    		} 
    	} );
    	cadastrar.add(produto);
    	
    	//Cria o item cliente
    	JMenuItem cliente = new JMenuItem("Cliente");
    	cliente.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent evento) {
    			CadastrarCliente cliente = new CadastrarCliente();
    			cliente.setVisible(true);
    		} 
    	} );
    	
    	cadastrar.add(cliente);
    	
    	//Cria o item pedidos
    	JMenuItem pedido = new JMenuItem("Pedido");
    	pedido.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent evento) {
    			CadastrarPedido pedido = new CadastrarPedido();
    			pedido.setVisible(true);
    		} 
    	} );
    	
    	cadastrar.add(pedido);
    	

    	//Cria o menu ajuda
    	JMenu ajuda = new JMenu("Ajuda");
    	barra.add(ajuda);   	
    	
    	//Cria o item categoria
    	JMenuItem sobre = new JMenuItem("Sobre");
    	sobre.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent evento) {
    			telaSobre sobre = new telaSobre();
    			sobre.setVisible(true);
    		}
    	} );
    	
    	ajuda.add(sobre);
    	
       
    	this.setVisible(true);
    } 
}

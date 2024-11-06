package Loljinha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

import DAOLojinha.CategoriaDAO;
import ModelLojinha.ModelarCategoria;

public class CadastrarProduto extends JFrame {
	private JLabel lbNomeProduto;
	private JTextField txNomeProduto;
	private JLabel lbPrecoProduto;
	private JTextField txPrecoProduto;
	private JLabel lbCategoriaProduto;
	private JComboBox cbCategoriaProduto;
	private JButton btCadastrarProduto;

	public CadastrarProduto() throws SQLException {

		this.setTitle("Cadastrar Produto");
		this.setSize(900, 600);
		this.setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);

		// Nome
		lbNomeProduto = new JLabel();
		lbNomeProduto.setText("Nome: ");
		lbNomeProduto.setBounds(300, 150, 300, 15);
		add(lbNomeProduto);

		txNomeProduto = new JTextField();
		txNomeProduto.setBounds(300, 165, 300, 35);
		add(txNomeProduto);

		// Preco
		lbPrecoProduto = new JLabel();
		lbPrecoProduto.setText("Preco: ");
		lbPrecoProduto.setBounds(300, 215, 300, 15);
		add(lbPrecoProduto);

		txPrecoProduto = new JTextField();
		txPrecoProduto.setBounds(300, 230, 300, 35);
		add(txPrecoProduto);

		// Categoria
		lbCategoriaProduto = new JLabel();
		lbCategoriaProduto.setText("Categoria: ");
		lbCategoriaProduto.setBounds(300, 280, 300, 15);
		add(lbCategoriaProduto);

		List<ModelarCategoria> categorias = new CategoriaDAO().getLista(); //Cria a lista das categorias
		
		String[] nomesCategorias = new String[categorias.size()]; //Cria o vetor de nomes das categorias
		
		for (int i = 0; i < categorias.size(); i++) { //Coloca os nomes no vetor de nomes das categorias
			nomesCategorias[i] = categorias.get(i).getNomeCategoria();
		}
		
		cbCategoriaProduto = new JComboBox(nomesCategorias); //Cria uma combobox com os nomes do vetor
		cbCategoriaProduto.setBounds(300, 295, 300, 35);
		add(cbCategoriaProduto);

		// Botao Cadastrar
		btCadastrarProduto = new JButton();
		btCadastrarProduto.setText("Cadastrar");
		btCadastrarProduto.setBounds(400, 345, 100, 35);

		btCadastrarProduto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try { // Tenta fazer o codigo (se der erro ele manda pro catch)

					String nome = txNomeProduto.getText(); // Le o nome

					if (nome.equals("")) { // Se o nome nao foi colocado nao cadastra o Produto

						JOptionPane.showMessageDialog(null, "Insira um Nome");
						return;

					}

					double preco = Double.parseDouble(txPrecoProduto.getText()); // Le o Preco

					int idCategoria = (int) categorias.get(cbCategoriaProduto.getSelectedIndex()).getIdCategoria(); // Le a Categoria

					JOptionPane.showMessageDialog(null, cadastrarProduto(nome, preco, idCategoria) ? "Produto " + nome + " Cadastrada Com Sucesso"
											: "Produto " + nome + " Nao Cadastrada Com Sucesso"); // cadastra o Produto
																									// e mostra o
																									// resultado

				} catch (Exception execao) { // Se deu erro fala que deu erro (sem estoura o programa)
					JOptionPane.showMessageDialog(null, "Erro no Cadastro do Produto");
				}
			}
		});

		add(btCadastrarProduto);
	}
	
	public boolean cadastrarProduto(String nome, double preco, int idCategoria) {  // Supostamente cadastra o cliente mas nao faz nada ainda
		return true;
	}
}
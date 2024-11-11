package DAO;

import java.sql.SQLException;

import Model.Produto;

public class app {

	public static void main(String[] args) throws SQLException {
		
		Produto produto = new Produto(); // Criando outro objeto que esta em outro packge
		
		produto.setNomeProduto("Lima"); //Inserindo os atributos
		produto.setValorProduto(24);
		
		ProdutoDao produtoDao = new ProdutoDao(); // Salvando os valores
		produtoDao.adicionarProduto(produto);
	}

}

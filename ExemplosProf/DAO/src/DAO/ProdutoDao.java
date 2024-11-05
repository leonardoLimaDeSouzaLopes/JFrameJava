package DAO;
//Rotina de insercao
//Objeto de acesso a dados

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Produto; //Importando o objeto produto que esta em outro pacote

public class ProdutoDao {

		private Connection connection;
		
		public ProdutoDao() {
			this.connection = new ConnectionFactory().getConnection(); // Cada vez que criar uma instancia, ira conectar com o banco de dados
		}
		
		public void adicionarProduto(Produto produto) throws SQLException {
			try {
				String sql = "insert into tbProduto ( nomeProduto , valorProduto) values (?,?)";
				
				PreparedStatement stmt = connection.prepareStatement (sql); //preparando parar executar o codigo
				
				stmt.setString(1, produto.getNomeProduto()); //Inserindo os valores no lugar do ?
				stmt.setDouble(2, produto.getValorProduto());
				
				stmt.execute();
				stmt.close();
				
				System.out.println("Operacao concluida com exito!");
			}
			
			catch(SQLException e) {
				System.out.println("Erro: " + e); // Caso algum erro ocorra no codigo, ele ira informar
				
			}
			
			finally {
				connection.close();
			}
			
		}
}

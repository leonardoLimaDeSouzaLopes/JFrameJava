package DAOLojinha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ModelLojinha.ModelarProduto;
import ModelLojinha.ModelarCategoria;

public class ProdutoDAO {
private Connection connection;
	
	public ProdutoDAO() {
		this.connection = new ConnectionFactory().getConnection(); 
	}
	
	public void adicionarEstoque(ModelarProduto Produto, ModelarCategoria Categoria) throws SQLException {
		try {
			String tbEstoque = "insert into tbEstoqueProduto (nomeEstoqueProduto , idCategroia) values (?,?) ";
			
		}
		
		catch(SQLException e) {
			System.out.println("Erro: " + e); 
			
		}
		
		finally {
			connection.close();
		}
	}
}

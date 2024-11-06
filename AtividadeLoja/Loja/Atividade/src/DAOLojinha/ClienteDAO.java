package DAOLojinha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ModelLojinha.ModelarCliente;

public class ClienteDAO {
	private Connection connection;
	
	public ClienteDAO() {
		this.connection = new ConnectionFactory().getConnection(); 
	}
	
	public void adicionarCategoria(ModelarCliente Cliente) throws SQLException {
		try {
			
			String tbCliente = "insert into tbCategoria (nomeCliente,datanascCliente,cpfCliente,sexoCliente,logradouroCliente,numlogradouroCliente,bairroCliente,cidadeCliente) values (?,?,?,?,?,?,?,?)";
			
			PreparedStatement stmt = connection.prepareStatement (tbCliente); 
			
			stmt.setString(1, Cliente.getNomeCliente());
			stmt.setString(1, Cliente.getDatanascCliente());
			stmt.setString(1, Cliente.getCpfCliente());
			stmt.setString(1, Cliente.getSexoCliente());
			stmt.setString(1, Cliente.getLogradouroCliente());
			stmt.setInt(1, Cliente.getNumLogradouroCliente());
			stmt.setString(1, Cliente.getBairroCliente());
			stmt.setString(1, Cliente.getCidadeCliente());
			
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Operacao concluida com exito!");
		}
		
		catch(SQLException e) {
			System.out.println("Erro: " + e); 
			
		}
		
		finally {
			connection.close();
		}
	}
}

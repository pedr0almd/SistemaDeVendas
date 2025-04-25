package Pck_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoMySql {

	public Connection connection = null;

	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/DB_SistemaDeVendas?useSSL=false&serverTimezone=UTC";
	private final String LOGIN = "admin";
	private final String PASSWORD = "mysql@admin2025";

	public ConexaoMySql()
	{};

	public Connection getConnection() throws SQLException {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			System.out.println("Conectado");
			return connection;
		}

		catch (ClassNotFoundException erro) {
			String errorMsg = "Driver nao encontrado";
			throw new SQLException(errorMsg, erro);
		}
		catch (SQLException e) {
			String errorMsg = "Erro ao obter a conexao";
			throw new SQLException(errorMsg );
		}
	}

}


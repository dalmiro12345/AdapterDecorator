package infraestructura.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectorMySql {

	private String url;
	private String user;
	private String password;

	private Connection connection;

	public ConectorMySql(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}

	Connection open() {
		try {
			this.connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (Exception ex) {
			throw new RuntimeException("No fue posible conectarse a la BD", ex);
		}
	}

}

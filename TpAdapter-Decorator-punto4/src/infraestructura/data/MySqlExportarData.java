package infraestructura.data;

import java.sql.PreparedStatement;

import portsOut.ExportarData;

public class MySqlExportarData implements ExportarData {

	private ConectorMySql conn;

	public MySqlExportarData(ConectorMySql conn) {
		super();
		this.conn = conn;
	}

	@Override
	public void grabar(String data) {
		// TODO Auto-generated method stub
		try (var connection = this.conn.open()) {
			PreparedStatement st = connection.prepareStatement("insert into tabla(data) values(?)");
			st.setString(1, data);
			st.executeUpdate();
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage(), ex);
		}

	}

}

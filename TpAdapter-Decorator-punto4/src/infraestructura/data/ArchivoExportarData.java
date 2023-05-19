package infraestructura.data;

import java.io.FileWriter;

import portsOut.ExportarData;

public class ArchivoExportarData implements ExportarData {

	private String ruta;

	public ArchivoExportarData(String ruta) {
		super();
		this.ruta = ruta;
	}

	@Override
	public void grabar(String data) {
		// TODO Auto-generated method stub
		try (FileWriter archivo = new FileWriter(this.ruta)) {
			archivo.write(data);

		} catch (Exception ex) {
			
			throw new RuntimeException(ex.getMessage(), ex);
		}
	}

}

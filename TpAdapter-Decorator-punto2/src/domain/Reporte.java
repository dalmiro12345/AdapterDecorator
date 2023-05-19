package domain;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Reporte implements Reportador {

	private String reporte;

	public Reporte(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}
		try {
			FileWriter archivo = new FileWriter(file, true);
			archivo.write(this.reporte);
			archivo.close();
		} catch (IOException e) {
			throw new RuntimeException("No se pudo grabar en el archivo", e);
		}

	}
}
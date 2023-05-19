package domain;

import java.io.File;

class ReporteVerificando implements Reportador {

	private Reportador reportador;

	public ReporteVerificando(Reportador reportador) {
		super();
		this.reportador = reportador;
	}

	@Override
	public void export(File file) {
		// TODO Auto-generated method stub
		if (file.exists()) {
			throw new RuntimeException("El archivo ya existe");
		} else
			reportador.export(file);
	}

}

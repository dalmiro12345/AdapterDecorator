package domain;

import java.io.File;

class ReporteSinVerificar implements Reportador {

	private Reportador reportador;
	
	

	public ReporteSinVerificar(Reportador reportador) {
		super();
		this.reportador = reportador;
	}



	@Override
	public void export(File file) {
		// TODO Auto-generated method stub
		File archivo = file;
		if(file.exists()) {
			String path = file.getPath();
			file.delete();
			archivo = new File (path);
		}
		reportador.export(archivo);
	}

}

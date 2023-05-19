package domain;

import portsOut.ExportarData;

public class RestCallGrabador implements Grabador {

	private ExportarData exportar;
	private Grabador grabador;

	public RestCallGrabador(Grabador grabador, ExportarData exportar) {
		super();
		this.exportar = exportar;
		this.grabador = grabador;
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		String data = this.grabador.run();
		exportar.grabar(data);
		return data;
	}

}

package main;

import domain.Grabador;
import domain.RestCall;
import domain.RestCallGrabador;
import infraestructura.data.ArchivoExportarData;

public class MainArchivoSolo {
	public static void main(String[] args) {
		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");

		Grabador grabador = new RestCallGrabador(new RestCall("https://jsonplaceholder.typicode.com/posts"),
				new ArchivoExportarData("/home/tomas/Documentos/Universidad/OO2/decorador-punto4"));
		grabador.run();
		System.out.println(rest.run());
	}
}

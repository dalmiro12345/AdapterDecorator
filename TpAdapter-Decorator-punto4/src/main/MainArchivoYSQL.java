package main;

import domain.Grabador;
import domain.RestCall;
import domain.RestCallGrabador;
import infraestructura.data.ArchivoExportarData;
import infraestructura.data.ConectorMySql;
import infraestructura.data.MySqlExportarData;

public class MainArchivoYSQL {

	public static void main(String[] args) {
		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");

		Grabador grabador = new RestCallGrabador(
				new RestCallGrabador(new RestCall("https://jsonplaceholder.typicode.com/posts"),
						new ArchivoExportarData("/home/tomas/Documentos/Universidad/OO2/decorador-punto4")),
				new MySqlExportarData(
						new ConectorMySql("jdbc:mysql://localhost:3306/decorator?useSSL=false", "root", "")));
		grabador.run();
		System.out.println(rest.run());
	}

}

package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.jupiter.api.Test;

public class ReportTest {

	@Test
	public void reporteVerificandoArchivo() {

		Reportador reporteVerificando = new ReporteVerificando(new Reporte("Se grabo"));
		File file = new File("/home/tomas/Documentos/Universidad/OO2/decorador-punto2");
		try {
			reporteVerificando.export(file);
			fail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void reporteSinVerificarArchivo() {

		Reportador reporteSinVerificar = new ReporteSinVerificar(new Reporte("Se grabo"));
		File file = new File("/home/tomas/Documentos/Universidad/OO2/decorador-punto2");
		boolean resultadoEsperado = false;
		try {
			reporteSinVerificar.export(file);
			FileReader archivo = new FileReader("/home/tomas/Documentos/Universidad/OO2/decorador-punto2");
			BufferedReader br = new BufferedReader(archivo);
			resultadoEsperado = br.readLine().equals("Se grabo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(resultadoEsperado, true);

	}

}

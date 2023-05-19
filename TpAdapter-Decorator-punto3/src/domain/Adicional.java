package domain;

public class Adicional implements Adicionales {

	private Adicionales adicional;
	private String descripcion;
	private int costo;

	public Adicional(Adicionales adicional, String descripcion, int precio) {
		super();
		this.adicional = adicional;
		this.descripcion = descripcion;
		this.costo = precio;
	}

	@Override
	public void combo() {
		this.adicional.combo();
		System.out.println("Se le agrego: " + this.descripcion + " " + " Y el precio es: " + this.costo);

	}

}

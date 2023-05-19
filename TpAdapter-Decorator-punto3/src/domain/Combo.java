package domain;

public class Combo implements Adicionales {

	private String descripcion;
	private int costo;

	public Combo(String descripcion, int costo) {
		super();
		this.descripcion = descripcion;
		this.costo = costo;
	}

	@Override
	public void combo() {
		System.out.println("Combo: " + this.descripcion + " " + " Y el precio es: " + this.costo);
	}

}

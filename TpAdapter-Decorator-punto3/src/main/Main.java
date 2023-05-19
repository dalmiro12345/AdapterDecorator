package main;

import domain.Adicional;
import domain.Adicionales;
import domain.Combo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adicionales comboConPapas = new Adicional(new Combo("Basico", 200), "Con Papas", 150);
		comboConPapas.combo();

		System.out.println("///////////////////////////////////////////////////////////");
		Adicionales comboConPapasYTomate = new Adicional(comboConPapas, "Tomate", 200);
		comboConPapasYTomate.combo();
	}

}

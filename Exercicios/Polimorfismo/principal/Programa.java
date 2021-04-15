package Exercicios.Polimorfismo.principal;

import java.util.ArrayList;
import java.util.List;
import Exercicios.Polimorfismo.entidades.Circulo;
import Exercicios.Polimorfismo.entidades.Forma;
import Exercicios.Polimorfismo.entidades.Quadrado;
import Exercicios.Polimorfismo.util.UtilFormas;

public class Programa {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

		// Dever 
        UtilFormas.ler(circulo);
        UtilFormas.ler(quadrado);

		List<Forma> formas = new ArrayList<>();
		
		formas.add(circulo);
		formas.add(quadrado);
		
		UtilFormas.imprimir(formas);
		UtilFormas.imprimir(circulo);

	}

}
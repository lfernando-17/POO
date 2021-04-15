package Exercicios.Polimorfismo.util;

import java.util.List;
import java.util.Scanner;

import Exercicios.Polimorfismo.entidades.Circulo;
import Exercicios.Polimorfismo.entidades.Forma;
import Exercicios.Polimorfismo.entidades.Quadrado;

public final class UtilFormas {
	
	public static void imprimir(List<Forma> formas)
	{
		//percorrer a lista
		System.out.println("Areas de Formas Geométricas");
		for (Forma forma : formas) {
			
			if(forma instanceof Circulo )
				System.out.println("Area do Círculo = " + forma.getArea());
			else if(forma instanceof Quadrado)
				System.out.println("Area do Quadrado = " + forma.getArea());
			
		}
	}

	public static void imprimir(Circulo circulo) {
		System.out.println("Círculo");
		System.out.println("Area = " + circulo.getArea());
	}

    public static void ler(Circulo circulo) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do Raio : ");
        circulo.raio = in.nextDouble();
 
    }

    public static void ler(Quadrado quadrado) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do Lado: ");
        quadrado.lado = in.nextDouble();
        in.close();
    }

}
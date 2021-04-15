package Exercicios.Polimorfismo.entidades;

public class Circulo extends Forma {

	public Double raio;
	
	public Circulo()
	{
		raio = 0.0;
	}
	
	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public Double getArea() {
		
		return Math.PI * raio * raio; 
	}

}
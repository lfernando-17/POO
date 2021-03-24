package Exercicios.Herança;

public class BMW extends Carro {
    private int velocidade ;
    
    public BMW()
    {
        this.cor = "Preto";
        this.num_acentos = 4;
    }
    public void imprimir() {
        System.out.println("A velocidade do Carro é de : "+velocidade);
        System.out.println("A cor da BMW é de : "+this.cor);
        System.out.println("O numero de acentos da BMW é de : "+this.num_acentos);
    }
}

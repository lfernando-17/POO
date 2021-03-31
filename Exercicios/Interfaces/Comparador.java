package Exercicios.Interfaces;

import java.util.Comparator;

public class Comparador implements Comparator<Acao>{

    @Override
    public int compare(Acao o1, Acao o2) {
        if(o1.preco < o2.preco) return -1;
        else if (o1.preco > o2.preco) return +1;
        else return 0;
    }


}
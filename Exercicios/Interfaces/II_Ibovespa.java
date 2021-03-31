package Exercicios.Interfaces;
import java.util.ArrayList;

public interface II_Ibovespa {

    public static final float PI = 3.14f;

    public void listar(ArrayList<Acao> acoes);
    public void ordenar(ArrayList<Acao> acoes);
}
package Exercicios.Encapsulamento;

import java.util.Scanner;

public class TesterAluno {
    public static void main(String[] args) {
        Aluno pessoa = new Aluno();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        pessoa.nome = entrada.next();
        System.out.println("Digite sua matricula");
        pessoa.matricula = entrada.next();
        System.out.println("Digite o seu curso");
        pessoa.setCurso(entrada.next());

        pessoa.listar();
        entrada.close();
    }
}

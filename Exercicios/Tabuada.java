package Exercicios;

import java.util.Scanner;

/*
Nome : Luiz Fernando Amarino Gomes Leal
Matricula : 0050016658
*/
class Tabuada {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
      System.out.printf("Olá Luiz,entre com um numero : ");
      int numero = entrada.nextInt();
    System.out.println("Tabuada de Somar do "+numero);
    for(int i=0;i<=10;i++)
    {
        System.out.println(numero+"+"+i+"="+(numero+i));
    }
        
    entrada.close();
    }
  }
package Exercicios.Encapsulamento;

public class Aluno {
    public String matricula ;
    public String nome;
    public String curso ;

    public void listar(){
        System.out.println("Seu nome é "+this.nome+"\nSua matricula é "+this.matricula+"\nSeu curso é "+this.curso);
    }

    public void setCurso(String curso) {
        this.curso = curso;
        if (curso.equalsIgnoreCase("si"))
        {
            this.curso = "Sistemas de Informação";
        }
    }

    
}

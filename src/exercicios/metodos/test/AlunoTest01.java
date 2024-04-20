package exercicios.metodos.test;

import exercicios.metodos.dominio.Aluno;

import java.util.Scanner;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        aluno.setNomeAluno(input.nextLine());
        System.out.println();

        System.out.println("Informe o numero de matricula do aluno " + aluno.getNomeAluno() + ": ");
        aluno.setNumeroMatricula(input.nextInt());
        System.out.println();

        System.out.println(aluno.getNomeAluno() + " informe o nome do seu curso: ");
        input.nextLine();
        aluno.setNomeDoCurso(input.nextLine());
        System.out.println();

        System.out.println("Informe o nome das 3 diciplinas deste semestre: ");
        for (int i=0;i<aluno.disciplinas.length;i++){
            aluno.disciplinas[i] = input.nextLine();
        }
        System.out.println();

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println("Digite sua nota na materia -" + aluno.disciplinas[i] + "-");
            aluno.notas[i] = input.nextInt();
        }
        System.out.println();

        System.out.println(aluno);
        aluno.verificaAprovacao();
    }
}

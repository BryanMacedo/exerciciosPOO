package exercicios.metodos.dominio;
/*Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características de um Aluno,
como nome,matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas.
Desenvolva um método para verificar se o aluno está aprovado(nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário
e ao final informal o nome das disciplinas mostra as notas e mostra se o aluno foi aprovado ou não.*/

public class Aluno {
    private String nomeAluno;
    private int numeroMatricula;
    private String nomeDoCurso;
    public String[] disciplinas = new String[3];
    public int[] notas = new int[3];

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void verificaAprovacao(){
        for (int i = 0; i < 3; i++) {
            if (notas[i] > 7){
                System.out.println("Na materia " + disciplinas[i] + " você esta *APROVADO*");
            }else {
                System.out.println("Na materia " + disciplinas[i] +  " você esta *REPROVADO*");
            }
        }
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nomeAluno + "\n" +
                "Numero de matricula: " + this.numeroMatricula + "\n" +
                "Nome do curso: " + this.nomeDoCurso + "\n" +
                "Nomes das diciplinas: " + "\n" + disciplinas[0]+ "\n" +
                disciplinas[1]+ "\n" +
                disciplinas[2]+ "\n" +
                "Notas das materias: " + "\n" +
                disciplinas[0] + " nota: " + notas[0] + "\n" +
                disciplinas[1] + " nota: " + notas[1] + "\n" +
                disciplinas[2] + " nota: " + notas[2];
    }
}

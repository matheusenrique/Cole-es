import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAluno {
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void registrar(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimir() {
        System.out.println("Matrícula: " + alunos.getMatricula());
        System.out.println("Nome: " + alunos.getNome());
        System.out.println("Idade: " + alunos.getIdade());
        System.out.println("Curso: " + alunos.getCurso());
    }


    public static void main(String[] args) {
        CadastroAluno cadastro =  new CadastroAluno();

        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite os dados do Aluno " + i + "º :");
            int matricula = s.nextInt();
            String nome = s.nextLine();
            int idade = s.nextInt();
            String curso = s.nextLine();

            Aluno aluno = new Aluno(matricula, nome, curso, idade);
            cadastro.registrar(aluno);
        }

        cadastro.imprimir();
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<String, Aluno> mapaAlunos = new HashMap<>();
        
        Aluno a1 = new Aluno(1, "Rennan", 20, "Arquitetura");
        Aluno a2 = new Aluno(2, "Marina", 21, "Medicina");
        Aluno a3 = new Aluno(3, "Teteu", 22, "Engenharia");
        Aluno a4 = new Aluno(4, "Arthur", 19, "Medicina");
        Aluno a5 = new Aluno(5, "Bruna", 23, "Direito");
        
        mapaAlunos.put(a1.getMatricula(), a1);
        mapaAlunos.put(a2.getMatricula(), a2);
        mapaAlunos.put(a3.getMatricula(), a3);
        mapaAlunos.put(a4.getMatricula(), a4);
        mapaAlunos.put(a5.getMatricula(), a5);

        Scanner s = new Scanner(System.in);
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = s.nextInt();

        if (mapaAlunos.containsKey(matricula)) {
            Aluno aluno = mapaAlunos.get(matricula);
            System.out.println("Dados do aluno:");
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
    }


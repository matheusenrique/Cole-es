public class Aluno {
    //matricula,nome,idade e curso.
    private String matricula, nome, curso;
    private int idade;
    
    public Aluno(String matricula, String nome, String curso, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
}

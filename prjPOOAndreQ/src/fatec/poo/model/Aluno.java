package fatec.poo.model;

public class Aluno extends Pessoa{
    private String escolaridade;
    private Matricula matricula;
        
    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }
    
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    
    //ponteiro>>matricula
    public void setMatricula (Matricula matricula){
        this.matricula = matricula;
    }
    
}


package fatec.poo.model;

public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;    
    private Aluno aluno;
    private Matricula matricula;
    private Turma turma;
    private AVista avista;
    private APrazo aprazo;

    public Matricula(String data) {
        this.data = data;
    }
    //ponteiro>>aluno
    public void setAluno (Aluno aluno){
        this.aluno = aluno;
    }
    //ponteiro>>turma
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    //ponteiro>>avista   
    public void setAVista (AVista avista) {
        this.avista = avista;
    }
    //ponteiro>>aprazo
    public void setAPrazo (APrazo aprazo) {
        this.aprazo = aprazo;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void emitirCarne (){
        
    }
}

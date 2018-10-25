
package fatec.poo.model;

import java.util.ArrayList;

public class Turma {
    private String sigla;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdeVagas;
    private String observacoes;
    private Instrutor instrutor;
    private Curso curso;
    private ArrayList<Matricula> matriculas;

    public Turma(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        matriculas = new ArrayList<Matricula>();
    }
   
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public void addMatricula(Matricula m){
        matriculas.add(m);
        m.setTurma(this);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setQtdeVagas(int qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
    public void emitirListaFrequencia (){
        
    }
}

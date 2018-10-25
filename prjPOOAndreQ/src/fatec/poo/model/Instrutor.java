
package fatec.poo.model;

import java.util.ArrayList;

public class Instrutor extends Pessoa{
    private String formacao;
    private String areaAtuacao;
    private ArrayList<Turma> turmasInst;
    
    public Instrutor(String nome, String cpf) {
        super(nome, cpf);
        turmasInst = new ArrayList<Turma> ();
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    public void addTurma (Turma t){
        turmasInst.add(t);
        t.setInstrutor(this);
    }
    
}

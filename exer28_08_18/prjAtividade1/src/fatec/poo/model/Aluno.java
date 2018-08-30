package fatec.poo.model;
public class Aluno {
    private int ra;
    private double notaP1, notaP2, notaT1, notaT2;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }

    public double getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }

    public double getNotaT1() {
        return notaT1;
    }

    public void setNotaT1(double notaT1) {
        this.notaT1 = notaT1;
    }

    public double getNotaT2() {
        return notaT2;
    }

    public void setNotaT2(double notaT2) {
        this.notaT2 = notaT2;
    }
    
    //----CALCULOS---//
    public double calcMediaProva () {
        return (0.75*(notaP1+2*notaP2)/3);
    }
    public double calcMediaTrab () {
        return (0.25*(notaT1+notaT2)/2);
    }
    public double calcMediaFinal () {
        return (calcMediaProva()+calcMediaTrab());
    }
}



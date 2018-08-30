package fatec.poo.model;
public class ContaTelefonica {
    int numero, tipo, qtdePulsos, qtdeInter, qtdeServDesp;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getQtdePulsos() {
        return qtdePulsos;
    }

    public void setQtdePulsos(int qtdePulsos) {
        this.qtdePulsos = qtdePulsos;
    }

    public int getQtdeInter() {
        return qtdeInter;
    }

    public void setQtdeInter(int qtdeInter) {
        this.qtdeInter = qtdeInter;
    }

    public int getQtdeServDesp() {
        return qtdeServDesp;
    }

    public void setQtdeServDesp(int qtdeServDesp) {
        this.qtdeServDesp = qtdeServDesp;
    }
    
    //---CALCULOS---//
    public double calcValorConta (){
        double taxa = 0, totalP = 0;
        double totalI = 0, totalSD = 0;
        //--quantidade da taxa---//
        if (tipo==1) {
            taxa = 10;
        }else{
            taxa = 15;
        }
        //--quantidade de pulsos---//
        if (qtdePulsos>90){
            totalP = (qtdePulsos - 90)*0.05;
        }else{
            totalP = 0;
        }
        //--quantidade de Interurbanos---//
        totalI = (qtdeInter*60)*0.08;
        //--quantidade de Serviço de Despertador---//
        totalSD = qtdeServDesp*2;        
        return (taxa+totalP+totalI+totalSD);
    }
}

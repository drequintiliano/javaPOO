
import fatec.poo.model.ContaTelefonica;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        int numero, tipo, qtdePulsos, qtdeInter, qtdeServDesp;
        
        ContaTelefonica objContaTel1 = new ContaTelefonica();
        
        System.out.println("Digite o numero de Telefone: \n");
        numero = entrada.nextInt();
        objContaTel1.setNumero(numero);
        System.out.println("Digite o tipo de conta \n1-Residencial\n2-Comercial\n");
        tipo = entrada.nextInt();
        objContaTel1.setTipo(tipo); 
        System.out.println("Digite a quantidade de Pulsos: \n");
        qtdePulsos = entrada.nextInt();
        objContaTel1.setQtdePulsos(qtdePulsos);
        System.out.println("Digite a quantidade de Ligações Interurbanas: \n");
        qtdeInter = entrada.nextInt();
        objContaTel1.setQtdeInter(qtdeInter);
        System.out.println("Digite a quantidade de Serviços Despertador: \n");
        qtdeServDesp = entrada.nextInt();
        objContaTel1.setQtdeServDesp(qtdeServDesp);
        
        System.out.println("\nNumero do Telefone: " + objContaTel1.getNumero());
        System.out.println("Valor da Conta:     R$ " + df.format(objContaTel1.calcValorConta()));
    } 
}

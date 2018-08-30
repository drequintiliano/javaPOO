
import fatec.poo.model.Aluno;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Aluno objAluno1 = new Aluno();
        
        int ra;
        double notaP1, notaP2, notaT1, notaT2;
        
        System.out.println("Digite o RA: \n");
        ra = entrada.nextInt();
        objAluno1.setRa(ra);
        System.out.println("Digite a nota da 1. Prova: \n");
        notaP1 = entrada.nextDouble();
        objAluno1.setNotaP1(notaP1);
        System.out.println("Digite a nota da 2. Prova: \n");
        notaP2 = entrada.nextDouble();
        objAluno1.setNotaP2(notaP2);
        System.out.println("Digite a nota do 1. Trabalho: \n");
        notaT1 = entrada.nextDouble();
        objAluno1.setNotaT1(notaT1);
        System.out.println("Digite a nota do 2. Trabalho: \n");
        notaT2 = entrada.nextDouble();
        objAluno1.setNotaT1(notaT2);
        
        System.out.println("\n Nota P1: " + objAluno1.getNotaP1());
        System.out.println("\n Nota P2: " + objAluno1.getNotaP2());
        System.out.println("\n Nota T1: " + objAluno1.getNotaT1());
        System.out.println("\n Nota T2: " + objAluno1.getNotaT2());
        System.out.println("\n Media das Provas: " + objAluno1.calcMediaProva());
        System.out.println("\n Media dos Trabalhos: " + objAluno1.calcMediaTrab());
        System.out.println("\n Media Final: " + objAluno1.calcMediaFinal());
    }
}

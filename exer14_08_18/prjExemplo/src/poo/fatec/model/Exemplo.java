package poo.fatec.model;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int RA;
        double ntPrv1, ntPrv2, Media;
        String Nome;
        
        System.out.println("Digite o RA: ");
        RA = Entrada.nextInt();
        System.out.println("Digite o Nome: ");
        Nome = Entrada.next();
        System.out.println("Digite a nota 1: ");
        ntPrv1 = Entrada.nextDouble();
        System.out.println("Digite a nota 2: ");
        ntPrv2 = Entrada.nextDouble();
        
        Media = (ntPrv1 + ntPrv2)/2;
        System.out.printf("Media: " + Media);
        
        if (Media>=6){
            System.out.println("\nAprovado"); 
        }
        else{
            System.out.println("Reprovado");
        }
    }
}

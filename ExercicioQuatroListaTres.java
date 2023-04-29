//  Faça um programa que leia 5 números e informe a soma e a média dos números.

import java.util.Scanner;

public class ExercicioQuatroListaTres 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            double numUm, numDois, numTres, numQuatro, numCinco, soma, media1, media2, media3, media4, media5, mediaGeral;
            String titulo = "Soma e Média";
            System.out.println(titulo);
            System.out.println("Informe o primeiro número:");
            numUm = sc.nextDouble();
            System.out.println("Informe o segundo número:");
            numDois = sc.nextDouble();
            System.out.println("Informe o terceiro número:");
            numTres = sc.nextDouble();
            System.out.println("Informe o quarto número:");
            numQuatro = sc.nextDouble();
            System.out.println("Informe o quinto número:");
            numCinco = sc.nextDouble();
                soma = (numUm + numDois + numTres + numQuatro + numCinco);
                System.out.println("A soma dos número é: " + soma);
                    media1 = (numUm / 2);
                    System.out.println("A média do primeiro número é: " + media1);
                    media2 = (numDois / 2);
                    System.out.println("A média do segundo número é: " + media2);
                    media3 = (numTres / 2);
                    System.out.println("A média do terceiro número é: " + media3); 
                    media4 = (numQuatro / 2);
                    System.out.println("A média do quarto número é: " + media4); 
                    media5 = (numCinco / 2);
                    System.out.println("A média do quinto número é: " + media5);
                    mediaGeral = ((numUm + numDois + numTres + numQuatro + numCinco) / 2);
                    System.out.println("A média geral é: " + mediaGeral);
                        sc.close();    
    }
}

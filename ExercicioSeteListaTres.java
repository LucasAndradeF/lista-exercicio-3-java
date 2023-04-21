import java.util.Scanner;

public class ExercicioSeteListaTres {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            String titulo = "Números Pares e Ímpares";
            System.out.println(titulo);
            System.out.println("Informe o primeiro número");
            int numUm = sc.nextInt();
            System.out.println("Informe o segundo número");
            int numDois = sc.nextInt();
            System.out.println("Informe o terceiro número");
            int numTres = sc.nextInt();
            System.out.println("Informe o quarto número");
            int numQuatro = sc.nextInt();
            System.out.println("Informe o quinto número");
            int numCinco = sc.nextInt();
            System.out.println("Informe o sexto número");
            int numSeis = sc.nextInt();
            System.out.println("Informe o sétimo número");
            int numSete = sc.nextInt();
            System.out.println("Informe o oitavo número");
            int numOito = sc.nextInt();
            System.out.println("Informe o nono número");
            int numNove = sc.nextInt();
            System.out.println("Informe o décimo número");
            int numDez = sc.nextInt();
            int soma = (numUm + numDois + numTres + numQuatro + numCinco + numSeis + numSete + numOito + numNove + numDez);
            System.out.println("\nA soma é: " + soma);
            int menor;
                if (numUm < numDois && numUm < numTres && numUm < numQuatro && numUm < numCinco && numUm < numSeis && numUm < numSete && numUm < numOito && numUm < numNove && numUm < numDez) {
                menor = numUm;
                } else if (numDois < numUm && numDois < numTres && numDois < numQuatro && numDois < numCinco && numDois < numSeis && numDois < numSete && numDois < numOito && numDois < numNove && numDois < numDez) {
                    menor = numDois;
                } else if (numTres < numUm && numTres < numDois && numTres < numQuatro && numTres < numCinco && numTres < numSeis && numTres < numSete && numTres < numOito && numTres < numNove && numTres < numDez) {
                    menor = numTres;
                } else if (numQuatro < numUm && numQuatro < numDois && numQuatro < numTres && numQuatro < numCinco && numQuatro < numSeis && numQuatro < numSete && numQuatro < numOito && numQuatro < numNove && numQuatro < numDez) {
                    menor = numQuatro;
                } else if (numCinco < numUm && numCinco < numDois && numCinco < numTres && numCinco < numQuatro && numCinco < numSeis && numCinco < numSete && numCinco < numOito && numCinco < numNove && numCinco < numDez) {
                    menor = numCinco;
                } else if (numSeis < numUm && numSeis < numDois && numSeis < numTres && numSeis < numQuatro && numSeis < numCinco && numSeis < numSete && numSeis < numOito && numSeis < numNove && numSeis < numDez) {
                    menor = numSeis;
                } else if (numSete < numUm && numSete < numDois && numSete < numTres && numSete < numQuatro && numSete < numCinco && numSete < numSeis && numSete < numOito && numSete < numNove && numSete < numDez) {
                    menor = numSete;
                } else if (numOito < numUm && numOito < numDois && numOito < numTres && numOito < numQuatro && numOito < numCinco && numOito < numSeis && numOito < numNove && numOito < numDez) {
                    menor = numOito;
                } else if (numNove < numUm && numNove < numDois && numNove < numTres && numNove < numQuatro && numNove < numCinco && numNove < numSeis && numNove < numOito && numNove < numDez) {
                    menor = numNove;
                } else {
                    menor = numDez;
                }
                    for (int numero = menor; numero <= soma; numero = (numero + 1))
                        if(numero % 2 == 0) {
                    System.out.println("Os números pares são: " + numero);
                    } for (int numero = menor; numero <= soma; numero = numero + 2) {
                    System.out.println("Os números ímpares são: " + numero);
                    }
                        sc.close();       
    }
}




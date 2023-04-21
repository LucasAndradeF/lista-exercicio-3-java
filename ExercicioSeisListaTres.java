import java.util.Scanner;

public class ExercicioSeisListaTres {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String titulo = "Números Compreendidos entre o Intervalo";
        System.out.println(titulo);
        System.out.println("Informe o primeiro número:" );
        int numUm = sc.nextInt();
        System.out.println("Informe o segundo número:");
        int numDois = sc.nextInt();
            for (int numero = numUm; numero <= numDois; numero = numero + 1) {
            System.out.println("Os números são:" + numero);
            }
                sc.close(); 
    }
}
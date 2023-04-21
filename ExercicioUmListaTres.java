import java.util.Scanner;

public class ExercicioUmListaTres {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double notas;
        String titulo = "Notas Alunos";
        System.out.println(titulo);
        System.out.println("Digite um número:");
        notas = sc.nextDouble();
            while ((notas < 0) || (notas > 10)) {
            System.out.println("Nota inválida!\n" + "Digite outra nota");
            notas = sc.nextDouble();
        }  
    }
}
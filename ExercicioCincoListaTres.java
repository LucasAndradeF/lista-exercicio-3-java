import java.util.Scanner;

public class ExercicioCincoListaTres {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String titulo = "Gerador de Números Ímpares";
        System.out.println(titulo);                
            for (int numero = 1; numero <= 50; numero = numero + 2) {
                System.out.println("Os números ímpares são:" + numero);
            }
                sc.close();
    }
}
//  Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

import java.util.Scanner;

public class ExercicioDoisListaTres {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);             
            String titulo = "Programa de Login";
            System.out.println(titulo);
            System.out.println("Digite o nome de usuário:");
            String nomeUsuario = sc.next();        
            System.out.println("Digite a sua senha:");      
            String senha = sc.next();
                while (nomeUsuario.equals(senha)) {
                    System.out.println("n/Erro!");                
                    System.out.println("Digite o nome de usuário:");
                    nomeUsuario = sc.next();        
                    System.out.println("Digite a sua senha:");      
                    senha = sc.next();
                }
    }
}





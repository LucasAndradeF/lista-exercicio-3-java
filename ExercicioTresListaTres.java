// Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres;
// Idade: entre 0 e 150;
// Salário: maior que zero;
// Sexo: 'f' ou 'm';
// Estado Civil: 's', 'c', 'v', 'd';

import java.util.Scanner;

public class ExercicioTresListaTres {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            String titulo = "Validação de Informações";
            System.out.println(titulo);
            String nome, sexo, estadoCivil;
            int idade;
            double salario;
            
            do { 
                System.out.println("Informe o seu nome:");
                nome = sc.next();
                if (nome.length() < 3) {
                    System.out.println("O nome precisar ter mais que 3 caracteres!");
                }
            } while (nome.length() < 3);
                        
            do { 
                System.out.println("Informe a sua idade:");
                idade = sc.nextInt();
                if (idade <= 0 || idade >= 150) {
                   System.out.println("A idade deve estar entre 0 e 150 anos!");
                }   
                } while (idade <= 0 || idade >= 150);

            do {
                System.out.println("Informe o seu salário:");
                salario = sc.nextDouble();
                if (salario < 0) {
                System.out.println("O salário deve ser maior que R$ 0.");
                }
            } while (salario < 0);

            do {
                System.out.println("Informe o seu sexo com 'M' ou 'F': Utilize ('M' para Masculino) e ('F' para Feminino)");   
                sexo = sc.next();
                    if (!sexo.equalsIgnoreCase("M") && (!sexo.equalsIgnoreCase("F"))) {
                    System.out.println("O sexo escolhido deve ser masculino ou feminino.");
                    }
                } while (!sexo.equalsIgnoreCase("M") && (!sexo.equalsIgnoreCase("F")));
            
            do {
                System.out.println("Informe o seu Estado Civil: Utilize ('S' para Solteiro), ('C' para Casado), ('V' para Viuvo) e ('D' para Divorciado)");   
                estadoCivil = sc.next();
                if (!estadoCivil.equalsIgnoreCase("s") && (!estadoCivil.equalsIgnoreCase("c")) && (!estadoCivil.equalsIgnoreCase("v")) && (!estadoCivil.equalsIgnoreCase("d"))) {
                System.out.println("Estado Civil incorreto, tente novamente.");
                }
            } while (!estadoCivil.equalsIgnoreCase("s") && (!estadoCivil.equalsIgnoreCase("c")) && (!estadoCivil.equalsIgnoreCase("v")) && (!estadoCivil.equalsIgnoreCase("d")));
                sc.close();
        }
    }                              
        

        


 

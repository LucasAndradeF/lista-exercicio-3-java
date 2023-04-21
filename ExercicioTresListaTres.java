import java.util.Scanner;

public class ExercicioTresListaTres {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            String titulo = "Validação de Informações";
            System.out.println(titulo);
            System.out.println("Informe o seu nome:");
            String nome = sc.next();
                if (nome.length() < 3) {
                System.out.println("Erro!");
                }
                    System.out.println("Informe a sua idade:");
                    int idade = sc.nextInt();
                        if ((idade > 0) && (idade < 150)) {
                        } else {System.out.println("Erro!");
                        }
                            System.out.println("Informe o seu salário:");
                            double salario = sc.nextDouble();
                                if (salario > 0) {
                                } else {System.out.println("Erro!");
                                }
                                    System.out.println("Informe o seu sexo:");   
                                    String sexo = sc.next();
                                        if (sexo.equals("m") || (sexo.equals("f"))) {
                                        } else {
                                        System.out.println("Erro!");
                                        }        
                                            System.out.println("Informe o seu Estado Civil:");   
                                            String estadoCivil = sc.next();
                                                if (estadoCivil.equals("s") || (estadoCivil.equals("c")) || (estadoCivil.equals("v")) || (estadoCivil.equals("d"))) {
                                                } else {
                                                System.out.println("Erro!");
                                                }
                                                    sc.close();
    }
}
                                
        

        


 
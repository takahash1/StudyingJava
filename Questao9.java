
package listadeexercicio;
import java.util.Scanner;

public class exercicio9comvetor {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        double salario, resultado;
        int mesesdetrabalho, x;

        System.out.println("Selecione uma opção:");
        System.out.println("1- Novo Salário");
        System.out.println("2- Férias");
        System.out.println("3- Décimo Terceiro");
        System.out.println("4- Sair");

        x = s.nextInt();

        if (x == 1) {
            System.out.println("Opção 1 selecionada, informe seu salário");
            salario = s.nextDouble();

            if (salario <= 999.99) {
                System.out.println("O valor do novo salário será: " + salario * 1.15);

            }

            if (salario > 1000 && salario <= 2000) {
                System.out.println("O valor do novo salário será: " + salario * 1.10);

            }

            if (salario > 2000) {
                System.out.println("O valor do novo salário será: " + salario * 1.05);

            }

        } else {

            if (x == 2) {
                System.out.println("Opção 2 selecionada, informe seu salário");
                salario = s.nextDouble();
                System.out.println("O valor de suas férias são: " + salario * 1.33);
            } else {

                if (x == 3) {
                    System.out.println("Opção 3 selecionada, informe seu salário");
                    salario = s.nextDouble();

                    System.out.println("Informe quantos meses trabalhados neste ano");
                    mesesdetrabalho = s.nextInt();

                    resultado = (salario * mesesdetrabalho) / 12;

                    System.out.println("O valor do décimo terceiro é de: " + resultado);
                } else {

                    if (x == 4) {
                        System.out.println("Opção 4 seledionada, você saiu.");
                        
                    } else {
                        
                        System.out.println("Erro, insira uma opção válida!");
                        
                    }                    
                }
            }
        }
    }
        

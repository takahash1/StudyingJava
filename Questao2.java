
package listadeexercicio;
import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        
        double valor;
        String pagamento;
        
        System.out.println("Insira o valor do produto: ");
        valor= s.nextDouble();
        s.nextLine();
        
        System.out.println("Insira a forma de pagamento: ");
        pagamento= s.nextLine();        
        
        if (pagamento.equals("1")){
            System.out.println("O valor do produto é: "+ valor * 0.9);
        }
        
        if (pagamento.equals("2")){
            System.out.println("O valor do produto é: "+ valor * 0.95);
        }
        
        if (pagamento.equals("3")){
            System.out.println("O valor do produto será duas parcelas de: "+ valor / 2);
        }
        
        if (pagamento.equals("4")){
            System.out.println("O valor do produto será três parcelas de: "+ valor * 1.1 / 3);            
        }
        
    }
}

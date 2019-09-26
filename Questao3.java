package listaexercicios;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Digite seu pego em kg: ");
        peso = s.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        altura = s.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é igual a " + imc);

        if (imc < 18.5) {
            System.out.println("Este IMC significa que você está abaixo do peso ideal.");
        }
        if (imc >= 18.5 && imc <= 25) {
            System.out.println("Este IMC significa que você está no peso ideal.");
        }
        if (imc > 25 && imc <= 30) {
            System.out.println("Este IMC significa que você está acima do peso.");
        }
        if (imc > 30) {
            System.out.println("Este IMC significa que você está obeso.");
        }

    }
}

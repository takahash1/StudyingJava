package listaexercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double media = 0, soma = 0, maior = 0;
        double[] indice = new double[31];
        int dia = 0;

        for (int x = 0; x < 31; x++) {
            System.out.println("Digite o índice pluviométrico captado: ");
            indice[x] = s.nextDouble();
            soma += indice[x];
            media = soma / 31;
            dia = x + 1;

            if (indice[x] > maior) {
                maior = indice[x];
            }

        }
        System.out.println("A soma dos índices é " + soma);
        System.out.println("A média dos índices é " + media);
        System.out.println("O maior índice captado foi " + maior + "m³ no dia " + dia);
    }
}

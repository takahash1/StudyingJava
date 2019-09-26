package javaapplication1;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double massaInicial, massaFinal = 0, tempo = 0, cont = 0;
        
        System.out.println("Digite a massa do material coletado (em gramas): ");
        massaInicial = s.nextDouble();
        
        while(massaInicial >= 0.5){
            massaInicial = massaInicial/2;
            cont += 1;
            tempo = cont*50;
             
        }
        System.out.println("O material iniciou com massa " + massaInicial + " e foi para " + massaFinal + " em " + tempo + " segundos!");

    }
  }


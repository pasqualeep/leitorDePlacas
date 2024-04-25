/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leitordeplacas;

import java.util.Scanner;
public class LeitorDePlacas {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê o número de placas de carro
        System.out.print("Digite o número de placas de carro: ");
        int numPlacas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        String[] placas = new String[numPlacas];
        
        // Lê as placas de carro
        for (int i = 0; i < numPlacas; i++) {
            System.out.print("Digite a placa de carro " + (i+1) + ": ");
            placas[i] = scanner.nextLine();
        }
        
        // Verifica se há placas iguais
        boolean placasIguaisEncontradas = false;
        for (int i = 0; i < numPlacas; i++) {
            for (int j = i+1; j < numPlacas; j++) {
                if (placasIguais(placas[i], placas[j])) {
                    System.out.println("Placas iguais encontradas: " + placas[i] + " e " + placas[j]);
                    placasIguaisEncontradas = true;
                }
            }
        }
        if (!placasIguaisEncontradas) {
            System.out.println("Não foram encontradas placas iguais.");
        }
                scanner.close();

    }
}

   
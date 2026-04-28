/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividavaliativa27.pkg04.pkg2026.glender;

import java.util.Scanner;

/**
 *
 * @author Luana
 */
public class ATIVIDAVALIATIVA27042026GLENDER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 Scanner sc = new Scanner(System.in);

        int[][] sala = new int[6][8];
        int opcao;

        do {
            System.out.println("\n===== CINEMA =====");
            System.out.println("1 - Reservar assento");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Exibir mapa da sala");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

      
            if (opcao == 1) {

                System.out.print("Fileira (1 a 6): ");
                int fileira = sc.nextInt();

                System.out.print("Assento (1 a 8): ");
                int assento = sc.nextInt();

                if (sala[fileira - 1][assento - 1] == 0) {
                    sala[fileira - 1][assento - 1] = 1;
                    System.out.println("Assento reservado com sucesso!");
                } else {
                    System.out.println("Assento ja esta ocupado! Por favor selecione outro!");
                }
            }

            else if (opcao == 2) {

                System.out.print("Fileira (1 a 6): ");
                int fileira = sc.nextInt();

                System.out.print("Assento (1 a 8): ");
                int assento = sc.nextInt();

                if (sala[fileira - 1][assento - 1] == 1) {
                    sala[fileira - 1][assento - 1] = 0;
                    System.out.println("Reserva cancelada!");
                } else {
                    System.out.println("Assento ja esta livre!");
                }
            }

  
            else if (opcao == 3) {

                System.out.println("\nMapa da sala:");

                int ocupados = 0;
                int livres = 0;

                for (int i = 0; i < 6; i++) {
                    System.out.print("Fileira " + (i + 1) + ": ");

                    for (int j = 0; j < 8; j++) {
                        System.out.print(sala[i][j] + " ");

                        if (sala[i][j] == 1) {
                            ocupados++;
                        } else {
                            livres++;
                        }
                    }

                    System.out.println();
                }

                System.out.println("\n ESTATISTICAS ");
                System.out.println("Assentos ocupados: " + ocupados);
                System.out.println("Assentos livres: " + livres);
            }

        } while (opcao != 4);

        System.out.println("Sistema encerrado.");
        sc.close();
    }
}

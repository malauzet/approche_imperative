package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {

        // Consigne : Demander à l’utilisateur de choisir une option dans le menu.
        // Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur
        // puis l’ajoute à un tableau.
        // Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
        // Si le tableau est plein, écrire un algorithme pour agrandir le tableau.
        Scanner scanner = new Scanner(System.in);

        int[] tableau = new int[5];
        int taille = 0;
        int choix = 0;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher le tableau");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez un nombre : ");
                    int nombre = scanner.nextInt();

                    if (taille == tableau.length) {
                        int[] nouveauTableau = new int[tableau.length * 2];
                        for (int i = 0; i < tableau.length; i++) {
                            nouveauTableau[i] = tableau[i];
                        }
                        tableau = nouveauTableau;
                        System.out.println("Tableau agrandi à " + tableau.length + " cases.");
                    }

                    tableau[taille] = nombre;
                    taille++;
                    System.out.println("Nombre ajouté !");
                    break;

                case 2:
                    if (taille == 0) {
                        System.out.println("Le tableau est vide.");
                    } else {
                        System.out.print("Contenu du tableau : ");
                        for (int i = 0; i < taille; i++) {
                            System.out.print(tableau[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Option invalide. Veuillez choisir 1, 2 ou 3.");
            }
        } while (choix != 3);
    }
}

package fr.algorithmie;

import java.util.Arrays;

public class AffichagePartiel {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Tableau : " + Arrays.toString(array));

        System.out.println("-------------");

        // Consigne : Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        System.out.print("Affichage des élément du tableau supérieurs à 3 : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3 ) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\n-------------");

        // Consigne : Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        System.out.print("Affichage des éléments pairs du tableau : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\n-------------");

        // Consigne : Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
        System.out.println("Affichage des éléments d'index pair du tableau :");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index " + i + " : " + array[i]);
            }
        }

        System.out.println("-------------");

        // Consigne : Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        System.out.print("Affichage des éléments impair du tableau : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

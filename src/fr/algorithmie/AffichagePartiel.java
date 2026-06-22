package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Consigne : Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        System.out.println("Affichage des élément du tableau supérieurs à 3 :");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3 ) {
                System.out.println(array[i] + " est supérieur à 3.");
            }
        }

        System.out.println("\n-------------\n");

        // Consigne : Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        System.out.println("Affichage des éléments pairs du tableau :");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " est un nombre pair.");
            }
        }

        System.out.println("\n-------------\n");

        // Consigne : Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
        System.out.println("Affichage des éléments d'index pair du tableau :");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index " + i + " : " + array[i]);
            }
        }

        System.out.println("\n-------------\n");

        // Consigne : Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        System.out.println("Affichage des éléments impair du tableau :");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + " est un nombre impair.");
            }
        }
    }
}

package fr.algorithmie;

import java.util.Arrays;

public class RechercheMax {
    public static void main(String args[]) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Consigne : Rechercher le plus grand élément du tableau
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Affichage du plus grand élément trouvé dans le tableau
        System.out.println(Arrays.toString(array));
        System.out.println("Le plus grand élément de ce tableau est : " + max);
    }
}

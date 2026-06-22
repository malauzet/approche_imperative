package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3};

        // Consigne : Effectuez une rotation à droite des éléments.
        // Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
        int[] rotated = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            rotated[(i + 1) % array.length] = array[i];
        }
        System.out.println("Tableau de base : " + Arrays.toString(array));
        System.out.println("Tableau avec une rotation à droite : " + Arrays.toString(rotated));
    }
}

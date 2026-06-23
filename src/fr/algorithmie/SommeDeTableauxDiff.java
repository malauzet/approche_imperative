package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
        int[] tableau3 = new int[tableau1.length];

        // Consigne : Créer un tableau somme dont chaque case contient la somme des valeurs situées dans
        // les cases de même index des autres tableaux. Pour les index qui excède la taille du plus
        // petit des 2 tableaux, on fait comme si la valeur était 0 pour le petit tableau.
        System.out.println("Affichage du résultat :\n");

        int index = 0;

        while (index < tableau2.length) {
            tableau3[index] = tableau1[index] + tableau2[index];
            index++;
        }
        while(index >= tableau2.length &&  index < tableau1.length) {
            tableau3[index] = tableau1[index];
            index++;
        }
        System.out.println("Tableau 1 : " + Arrays.toString(tableau1));
        System.out.println("Tableau 2 : " + Arrays.toString(tableau2));
        System.out.println("Résultat  : " + Arrays.toString(tableau3));
    }
}

package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {

        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        int[] tableau3 = new int[tableau1.length];


        // Consigne : Créer un tableau somme dont chaque case contient la somme des valeurs
        // situées dans les cases de même index des autres tableaux.

        // Vérification pas nécessaire ici mais je la met quand même
        if (tableau1.length != tableau2.length) {
            System.out.println("Les tableaux ne sont pas de la même taille.");
        }
        else  {
            System.out.println("Affichage du tableau faisant l'addition des deux premiers.");
            for (int i = 0; i < tableau1.length; i++) {
                tableau3[i] = tableau1[i] + tableau2[i];
                System.out.println(tableau3[i]);
            }
        }
    }
}

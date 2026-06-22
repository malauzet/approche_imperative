package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String args[]) {

        double[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Consigne : Quelle est la moyenne des éléments du tableau ?
        double total = 0;
        double moyenne = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        moyenne = total / array.length;

        // Affichage de la moyenne
        System.out.format("Moyenne des éléments du tableau: %.2f", moyenne);
    }
}

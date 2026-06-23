package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Consigne : Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
        int[] arrayCopy = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            arrayCopy[j] = array[i];
        }

        // Consigne : Afficher l’ensemble des éléments des 2 tableaux
        System.out.print("Affichage des éléments du tableau : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nAffichage des inversée du tableau : ");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
    }
}

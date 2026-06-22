package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {

        // Consigne : Écrire un programme qui demande 10 nombres à un utilisateur
        // et qui affiche le plus grand de ces nombres.
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int max = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Veuillez entrer un nombre entier (Reste : " + (10 - i) + ") : ");
            int nb = scanner.nextInt() ;
            array[i] = nb;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Le nombre maximum dans votre saisit est : " + max);
    }
}

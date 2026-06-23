package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {

        // Consigne : Écrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants.
        // Exemple : Si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13, 14, 15.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre entier : ");
        int nb = scanner.nextInt();

        System.out.print("Liste des 10 nombres qui suivent " + nb + " : ");
        for (int i = 1; i <= 10; i++) {
            if (i <= 9) System.out.print(nb + i + ", ");
            else System.out.print(nb + i + ".");
        }
    }
}

package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {

        // Consigne : Écrire un programme qui demande un nombre à l’utilisateur puis calcule la somme
        // de tous les entiers compris entre 1 et ce nombre.
        Scanner scanner = new Scanner(System.in);

        // Remarque : Aucune prise en compte des erreurs dû à la taille des int.
        System.out.println("Veuillez entrer un nombre entier (n) pour caculer la somme de 1 à n : ");
        long nb = scanner.nextLong();
        long total = 0;

        for (long i = 1; i <= nb; i++) {
            total += i;
        }

        System.out.println("La somme de 1 à " + nb + " est égale à : " + total);
    }
}

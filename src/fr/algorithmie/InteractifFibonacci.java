package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {

        // Contexte : La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de
        // rang N est égal à la somme des nombres de rangs N-1 et N-2
        // Consigne :
        // 1) Demander à l’utilisateur de choisir un rang N
        // 2) Écrire un algorithme qui calcule et affiche le nombre de rang N
        // Rang : 0 1   2   3   4   5   6   7   8   9   10  11  12  13  14  15
        // Resu : 0 1   1   2   3   5   8   13  21  34  55  89  144 233 377 610
        Scanner scanner = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.print("Veuillez entrer un nombre entier : ");
        int nb = scanner.nextInt();

        if (nb == 0) System.out.println("Le nombre de rang 0 est : " + n1);
        else if (nb == 1) System.out.println("Le nombre de rang 1 est : " + n2);
        else {
            for (int i = 1; i < nb; i++) {
                n3 = n2 + n1;
                n1 = n2;
                n2 = n3;
            }
            System.out.println("Le nombre de rang " + nb + " est : " + n3);
        }
    }
}

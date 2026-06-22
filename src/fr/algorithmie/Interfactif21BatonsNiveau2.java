package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21BatonsNiveau2 {
    public static void main(String[] args) {

        // Contexte :
        // Niveau un peu plus difficile que Interfactif21Batons

        int nbBatons = 21;
        int nbBatPris = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Voulez-vous commencer en premier ? (O/N)");
        String choix = scanner.next();

        while (nbBatons > 0) {

            if (choix.equals("O") || choix.equals("Oui") || choix.equals("o") ||  choix.equals("oui")) {
                System.out.println("Il reste " + nbBatons + " batons dans en jeu.");
                System.out.println("Combien de bâtons prenez-vous ? (1, 2 ou 3)");
                nbBatPris = scanner.nextInt();

                // On prend le nombre min si on entre un chiffre < 1 et le max si on entre un > 3.
                if (nbBatPris < 1) nbBatPris = 1;
                else if (nbBatPris > 3) nbBatPris = 3;

                nbBatons = nbBatons - nbBatPris;

                if (nbBatons <= 0) System.out.println("Tu as perdu !");
                else {
                    System.out.println("Il reste " + nbBatons + " batons dans en jeu.");

                    nbBatPris = nbBatons % 4;
                    if (nbBatPris == 0) nbBatPris = 1;

                    System.out.println("L'ordinateur prend " + nbBatPris + " bâton(s).");

                    nbBatons = nbBatons - nbBatPris;

                    if (nbBatons <= 0) System.out.println("Tu as gagné !");
                }
            }
            else {
                System.out.println("Il reste " + nbBatons + " batons dans en jeu.");

                nbBatPris = nbBatons % 4;
                if (nbBatPris == 0) nbBatPris = 1;

                System.out.println("L'ordinateur prend " + nbBatPris + " bâton(s).");

                nbBatons = nbBatons - nbBatPris;

                if (nbBatons <= 0) System.out.println("Tu as gagné !");
                else {
                    System.out.println("Il reste " + nbBatons + " batons dans en jeu.");
                    System.out.println("Combien de bâtons prenez-vous ? (1, 2 ou 3)");
                    nbBatPris = scanner.nextInt();

                    // On prend le nombre min si on entre un chiffre < 1 et le max si on entre un > 3.
                    if (nbBatPris < 1) nbBatPris = 1;
                    else if (nbBatPris > 3) nbBatPris = 3;

                    nbBatons = nbBatons - nbBatPris;

                    if (nbBatons <= 0) System.out.println("Tu as perdu !");
                }
            }
        }
    }
}

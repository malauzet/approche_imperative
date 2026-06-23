package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {

        // Contexte :
        // Le jeu démarre avec un total de 21 bâtons.
        // Celui qui joue en 1er, joueur ou ordinateur, est tiré aléatoirement.
        // A tour de rôle, l’ordinateur et le joueur doivent prendre entre 1 et 3 bâtons.
        // Celui qui prend le dernier bâton a perdu.

        int nbBatons = 21;
        int nbBatPris = 0;

        Scanner scanner = new Scanner(System.in);

        double random =  Math.random();
        boolean userStart = random < 0.5;

        while (nbBatons > 0) {

            System.out.println("Il reste " + nbBatons + " batons dans en jeu.");

            if (userStart) {
                System.out.print("Prenez entre 1 et 3 bâtons : ");
                nbBatPris = scanner.nextInt();

                // On prend le nombre min si on entre un chiffre < 1 et le max si on entre un > 3.
                if (nbBatPris < 1) nbBatPris = 1;
                else if (nbBatPris > 3) nbBatPris = 3;

                nbBatons = nbBatons - nbBatPris;

                if (nbBatons <= 0) System.out.print("Tu as perdu !");
                else {
                    System.out.println("Il reste " + nbBatons + " batons dans en jeu.");

                    int nbRandom = (int) ((3 * Math.random()) + 1);

                    System.out.println("L'ordinateur prend " + nbRandom + " bâton(s).");

                    nbBatons = nbBatons - nbRandom;

                    if (nbBatons <= 0) System.out.print("Tu as gagné !");
                }
            }
            else {

                int nbRandom = (int) ((3 * Math.random()) + 1);

                System.out.println("L'ordinateur prend " + nbRandom + " bâton(s).");

                nbBatons = nbBatons - nbRandom;

                if (nbBatons <= 0) System.out.print("Tu as gagné !");
                else {
                    System.out.println("Il reste " + nbBatons + " batons dans en jeu.");
                    System.out.println("Combien de bâtons prenez-vous ? (1, 2 ou 3)");
                    nbBatPris = scanner.nextInt();

                    // On prend le nombre min si on entre un chiffre < 1 et le max si on entre un > 3.
                    if (nbBatPris < 1) nbBatPris = 1;
                    else if (nbBatPris > 3) nbBatPris = 3;

                    nbBatons = nbBatons - nbBatPris;

                    if (nbBatons <= 0) System.out.print("Tu as perdu !");
                }
            }
        }
    }
}

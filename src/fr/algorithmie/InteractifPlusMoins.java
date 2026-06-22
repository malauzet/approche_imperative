package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        // Consigne : Écrire un jeu qui :
        // 1) choisit un nombre aléatoire entre 1 et 100
        // 2) puis demande à l’utilisateur de trouver ce nombre en lui indiquant
        // s’il est au-dessus ou en dessous du nombre.
        // 3) Lorsque l’utilisateur a trouvé le nombre, le programme affiche
        // « Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais effectué par l’utilisateur.
        Scanner scanner = new Scanner(System.in);

        int nbRandom = (int) ((100 * Math.random()) + 1);
        int compteur = 0;

        System.out.print("Veuillez essayer de deviner le nombre entre 1 et 100 : ");
        while (scanner.hasNextLine()) {
            int nb = scanner.nextInt() ;
            compteur++;

            if (nb < 1 || nb > 100) {
                System.out.print("Veuillez entrer un nombre entre 1 et 100 : ");
            }
            else if(nb == nbRandom){
                System.out.print("Bravo, vous avez trouvé en " + compteur + " coups !");
                break;
            }
            else System.out.print("Veuillez essayer de deviner le nombre entre 1 et 100 : ");
        }
    }
}

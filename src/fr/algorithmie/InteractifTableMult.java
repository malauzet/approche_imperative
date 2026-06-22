package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {

        // Consigne : Écrire un programme qui demande un nombre à l’utilisateur qui doit
        // être compris entre 1 et 10. Une fois que le nombre est bien entre 1 et 10,
        // le programme affiche la table de multiplication de ce nombre.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre entre 1 et 10 pour afficher sa table de multiplication : ");
        while (scanner.hasNextLine()) {
            int nb = scanner.nextInt() ;

            if (nb < 1 || nb > 10) {
                System.out.println("Veuillez entrer un nombre entre 1 et 10 : ");
            }
            else {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(nb + " * " + i + " = " + (nb * i));
                }
                break;
            }
        }
    }
}

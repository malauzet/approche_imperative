package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {

        // Écrire un programme qui demande un nombre à l’utilisateur qui
        // doit être obligatoirement compris entre 1 et 10 :
        // 1) Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur.
        // 2) Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Veuillez entrer un nombre entre 1 et 10 : ");
        while (scanner.hasNextLine()) {
            int nb = scanner.nextInt() ;

            if (nb < 1 || nb > 10) {
                System.out.println("Veuillez entrer un nombre entre 1 et 10 : ");
            }
            else {
                System.out.println("Le nombre " + nb + " est bien entre 1 et 10 !");
                break;
            }
        }
    }
}

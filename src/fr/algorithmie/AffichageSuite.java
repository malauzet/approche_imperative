package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {

        // Consigne : Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        System.out.print("Affichage des nombres de 1 à 10 inclus (FOR) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n-------------");

        // Consigne : Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.print("Affichage des nombres pairs entre 0 et 10 inclus (FOR) : ");
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n-------------");

        //Consigne : Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.print("Affichage des nombres impairs entre 0 et 9 inclus (FOR) : ");
        for (int i = 0; i <= 9; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n-------------");

        //Consigne : Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        System.out.print("Affichage des nombres de 1 à 10 inclus (WHILE) : ");

        byte index = 1;

        while (index <= 10) {
            System.out.print(index + " ");
            index++;
        }

        System.out.println("\n-------------");

        // Consigne : Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.print("Affichage des nombres pairs entre 0 et 10 inclus (WHILE) : ");

        byte index2 = 0;

        while (index2 <= 10) {
            if(index2 % 2 == 0){
                System.out.print(index2 + " ");
            }
            index2++;
        }

        System.out.println("\n-------------");

        // Consigne : Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.print("Affichage des nombres impairs entre 0 et 9 inclus (WHILE) : ");
        byte index3 = 0;

        while (index3 <= 9) {
            if(index3 % 2 != 0){
                System.out.print(index3 + " ");
            }
            index3++;
        }
    }
}

package fr.algorithmie;

public class AffichageIdentite {
    public static void main(String[] args) {

        // Consigne: Utiliser une boucle for pour afficher 10 fois votre identité
        for (int i = 1; i <= 10; i++) {
            if (i == 10){
                char tab = '-';
                System.out.println("--- Identité n°" + i + " ---\n" + "Nom: ALAUZET\nPrénom: Marius\nAge: 27 ans\n---------------------");
            } else {
                System.out.println("--- Identité n°" + i + " ---\n" + "Nom: ALAUZET\nPrénom: Marius\nAge: 27 ans\n--------------------");
            }
        }
    }
}

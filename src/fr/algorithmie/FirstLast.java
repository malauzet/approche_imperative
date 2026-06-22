package fr.algorithmie;

public class FirstLast {
	public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};

        // Consigne : On calcule une valeur booléenne qui contrôle le tableau de la sorte :
        // 1) elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier
        // et le dernier élément du tableau ont la même valeur
        // 2) elle vaut false dans les autres cas
        boolean firstLast6 = array.length >= 1 && (array[0] == array[array.length - 1]);

        if (firstLast6 == true) System.out.println("Le tableau commence et fini par le même nombre.");
        else System.out.println("Le tableau commence et ne fini pas par le même nombre ou est vide.");
    }
}

package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        int[] array = {0, 15, -3, 8, 7, 4, 0};

        // Consigne : On calcule une valeur booléenne qui contrôle le tableau de la sorte :
        // 1) elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
        // 2) elle vaut false dans les autres cas
        boolean firstLast6 = array.length>= 1 && (array[0] == 6 || array[array.length - 1] == 6);

        if (firstLast6 == true) {
            System.out.println("Le tableau commence et/ou fini par un 6.");
        }
        else {
            System.out.println("Le tableau ne commence et/ou ne fini pas par un 6.");
        }
    }
}

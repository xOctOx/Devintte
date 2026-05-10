//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Générer un nombre aléatoire entre 1 et 100 (inclus)
        int nbreADevine = random.nextInt(100) + 1;

        int nbreEssai = 10;
        int comptEssai = 0;
        boolean aGagne = false;

        System.out.println("*******Jeu de Devinettes***********");
        System.out.println("Devinez un nombre entre 1 et 100.");
        System.out.println("Vous avez " + nbreEssai + " essais.");
        System.out.println("-----------------------------------");

        //Boucle du jeu
        while (comptEssai < nbreEssai) {

            comptEssai++;
            System.out.print("\nEssai " + comptEssai + "/" + nbreEssai + " — Votre réponse : ");

            int devine = scanner.nextInt();  // Lire le nombre entré par l'utilisateur

            // Comparer la réponse au nombre a devine
            if (devine < nbreADevine) {
                System.out.println("Trop petit ! Essayez un nombre plus grand.");

            } else if (devine > nbreADevine) {
                System.out.println("Trop grand ! Essayez un nombre plus petit.");

            } else {
                aGagne = true;
                break;
            }
        }

        //Affichage du resultat
        System.out.println("\n--------------");
        if (aGagne) {
            System.out.println("Félicitations ! Vous avez trouvé le nombre " + nbreADevine
                    + " en " + comptEssai + " essai(s). Vous avez gagné !");
        } else {
            System.out.println("Dommage ! Vous avez utilisé vos " + nbreEssai
                    + " essais. Le nombre était : " + nbreADevine + ". Vous avez perdu.");
        }
        System.out.println("***********");

        scanner.close();
    }
}

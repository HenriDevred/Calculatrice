import java.util.Scanner;

public class App {
    // Déclaration de la variable restart, initialisation à true.
    static boolean restart = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Déclaration et initialisation d'une variable contenant l'objet Scanner

        do {
            System.out.print("Quel calcul voulez vous choisir ? : \n 1 - Addition \n 2 - Soustraction \n 3 - Multiplication \n 4 - Division \n 5 - Factoriel");
            int calcul = sc.nextInt();
            switch (calcul) {
                case 1:
                    System.out.print("Vous avez choisi l'addition ?");
                    Somme.main(args);
                    break;
                case 2:
                    System.out.print("Vous avez choisi la soustraction ?");
                    Soustraire.main(args);
                    break;
                case 3:
                    System.out.print("Vous avez choisi la multiplication ?");
                    Multiplier.main(args);
                    break;
                case 4:
                    System.out.print("Vous avez choisi la division ?");
                    Diviser.main(args);
                    break;
                case 5:
                    System.out.print("Vous avez choisi le calcul factoriel ?");
                    Factoriel.main(args);
                    break;
                default:
                    System.out.println("Pas possible, veuillez choisir un chiffre entre 1 et 5");
                    break;
            }
            System.out.print("Voulez vous voir un autre exercice ? (true / false) : ");
            boolean choose = sc.nextBoolean();
            restart = choose;
        } while (restart);
        sc.close();
    }
}
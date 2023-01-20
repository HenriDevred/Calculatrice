public class Factoriel {
    public static void main(String args[]) {
        System.out.print("Veuillez entrer un nombre");
        int i, fact = 1;
        int number = App.sc.nextInt();

        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("La factorielle de " + number + " est : " + fact);
    }
}

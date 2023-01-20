public class Somme {

    public static void main(String[] args) {


        System.out.print("Veuillez entrer un premier nombre");
        int nombre1 =App.sc.nextInt();
        System.out.print("Veuillez entrer un second nombre");
        int nombre2 = App.sc.nextInt();

        int result = nombre1 + nombre2;
        System.out.println("Résultat de " + nombre1 + " + " + nombre2 + " = " + result);
    }
}
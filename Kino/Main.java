
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Kino kino = new Kino();
        Scanner sc = new Scanner(System.in);
        playKino(kino,sc);
    }

    public static void playKino(Kino kino, Scanner sc) {
        betPrints();// display bet options
        kino.setBetChoice(sc.nextInt());
        moneyBetPrints();// display money bet options
        kino.setMoneyBet(sc.nextInt());
        numberOfDrawPrints();//display the number of draws bet option
        kino.setNumberOfDraws(sc.nextInt());

        for (int i = 0; i < kino.getNumberOfDraws(); i++) {
            kino.runADraw();
            kino.showDrawNumbers();
            System.out.println("\n");// space between displayed draws
            kino.calculateEarnings();
        }
        System.out.println("You've earned " + kino.getTotalEarnings() + "€");
    }
//***************** Menu Prints***************************
    public static void betPrints() {
        System.out.println("[0] Bet for draw");
        System.out.println("[1] Bet on even numbers");
        System.out.println("[2] Bet on odd numbers");
        System.out.print("\nPlease make a selection: ");
    }
    public static void moneyBetPrints() {
        System.out.println("\n[1€][2€[3€][5€][10€][15€][20€[30€][50€][100€]");
        System.out.print("Select the amount you wish to bet: ");
    }
    public static void numberOfDrawPrints() {
        System.out.println("\n[2][3[4][5][6][10][20[50][100][200]");
        System.out.print("Please select the number of draws: "); 
        System.out.println("");
    }
}

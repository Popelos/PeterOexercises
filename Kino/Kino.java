
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Kino implements IKino {


    private int moneyBet;
    private int numberOfDraws;
    private int totalEarnings;
    private int betChoice;// draw/even/odd(0-1-2)
    private static Set<Integer> drawedNumbers = new HashSet();
    private static Set<Integer> evenNumbers = new HashSet();

    public Kino() {
    }

    public static Set<Integer> getDrawedNumbers() {
        return drawedNumbers;
    }
    public static void setDrawedNumbers(Set<Integer> aDrawedNumbers) {
        drawedNumbers = aDrawedNumbers;
    }

    public static Set<Integer> getEvenNumbers() {
        return evenNumbers;
    }
    public static void setEvenNumbers(Set<Integer> aEvenNumbers) {
        evenNumbers = aEvenNumbers;
    }

    public int getMoneyBet() {
        return moneyBet;
    }
    public void setMoneyBet(int moneyBet) {
        this.moneyBet = moneyBet;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }
    public void setNumberOfDraws(int numberOfDraws) {
        this.numberOfDraws = numberOfDraws;
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }
    public void setTotalEarnings(int totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public int getBetChoice() {
        return betChoice;
    }
    public void setBetChoice(int betChoice) {
        this.betChoice = betChoice;
    }
    
    @Override
    public void runADraw() {
        if (!drawedNumbers.isEmpty()){
            drawedNumbers.clear(); // to ensure new numbers for each draw
        }
        int min =1;
        int max =80;
        Random randomNum = new Random();
        do {// adds 20 random numbers from 1 to 80 
            drawedNumbers.add(min + randomNum.nextInt(max));
        } while (drawedNumbers.size() < 20);
    }

    @Override
    public void showDrawNumbers() {
        for (Integer drawedNumber : drawedNumbers) {
            System.out.print("[" + drawedNumber + "]");
        }
    }

    @Override
    public void calculateEarnings() {//
        evenNumbers.clear();// to always get the new even numbers from each draw
        for (Integer drawedNumber : drawedNumbers) {
            if (drawedNumber % 2 == 0) {// add even numbers from the draw
                evenNumbers.add(drawedNumber);
            }
        }
        switch (betChoice) {
            case 0:
                if (evenNumbers.size() == 10) {// Earnings from draw
                    totalEarnings += (4 * moneyBet);
                }break;
            case 1:
                if (evenNumbers.size() > 10) {//  Earnings from even
                    totalEarnings += (2 * moneyBet);
                }break;
            case 2:
                if (evenNumbers.size() < 10) {//  Earnings from odd
                    totalEarnings += (2 * moneyBet);
                    }break;
            default:
                break;
        }
    }
}

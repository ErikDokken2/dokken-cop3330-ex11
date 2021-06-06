package exercises.ex11;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex11 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex11 example11 = new ex11();

        String numEros = example11.numEros();
        String numRate = example11.numRate();

        //Str Conversion
        int eros = example11.intEros(numEros);
        double rate = example11.IntRate(numRate);

        double usConvert = example11.erosUS(eros, rate);
        //Output
        String outputString = example11.outputString(eros, rate, usConvert);

        example11.printOutput(outputString);

    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private String outputString(int eros, double rate, double usConvert) {
        return eros + " euros at an exchange rate of " + rate + " is\n" +
                String.format("%.2f",usConvert) + " U.S. dollars.";
    }

    private double erosUS(int eros, double rate) {
        double  erosUs = eros * rate;
        return erosUs;
    }


    private double IntRate(String numRate) {
        double IntRate = Double.parseDouble(numRate);
        return IntRate;
    }

    private int intEros(String numEros) {
        int intEros = Integer.parseInt(numEros);
        return intEros;
    }

    private String numRate() {
        System.out.print("What is the exchange rate? ");
        String exchangeRate = in.nextLine();
        return exchangeRate;
    }

    private String numEros() {
        System.out.print("How many euros are you exchanging? ");
        String erosNum = in.nextLine();
        return erosNum;
    }
}

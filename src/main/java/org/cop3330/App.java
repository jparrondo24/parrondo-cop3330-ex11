package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        String strEuros = in.nextLine();
        double euros = Double.parseDouble(strEuros);

        System.out.print("What is the exchange rate? ");
        String strExchangeRate = in.nextLine();
        double exchangeRate = Double.parseDouble(strExchangeRate);

        double dollars = euros * exchangeRate;

        System.out.printf("%s euros at an exchange rate of %s is\n%.2f U.S. dollars.\n",
                          strEuros, strExchangeRate, dollars);
    }
}

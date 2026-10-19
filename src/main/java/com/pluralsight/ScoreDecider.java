package com.pluralsight;

import java.util.Scanner;

public class ScoreDecider {
    static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please format as Name1:Name2|Score1:Score2");
        System.out.print("Enter the game score: ");
        String input = myScanner.nextLine();

        String[] inputs = input.split("\\|");
        String[] names = inputs[0].split(":");
        String[] scores = inputs[1].split(":");

        System.out.print("Winner: ");
        if (Integer.parseInt(scores[0]) > Integer.parseInt(scores[1])) {
            System.out.println(names[0]);
        } else if (Integer.parseInt(scores[1]) > Integer.parseInt(scores[0])) {
            System.out.println(names[1]);
        } else {
            System.out.println("Tie!");
        }
    }
}

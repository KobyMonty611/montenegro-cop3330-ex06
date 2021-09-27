/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        Scanner scanner = new Scanner(System.in);
        String ageCurrent = scanner.nextLine();

        System.out.print("At what age would you like to retire? ");
        String retireAge = scanner.nextLine();

        int time = Integer.parseInt(retireAge) - Integer.parseInt(ageCurrent);

        int year = Calendar.getInstance().get(Calendar.YEAR);

        String output = String.format("You have %d years left until you can retire.\nIt's %d, so you can retire in %d.", time, year, year + time);

        System.out.print(output);

        scanner.close();
    }
}

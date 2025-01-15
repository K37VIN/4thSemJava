package lab1;

import java.util.Scanner;

class q3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a day number : ");
        
        int day = in.nextInt();
        
        switch(day) {
            case 1 -> System.out.println("Day " + day + " = Sunday");
            case 2 -> System.out.println("Day " + day + " = Monday");
            case 3 -> System.out.println("Day " + day + " = Tuesday");
            case 4 -> System.out.println("Day " + day + " = Wednesday");
            case 5 -> System.out.println("Day " + day + " = Thursday");
            case 6 -> System.out.println("Day " + day + " = Friday");
            case 7 -> System.out.println("Day " + day + " = Saturday");
            default -> System.out.println("Incorrect input! Please enter a number between 1 and 7.");
        }
    }
}
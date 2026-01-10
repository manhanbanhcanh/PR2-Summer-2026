package TUT1;

/*
Write a program that asks the user’s name, and then greets the user by name. Before outputting
the user’s name, convert it to upper case letters. For example, if the user’s name is Fred, then the
program should respond “Hello, FRED, nice to meet you!”.
*/

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello, "+ name.toUpperCase() +", nice to meet you!");
    }
}

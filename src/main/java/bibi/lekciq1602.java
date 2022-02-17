package bibi;

import java.util.Scanner;

public class lekciq1602 {
        public static void main(String[] args) {
                String testString = "My name is <Vaska>";
                System.out.println("What is your name?");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                String newString = testString.replace("<Vaska>", name);
                System.out.println("First string: " + testString);
                System.out.println("New String: " + newString);
        }
        }



package setup.basic;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        
        String message = "Hello " + name;
        System.out.println(message);
    }
} 
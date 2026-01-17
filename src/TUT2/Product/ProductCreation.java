package TUT2.Product;

import java.util.Scanner;

//Exercise 1 only require the creation of Product.java

class Exercise2 {
    public static void main(String[] args) {
        Product product1 = new Product("", 0, 0);
        Product product2 = new Product("", 0, 0);

        System.out.println("Enter information for Product 1:");
        product1.input();

        System.out.println("Enter information for Product 2:");
        product2.input();

        System.out.println("=== Product Information ===");
        product1.displayInfo();
        product2.displayInfo();
    }
}

class Exercise3 {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.0, 0.1);
        product1.setQuantity(50);

        Product product2 = new Product("Mouse", 25.0);
        product2.setQuantity(200);

        product1.displayInfo();
        product2.displayInfo();
    }
}


class Exercise4 {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000.0, 0.10);
        laptop.setQuantity(50);

        Product mouse = new Product("Mouse", 25.0, 0.05);
        mouse.setQuantity(200);

        Product keyboard = new Product("Keyboard", 75.0, 0.0);
        keyboard.setQuantity(100);

        laptop.displayInfo();
        mouse.displayInfo();
        keyboard.displayInfo();

        Product.displayStatistics();

        System.out.println("Updating Laptop quantity from 50 to 75...");
        laptop.updateQuantity(75);

        Product.displayStatistics();

        System.out.println("Updated Product Information:");
        laptop.displayInfo();
    }
}


public class ProductCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which exercise would you like to run?");
        System.out.println("2 - Exercise 2");
        System.out.println("3 - Exercise 3");
        System.out.println("4 - Exercise 4");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 2:
                Exercise2.main(args);
                break;
            case 3:
                Exercise3.main(args);
                break;
            case 4:
                Exercise4.main(args);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
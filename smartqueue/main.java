package smartqueue;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueManager manager = new QueueManager();
        int choice;

        do {
            System.out.println("\n--- Smart Queue Management System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. Show Queue");
            System.out.println("4. Show Customer Position");
            System.out.println("0. Exit");
            System.out.println("Enter Choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    manager.addCustomer(name);
                    break;
                case 2:
                    manager.serveNextCustomer();
                    break;
                case 3:
                    manager.showQueue();
                    break;
                case 4:
                    System.out.println("Enter Customer Id: ");
                    int id = scanner.nextInt();
                    manager.showCustomerPosition(id);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice!");

            }
        }while (choice != 0);

        scanner.close();

    }
}

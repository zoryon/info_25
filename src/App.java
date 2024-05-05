import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        Queue queue = new Queue();
        System.out.println(queue.length());

        while (option != 0) {
            printMenu();
            boolean error = false;
            do {
                try {
                    error = false;
                    option = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Not a number, please try again");
                    error = true;
                    scanner.nextLine();
                }
            } while (error);

            switch (option) {
                case 0: {
                    option = 0;
                    System.out.println("Thank you for having used our app");
                    break;
                }

                case 1: {
                    System.out.println("Insert the name of the product: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    if(queue.pushQueue(new Product(name))) {
                        System.out.println("Inserted correctly");
                    } else {
                        System.out.println("Maximum size reached, please remove a products before inserting another one");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Insert the name of the product: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    Product extracted =  queue.extract(name);
                    if(extracted != null) {
                        System.out.println("Product extracted: " + extracted.toString());
                    } else {
                        System.out.println("Product not found");
                    }
                    break;
                }

                case 3: {
                    queue.printAllProducts();
                    break;
                }
            
                default: {
                    System.out.println("Option doesn't exists, please try again");
                    break;
                }
            }
        }

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("- - - MENU - - -");
        System.out.println("1) Insert product");
        System.out.println("2) Get product");
        System.out.println("3) Show all products");
        System.out.println("0) Close");
    }
}

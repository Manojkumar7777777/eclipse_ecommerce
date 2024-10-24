package Ecommences;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class EcommencesWebsite {

    // ANSI escape codes for coloring text
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    // Product class represents a product with a name and price
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " - ₹" + price;
        }
    }

    // Cart class manages a list of products added to the cart
    static class Cart {
        private ArrayList<Product> items;

        public Cart() {
            items = new ArrayList<>();
        }

        public void addItem(Product product) {
            items.add(product);
        }

        public double getTotalPrice() {
            double total = 0;
            for (Product item : items) {
                total += item.getPrice();
            }
            return total;
        }

        public ArrayList<Product> getItems() {
            return items;
        }
    }

    // BillGenerator class generates and prints the bill in a separate thread
    static class BillGenerator implements Runnable {
        private Cart cart;
        private static final String COMPANY_NAME = "Fashions";
        private static final String LOCATION = "Bangalore, India";

        public BillGenerator(Cart cart) {
            this.cart = cart;
        }

        @Override
        public void run() {
            generateBill();
        }

        public void generateBill() {
            Date date = new Date();
            System.out.println("\n--- Bill ---");
            System.out.println("Company: " + COMPANY_NAME);
            System.out.println("Date: " + date.toString());
            System.out.println("Location: " + LOCATION);
            System.out.println("------------------------------");
            for (Product item : cart.getItems()) {
                System.out.println(item);
            }
            System.out.println("Total: ₹" + cart.getTotalPrice());
            System.out.println("------------------------------\n");

            // Add wishes after billing
            String[] wishes = {
                "Thank you for shopping with us!",
                "We hope to see you again soon!",
                "Have a great day!",
                "Your satisfaction is our priority!",
                "Happy Shopping!",
                "Enjoy your purchase!",
                "Stay stylish and safe!",
                "Thank you for choosing " + COMPANY_NAME + "!",
                "Wishing you a wonderful day ahead!",
                "We appreciate your business!"
            };
            Random random = new Random();
            int wishIndex = random.nextInt(wishes.length);
            System.out.println(wishes[wishIndex]);
        }
    }

    // Method to print centered messages
    public static void printCenteredMessage(String message, String color) {
        int width = 80; // Typical console width
        int padding = (width - message.length()) / 2;
        
        // Add spaces before the message to center it
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        // Print the message in the chosen color
        System.out.println(color + message + ANSI_RESET);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Centered welcome message in color
        printCenteredMessage("Welcome to Fashions - Your Ultimate Shopping Experience!", ANSI_GREEN);
        System.out.println("            ----------------------------------------------------------");

        Cart cart = new Cart();
        ArrayList<Product> electronics = new ArrayList<>();
        ArrayList<Product> mens = new ArrayList<>();
        ArrayList<Product> womens = new ArrayList<>();
        ArrayList<Product> kids = new ArrayList<>();

        // Adding products to categories with updated prices in INR
        electronics.add(new Product("Laptop", 80000.00));
        electronics.add(new Product("Smartphone", 60000.00));
        electronics.add(new Product("Tablet", 25000.00));
        electronics.add(new Product("Headphones", 5000.00));
        electronics.add(new Product("Smartwatch", 15000.00));

        mens.add(new Product("T-Shirt", 1200.00));
        mens.add(new Product("Shirt", 1800.00));
        mens.add(new Product("Pants", 2500.00));
        mens.add(new Product("Tracks", 1500.00));

        womens.add(new Product("Ladies Saree", 8000.00));
        womens.add(new Product("Ladies Dress", 4000.00));
        womens.add(new Product("Blouse", 2000.00));

        kids.add(new Product("Girls Dress", 3000.00));
        kids.add(new Product("Boys T-Shirt", 800.00));

        boolean shopping = true;

        while (shopping) {
            System.out.println("Select a product category:");
            System.out.println("1. Electronics");
            System.out.println("2. Men's");
            System.out.println("3. Women's");
            System.out.println("4. Kids");
            System.out.println("5. Checkout");

            int categoryChoice = scanner.nextInt();

            switch (categoryChoice) {
                case 1:
                    displayAndHandleCategory(scanner, electronics, cart);
                    break;
                case 2:
                    displayAndHandleCategory(scanner, mens, cart);
                    break;
                case 3:
                    displayAndHandleCategory(scanner, womens, cart);
                    break;
                case 4:
                    displayAndHandleCategory(scanner, kids, cart);
                    break;
                case 5:
                    shopping = false;
                    System.out.print("Ready to pay? (yes/no): ");
                    String readyToPay = scanner.next();
                    if (readyToPay.equalsIgnoreCase("yes")) {
                        // Generate and print bill in a separate thread
                        Thread billThread = new Thread(new BillGenerator(cart));
                        billThread.start();
                        try {
                            billThread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Continue shopping...");
                        shopping = true;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    // Display the list of products in a category and handle adding to cart or going back
    private static void displayAndHandleCategory(Scanner scanner, ArrayList<Product> products, Cart cart) {
        boolean inCategory = true;

        while (inCategory) {
            displayProducts(products);
            System.out.println((products.size() + 1) + ". Go back");

            System.out.print("Enter the product number to add to cart or go back: ");
            int productChoice = scanner.nextInt();
            if (productChoice > 0 && productChoice <= products.size()) {
                Product selectedProduct = products.get(productChoice - 1);
                cart.addItem(selectedProduct);
                System.out.println(selectedProduct.getName() + " added to cart.");
            } else if (productChoice == products.size() + 1) {
                inCategory = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Display the list of products in a category
    private static void displayProducts(ArrayList<Product> products) {
        System.out.println("Available products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }
}

package TUT2.Product;

import java.util.Scanner;

public class Product {
    //private variables for security purposes
    private String name;
    private double price;
    private double discount;

    //static and non-static variables to track information in exercise 4
    private static int productCount = 0;
    private static double totalRevenue = 0;
    private static double totalDiscount = 0;

    private int quantity;

    public Product(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = 0;

        productCount++;//increment every time a product is created
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.discount = 0;
        this.quantity = 0;

        productCount++;//increment every time a product is created
    }

    private double getImportTax(){ //private modifier is for exercise 3
        return price * 0.1; //10% of the product's price
    }

    public void displayInfo(){ //public modifier is for exercise 3
        System.out.println("Product: " + name);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Quantity: " + quantity);
        System.out.println("Import Tax: $" + String.format("%.2f", getImportTax()));
        System.out.println();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        name = sc.nextLine();

        System.out.print("Enter unit price: ");
        price = sc.nextDouble();

        System.out.print("Enter discount (as decimal, e.g., 0.1 for 10%): ");
        discount = sc.nextDouble();

        //for exercise 4, also input quantity
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        //update static variables
        updateStaticVariables();
    }

    //helper method to update static variables
    private void updateStaticVariables() {
        double discountAmount = price * discount * quantity;
        double revenue = (price * quantity) - discountAmount;

        totalDiscount += discountAmount;
        totalRevenue += revenue;
    }

    //static and instance method for exercise 4
    private static int getProductCount(){
       return productCount;
    }

    private static double getTotalRevenue(){
        return totalRevenue;
    }

    private static double getAverageDiscount(){
        if (productCount == 0) return 0;
        return (totalDiscount / (totalRevenue + totalDiscount)) * 100;
    }

    public static void displayStatistics(){
        System.out.println("=== Product Statistics ===");
        System.out.println("Total Products Created: " + getProductCount());
        System.out.println("Total Potential Revenue: $" + String.format("%.2f", getTotalRevenue()));
        System.out.println("Average Discount: " + String.format("%.2f", getAverageDiscount()) + "%");
        System.out.println();
    }

    void updateQuantity(int newQuantity){
        //remove old contribution
        double oldDiscountAmount = price * discount * quantity;
        double oldRevenue = (price * quantity) - oldDiscountAmount;

        totalDiscount -= oldDiscountAmount;
        totalRevenue -= oldRevenue;

        //update quantity
        this.quantity = newQuantity;

        //add new contribution
        double newDiscountAmount = price * discount * quantity;
        double newRevenue = (price * quantity) - newDiscountAmount;

        totalDiscount += newDiscountAmount;
        totalRevenue += newRevenue;
    }

    // getters and setter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateStaticVariables();
    }
}

package PepAssignments;

import java.util.Objects;
import java.util.Scanner;

public class Assignment1 {
    static String car;
    static int price, amount;
    static String[] cars = {"Micro", "Macro", "Ultra"};
    static int[] prices = {250, 350, 550};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String personName = sc.nextLine();
        System.out.println(" ***********************************");
        System.out.println(" * 1. Micro -> Rs 250              *");
        System.out.println(" * 2. Macro -> Rs 350              *");
        System.out.println(" * 3. Ultra -> Rs 550              *");
        System.out.println(" ***********************************");
        System.out.print("Enter Amount: ");
        amount = sc.nextInt();
        System.out.print("Select a Car: ");
        int personRes = sc.nextInt();
        switch (personRes){
            case 1:
                PurchaseDetails(personName, "Micro");
                break;
            case 2:
                PurchaseDetails(personName, "Macro");
                break;
            case 3:
                PurchaseDetails(personName, "Ultra");
                break;
            default:
                System.out.println("Enter a valid response");
        }
    }

    private static void PurchaseDetails(String name, String Car) {
        Scanner sc = new Scanner(System.in);
        if(Objects.equals(Car, cars[0])){
            price = prices[0];
            car = cars[0];
        }
        else if(Objects.equals(Car, cars[1])){
            price = prices[1];
            car = cars[1];
        }
        else {
            price = prices[3];
            car = cars[3];
        }
        System.out.println("  ### Bill generated for "+name+" of car "+car+ " is "+price+" ###");
        System.out.println("Do you want to book this ride?");
        System.out.println("Enter Yes to confirm or No to cancel");
        String personRes = sc.nextLine();
        if(Objects.equals(personRes, "Yes")) {
            if(amount>=price) {
                amount -= price;
                System.out.println("  #######################################################################");
                System.out.println("  Successfully deducted " + price + ", your remaining balance is: " + amount);
                System.out.println("  #######################################################################");
                System.out.println("  ##########################################");
                System.out.println("  #### Person Name : " + name);
                System.out.println("  #### Car Selected: " + car);
                System.out.println("  #### Car Price   : " + price);
                System.out.println("  ##########################################");
                System.out.println("Have a safe journey!!");
            }
            else {
                System.out.println("Sorry! you don't have enough money in account.");
            }
        }
        else {
            System.out.println("Have a nice day!");
        }
    }
}

package PepAssignments;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter Promo Code: ");
        int promoCode = scanner.nextInt();

        scanner.close();

        // 101 Flat 50% off for the items worth 200 or more
        // 201 Flat 60% off for the items worth 159 or more upto 120

        double discount = 0;
        switch (promoCode){
            case 101:
                discount = (amount>=200)?0.5*amount:0;
                if(amount<200)
                    System.out.println("Insufficient amount for promo code, add "+(200-amount)+" to avail discount");
                else {
                    System.out.println("Promo Code is: "+promoCode);
                    System.out.println("Discount: " + discount);
                    amount -= discount;
                    System.out.println("Amount to pay: " + amount);
                }
                break;

            case 201:
                discount = (amount>159)?0.6*amount:0;
                if(amount<159)
                    System.out.println("Insufficient amount for promo code, add "+(200-amount)+" to avail discount");
                else {
                    discount = (discount > 120) ? 120 : 0.6 * amount;
                    System.out.println("Discount: " + discount);
                    amount -= discount;
                    System.out.println("Amount to pay: " + amount);
                }
                break;

            default:
                System.out.println("Invalid promo code");

        }
    }
}

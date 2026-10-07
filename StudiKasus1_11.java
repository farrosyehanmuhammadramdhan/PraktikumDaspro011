import java.util.Scanner;

public class StudiKasus1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricePerCup = 18000;
        int numberOfCup;
        int payment;
        int totalPrice;
        int discount;
        int totalPayment;
        int change;
        int less;


        System.out.print("Masukkan Jumlah Cup : ");
        numberOfCup = sc.nextInt();

        System.out.print("Enter the Payment : ");
        payment = sc.nextInt();

        totalPrice = numberOfCup * pricePerCup;

        discount = 0;

        if (totalPrice >= 100000) {
            discount = totalPrice * 10/100;
        }

        totalPayment = totalPrice - discount;

        System.out.println("Total Price : " + "Rp. " + totalPrice);
        System.out.println("Discount : " + "Rp. " + discount);
        System.out.println("Total Payment : " + "Rp. " + totalPayment);

        if (payment >= totalPayment) {
            change = payment - totalPayment;
            System.out.println("Change : " + "Rp. " + change);
        } else {
            less = totalPayment - payment;
            System.out.println("Not enough money, less Rp. " + less);
        }

        sc.close();
    }
}

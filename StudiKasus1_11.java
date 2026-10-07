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

        sc.close();
    }
}

import java.util.Scanner;

public class IT24104110Lab3Q3 {
    public static void main(String[] args) {
        int count5000, count1000, count500, count200, count100, count50, count20, count10, count5, count2, count1, amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        amount = input.nextInt();

        count5000 = amount / 5000;
        amount %= 5000;
        System.out.println("5000 Notes - " + count5000);

        count1000 = amount / 1000;
        amount %= 1000;
        System.out.println("1000 Notes - " + count1000);

        count500 = amount / 500;
        amount %= 500;
        System.out.println("500 Notes - " + count500);

        count200 = amount / 200;
        amount %= 200;
        System.out.println("200 Notes - " + count200);

        count100 = amount / 100;
        amount %= 100;
        System.out.println("100 Notes - " + count100);

        count50 = amount / 50;
        amount %= 50;
        System.out.println("50 Notes - " + count50);

        count20 = amount / 20;
        amount %= 20;
        System.out.println("20 Notes - " + count20);

        count10 = amount / 10;
        amount %= 10;
        System.out.println("10 Notes - " + count10);

        count5 = amount / 5;
        amount %= 5;
        System.out.println("05 Notes - " + count5);

        count2 = amount / 2;
        amount %= 2;
        System.out.println("02 Notes - " + count2);

        count1 = amount;
        System.out.println("01 Notes - " + count1);
    }
}
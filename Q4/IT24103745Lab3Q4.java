import java.util.Scanner;

public class IT24104110Lab3Q4 {
    public static void main(String[] args) {
        int number , digit1 , digit2 , digit3 , digit4 , digit5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        number = input.nextInt();

	digit1 = number/10000;
	number %=10000;

	digit2 = number/1000;
	number %=1000;

	digit3 = number/100;
	number %=100;

	digit4 = number/10;
	number %=10;

	digit5 = number;
	System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
}
}
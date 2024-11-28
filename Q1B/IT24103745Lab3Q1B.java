import java.util.Scanner;
public class IT24104110Lab3Q1B{
	public static void main(String[]args){
		double pricePerKg,quantity,totalAmount,discountTotal,finalAmount;
		double discount =0.10;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice: ");
		pricePerKg=input.nextDouble();
		System.out.print("Enter the number of kilograms you want: ");
		quantity = input.nextDouble();
		totalAmount =pricePerKg*quantity;
		discountTotal = totalAmount*discount;
		finalAmount =totalAmount-discountTotal;
		System.out.println();
		System.out.print("The total amount with 10% discount is: "+ finalAmount);
}
}

		
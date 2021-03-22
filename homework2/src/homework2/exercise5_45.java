package homework2;

import java.util.Scanner;

public class exercise5_45 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double sum2 =0;
		System.out.print("Enter 10 numbers: ");
		for(int i=0;i<10;i++){
			double tmp=input.nextDouble();
			sum += tmp;
			sum2 += tmp*tmp;
		}
		double ave1 = sum/10.0;
		double ave2 = (sum2-sum*sum/10.0)/9.0;
		double fangcha = Math.sqrt(ave2);
		System.out.println("The average is "+ave1);
		System.out.println("The standard deviation is "+fangcha);
	}
}

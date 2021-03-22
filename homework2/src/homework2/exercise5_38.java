package homework2;

import java.util.Scanner;

public class exercise5_38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		int mi =1;
		while(Math.pow(8, mi)<=a){
			mi++;
		}
		mi--;
		for(int i=mi;i>=0;i--){
			System.out.print((int)(a/Math.pow(8, i)));
			a %= (int)(Math.pow(8, i));
		}
	}

}

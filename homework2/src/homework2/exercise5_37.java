package homework2;

import java.util.Scanner;

public class exercise5_37 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		int mi =1;
		while(Math.pow(2, mi)<=a){
			mi++;
		}
		mi--;
		for(int i=mi;i>=0;i--){
			if(a>=Math.pow(2, i)){
				System.out.print(1);
				a -= Math.pow(2, i);
			}else{
				System.out.print(0);
			}
		}
	}

}

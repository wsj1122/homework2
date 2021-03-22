package homework2;

import java.util.Scanner;

public class exercise5_29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.print("Enter the year: ");
		int year=input.nextInt();
		String[] week={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		int[] Days={31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%400==0)||(year%4==0&&year%100!=0)){
			Days[1]=29;
		}
		System.out.print("Enter the day: ");
		int day = input.nextInt();
		for(int i=1;i<=12;i++){
			System.out.println("       "+months[i-1]+"  "+year+"       ");
			System.out.println("---------------------------------------");
			System.out.print("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			System.out.println();
			int count=0;
			int base = 0;
			for(int j=0;j<day;j++){
				System.out.print("      ");
				count++;
			}
			for(int j=1;j<=Days[i-1];j++){
				System.out.printf("%3d   ", j);
				count++;
				if(count%7==0&&count!=base)
				{
					System.out.println();
				}
				}
			
			System.out.println();
			System.out.println();
			day=(day+Days[i-1])%7;
		}
	}
}

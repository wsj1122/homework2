package homework2;

import java.util.Scanner;

public class exercise5_28 {
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
			System.out.printf("%s 1, %d is %s\n", months[i-1],year,week[day-1]);
			
			day=(day+Days[i-1])%7;
			if(day==0)
				day=7;
		}
	}
}

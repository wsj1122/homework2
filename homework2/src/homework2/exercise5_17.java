package homework2;

import java.util.Scanner;

public class exercise5_17 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for lines: ");
        int lines = input.nextInt();
        
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=7-i;j++)
                System.out.print("  ");
            for(int j=i;j>1;j--)
                System.out.print(j+" ");
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.print('\n');
          }
        }
    }


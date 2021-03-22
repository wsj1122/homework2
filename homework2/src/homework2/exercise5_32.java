package homework2;

public class exercise5_32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*10);
	    int num2 = (int)(Math.random()*10);
	    while(num2==num1)
	        num2 = (int)(Math.random()*10);
	    System.out.println("The lottery number is "+num1+","+num2);
	}
}

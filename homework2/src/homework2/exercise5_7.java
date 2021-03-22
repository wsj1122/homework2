package homework2;


public class exercise5_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pre = 10000;
		for(int i = 0;i<10;i++)
			pre *= (1+0.05);
		double pre1 = pre;
		double sum = 0;
		for(int i = 0 ;i<4;i++){
			sum+=pre;
			pre *= (1+0.05);
		}
		System.out.printf("十年后：%.2f\n", pre1);
		System.out.printf("总费用的四年后:%.2f\n", sum);
	}
}

package homework2;

public class exercise5_27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i =101;i<=2100;i++){
			if(i%400==0||(i%4==0&&i%100!=0)){  //判断是否是闰年
				System.out.print(i+" ");  //输出一个年份后加空格
				count++;
				if(count%10==0){          //满10个转行显示
					System.out.println();
				}
			}
		}
		System.out.println("\nThe total number is "+count);
	}
}

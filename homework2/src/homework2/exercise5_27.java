package homework2;

public class exercise5_27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i =101;i<=2100;i++){
			if(i%400==0||(i%4==0&&i%100!=0)){  //�ж��Ƿ�������
				System.out.print(i+" ");  //���һ����ݺ�ӿո�
				count++;
				if(count%10==0){          //��10��ת����ʾ
					System.out.println();
				}
			}
		}
		System.out.println("\nThe total number is "+count);
	}
}

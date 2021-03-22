package homework2;

public class exercise5_26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e=1.0;
		for(int i=10000;i<=100000;i+=10000){
			double zimu = 1.0;
			for(int j =1; j<=i ;j++){
				zimu /= j;
				e += zimu;
			}
			System.out.printf("i= %d , e=%f\n", i,e);
		}
	}
}

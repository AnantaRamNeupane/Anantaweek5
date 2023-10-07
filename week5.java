package fall23;

public class week5 {
	public static int sum(int a,int b) {
		int sum=0;
		for (int i=a ; i <= b; i++) {
			sum=sum+i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		System.out.println("Sum of 1 to 10 "+ sum(1,10));
		System.out.println("Sum of 20 to 300 "+ sum(20,30));
		System.out.println("Sum of 35 to 45 "+ sum(35,45));

	}

}

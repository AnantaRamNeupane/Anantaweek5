package fall23;
import java.util.Scanner;

public class Week52 {

	public static void main(String[] args) {
		int n;
		Scanner r = new Scanner(System.in);
		System.out.println("enter length");
		n=r.nextInt();
		
		String[] veg=new String[5];
		System.out.println("enter elements");
		
		for(int i=0;i<n;i++) {
			veg [i]= r.nextLine();
		}
System.out.println("elements are");
for(int i= 0;i<n;i++) {
	System.out.println(veg[i]);
}
	}

}

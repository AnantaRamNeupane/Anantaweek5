package fall23;

public class constructor6 {
	String Subject;
	int fee;
	constructor6()
	{
		System.out.println("Example of Constructor");
	}
	constructor6( int a , String b)
	{
		System.out.println("age is" + a);
		System.out.println("your name is" + b);
	}
	constructor6(String course  ){
		Subject = course;
		
	}
	constructor6(int cost)
	{
		this.fee=cost;
	}

	public static void main(String[] args)
	{
		constructor6 z =new constructor6();
		constructor6 r = new constructor6(22,"joe");
		constructor6 y = new constructor6("java");
		System.out.println("the subject name is "+y.Subject);
		constructor6 q   = new constructor6(500);
		System.out.println("fee is "+q.fee);
		
		
	}
	

}

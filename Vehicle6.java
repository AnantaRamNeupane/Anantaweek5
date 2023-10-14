package fall23;
/*student name: Ananta Ram Neupane
 * Topic: Inheritance
 * student Email id: anantaneupane9188@nctorontostudents.ca
 */
class sportvehicle {
	String manufacturer;

}
class SUV extends sportvehicle
{
	int passengercapacity;
}
class sedan extends sportvehicle 
{
	String model;
}

public class Vehicle6 {

	public static void main(String[] args) {
		SUV z = new SUV();
		z.manufacturer="Toyota";
		z.passengercapacity = 5;
		System.out.println("SUV Details");
		System.out.println("-----------------");
		System.out.println("Manufacture information: "+ z.manufacturer);
		System.out.println("passanger numbers "+ z.passengercapacity);
		
		sedan a = new sedan();
		a.model = "BMW 7";
		a.manufacturer ="BMW";
		z.passengercapacity = 5;
		System.out.println("sedan Details");
		System.out.println("-----------------");
		System.out.println("Manufacture information: "+ a.manufacturer); 
		System.out.println("Model = "+ a.model);
		
		
		
		

	}

}

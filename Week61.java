package fall23;
/*student name: Ananta Ram Neupane
 * Topic: Inheritance
 * student Email id: anantaneupane9188@nctorontostudents.ca
 */
class Employee{
	int salary= 50000;
}

public class Week61 extends Employee {

	public static void main(String[] args) {
		Week61 z= new Week61();
		System.out.println("the employee salary is "+ z.salary);

	}

}

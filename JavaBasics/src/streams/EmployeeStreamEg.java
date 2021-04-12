package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
		int empId;
		String name;
		int age;
		
	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
}
public class EmployeeStreamEg {
	
	

	public static void main(String[] args) {
      	ArrayList<Employee> Emp = new ArrayList<Employee>();
      	
      	Emp.add(new Employee(110,"Vicky",30));
      	Emp.add(new Employee(150,"Gayu",50));
      	Emp.add(new Employee(170,"Deelip",50));
      	Emp.add(new Employee(140,"Sara",70));
      	Emp.add(new Employee(120,"Ajay",30));
      	Emp.add(new Employee(130,"Ajay",60));
      	Emp.add(new Employee(160,"Deya",30));
      	
      	List<Integer> EmpNew = Emp.stream().filter(a -> a.age > 50).map(a -> a.age).collect(Collectors.toList());   //New Emp List -- age
      	System.out.println("The New Employee list based on their age - "+EmpNew);
      	
      	Emp.stream().filter(a -> a.age == 50).forEach(Employee -> System.out.println("The Employee he/she have same age - "+Employee.name));
		
      	Employee j = Emp.stream().max((a,b) -> (a.age > b.age) ? 1 : -1).get();      //Eldest Employee
		System.out.println("The Eldest employee name - "+j.name);
		
		Employee j1 = Emp.stream().min((a,b) -> (a.age > b.age) ? 1 : -1).get();      //Youngest Employee
		System.out.println("The Youngest employee name - "+j1.name);
      	
      	Set<String> Emp1 = Emp.stream()                             // Duplication Removed
      			.map(a -> a.name)
      			.collect(Collectors.toSet());
		System.out.println("The Employee list has been (Here, the duplication is removed) : " +Emp1);
	
      	
      	
	}
      	
}

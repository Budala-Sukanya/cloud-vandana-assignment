package codingassignment;

import java.util.ArrayList;
import java.util.List;

public class Employee_User_LogicClass {
	public static void main(String[] args) {
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(1, "Sukanya", 20000));
		l.add(new Employee(2, "Suvarns", 70000));
		l.add(new Employee(3, "Raj", 30000));
		l.add(new Employee(4, "Kumar", 50000));
		l.add(new Employee(5, "Jaya", 40000));
		
		for(Employee o:l) {
			o.displayDetails();
		}
	}

}

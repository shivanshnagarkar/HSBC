package SalaryApp;

import SalaryApp.model.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class FindAverageSalaryAppTest {
	  List<Employee> employees ;

	@Before
	public void LoadEmployeeData()
	{
		employees = new ArrayList<>();
		employees.add(new Employee("Ashish", "A", "IT", "Pune", "Software Engineer", new Double(10000)));
		employees.add(new Employee("Amit", "R", "HR", "Pune", "Recruiter", new Double(12000)));
		employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Senior Recruiter", new Double(14000)));
		employees.add(new Employee("Jaya", "S", "IT", "Pune", "Tech Lead", new Double(15000)));
		employees.add(new Employee("Smita", "M", "IT", "Bangalore", "Recruiter", new Double(16000)));
		employees.add(new Employee("Umesh", "A", "IT", "Bangalore", "Software Engineer", new Double(12000)));
		employees.add(new Employee("Pooja", "R", "HR", "Bangalore", "Software Engineer", new Double(12000)));
		employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Recruiter", new Double(16000)));
		employees.add(new Employee("Bobby", "S", "IT", "Bangalore", "Tech Lead", new Double(20000)));
		employees.add(new Employee("Vipul", "M", "IT", "Bangalore", "Software Engineer", new Double(14000)));

	}

    @Test
    public void findAverageSalary() {


			FindAverageSalaryApp es = new FindAverageSalaryApp();
			System.out.println(es.getAverageSalByLocation(employees));
			assert (es.getAverageSalByLocation(employees)).size()==2;

    }




}
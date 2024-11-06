package SalaryApp;

import SalaryApp.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAverageSalaryApp {

     public Map<String, Map<String, Double>> getAverageSalByLocation(List<Employee> employeeList){

        Map<String, Map<String, Double>> groupByQueryMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getOfficeLocation,
                        Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))));

        return groupByQueryMap;

    }

}

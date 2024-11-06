package SalaryApp.model;

public class Employee {
        private String firstName;
        private String lastName;
        private String department;
        private String officeLocation;
        private String designation;
        private Double salary;

        public Employee(String firstName, String lastName, String department,
                        String officeLocation, String designation, Double salary){
            this.firstName= firstName;
            this.lastName = lastName;
            this.department = department;
            this.officeLocation = officeLocation;
            this.designation = designation;
            this.salary = salary;
        }


    public String getDepartment() {
        return department;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public Double getSalary() {
        return salary;
    }


}


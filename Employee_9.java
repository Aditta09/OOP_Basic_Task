import java.time.LocalDate;
import java.time.Period;

class Employee_9 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee_9(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int yearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary +
                ", Years of Service: " + yearsOfService());
    }

    public static void main(String[] args) {
        Employee_9 e = new Employee_9("John", 60000, LocalDate.of(2015, 5, 10));
        e.display();
    }
}

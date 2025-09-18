class Employee_6 {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee_6(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double amount) {
        salary += amount;
    }

    public void display() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee_6 e = new Employee_6("Alice", "Developer", 50000);
        e.display();
        e.updateSalary(5000);
        e.display();
    }
}

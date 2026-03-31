interface BankEmployee {
    double calculateSalary();
}

class FullTimeEmployee implements BankEmployee {
    double monthlySalary = 60000.0;
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee implements BankEmployee {
    double hourlyRate = 500.0;
    int hoursWorked = 40;
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class AbstractionPractice {
    public static void main(String[] args) {
        BankEmployee ft = new FullTimeEmployee();
        BankEmployee pt = new PartTimeEmployee();

        double ftSalary = ft.calculateSalary();
        double ptSalary = pt.calculateSalary();

        System.out.println("Full-time Employee Salary: " + ftSalary);
        System.out.println("Part-time Employee Salary: " + ptSalary);
        System.out.println("Total Salary Sum: " + (ftSalary + ptSalary));
    }
}


public class Employee {
	private String firstName;
	private String lastName;
	private String ssn;
	
	public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
	
	public void display() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("SSN: " + ssn);
    }
	
	// Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }
    
    public void display() {
        super.display();
        System.out.printf("Weekly Salary: $%.2f\n", weeklySalary);
    }

    // Getter and Setter
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }
    
    public void display() {
        super.display();
        System.out.println("Hourly Wage: $" + wage);
        System.out.println("Hours Worked: " + hoursWorked);
    }

    // Getters and Setters
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    
    public void display() {
        super.display();
        System.out.println("Commission Rate: " + commissionRate * 100 + "%");
        System.out.printf("Gross Sales: $%,.2f\n", grossSales);
    }

    // Getters and Setters
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, double baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    public void display() {
        super.display();
        System.out.printf("Base Salary: $%,.2f\n",baseSalary);
    }
    
    // Getter and Setter
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
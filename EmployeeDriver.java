
public class EmployeeDriver {

	public static void main(String[] args) {
		// Create instances of each class
        SalariedEmployee emp1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee emp2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee emp3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee emp4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", .15, 50000);
        SalariedEmployee emp5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee emp6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee emp7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", .22, 40000);

        emp1.display();
        System.out.println();
        emp2.display();
        System.out.println();
        emp3.display();
        System.out.println();
        emp4.display();
        System.out.println();
        emp5.display();
        System.out.println();
        emp6.display();
        System.out.println();
        emp7.display();
        System.out.println();
	}

}

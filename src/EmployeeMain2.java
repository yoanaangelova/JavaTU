public class EmployeeMain2 {
    public static void main(String[] args) {
        Employee[] employees = {new Lawyer(3), new Secretary(2), new Marketer(4)};
        for (int i = 0; i < employees.length; i++) {
            System.out.println("salary = " + employees[i].getSalary());
            System.out.println("vacation days = " + employees[i].getVacationDays());
            System.out.println();
        }
    }
}

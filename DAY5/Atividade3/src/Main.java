public class Main {
    public static void main(String[] args) {
        EmployeeTest employeeTest1 = new EmployeeTest();
        EmployeeTest employeeTest2 = new EmployeeTest();

        employeeTest1.getInformation();
        employeeTest2.getInformation();

        employeeTest1.showInformation();
        employeeTest2.showInformation();

        employeeTest1.raiseSalary();
        employeeTest2.raiseSalary();

        employeeTest1.showInformation();
        employeeTest2.showInformation();
    }
}
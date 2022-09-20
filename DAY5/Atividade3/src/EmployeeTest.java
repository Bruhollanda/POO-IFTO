import java.util.Scanner;

public class EmployeeTest {
    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee();
    public void getInformation() {
        System.out.print("Informe o primeiro nome: ");
        employee.setFirstName(sc.next());
        System.out.print("Informe o sobrenome: ");
        employee.setLastName(sc.next());
        System.out.print("Informe o salário: ");
        employee.setSalary(sc.nextDouble());
    }// getInformation

    public double raiseSalary() {
        double raised = employee.getSalary() * 1.1;
        employee.setSalary(raised);
        return employee.getSalary();
    }// raiseSalary

    public void showInformation() {
        System.out.println(employee);
        System.out.printf("O salário anual é: R$ %.2f", employee.getSalary()*12);
        System.out.println();
    }// showInformation
}// class

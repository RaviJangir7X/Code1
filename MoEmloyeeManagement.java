package sevenX;

public class MoEmloyeeManagement {
    public static void main(String[] args) {
        System.out.println("");

        Employee employee = new Employee("Ravi","Jangir");
        employee.setBaseSalary(12500);
        System.out.println(" Display Name: "+ employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee Id:"+ employee.getEmployeeId());
        System.out.println("Email:" + employee.getEmail());
        System.out.println("Basic Salary: "+ employee.getBaseSalary());

        Developer developer = new Developer();
        developer.setFirstName("Jangir");
        developer.setLastName("ravi");
        developer.setBaseSalary(20500);
        developer.setprojectBonus(5000);

        System.out.println(" Display Name: "+ developer.getFirstName() + " " + developer.getLastName());
        System.out.println("Employee Id:"+ developer.getEmployeeId());
        System.out.println("Email:" + developer.getEmail());
        System.out.println("Basic Salary: "+ developer.getSalary());

        Hr hr = new Hr();
        hr.setFirstName("H");
        hr.setLastName("R");
        hr.setBaseSalary(12500);
        System.out.println(" Display Name: "+ hr.getFirstName() + " " + hr.getLastName());
        System.out.println("Employee Id:"+ hr.getEmployeeId());
        System.out.println("Email:" + hr.getEmail());
        System.out.println("Basic Salary: "+ hr.getSalary());


    }
}

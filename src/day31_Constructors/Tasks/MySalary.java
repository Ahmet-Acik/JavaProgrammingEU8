package day31_Constructors.Tasks;

public class MySalary {
    public static void main(String[] args) {
        
        Salary salary = new Salary(11,45);
        System.out.println(salary);
        
        
        SalaryCalculator salaryCalculator = new SalaryCalculator(11,0.2,0.2,45);
        System.out.println("salaryCalculator = " + salaryCalculator);
    }
}

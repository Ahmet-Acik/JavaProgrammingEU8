package day31_Constructors.Tasks;

public class Salary  {

    double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
        }

    public Salary(double hourlyRate, double weeklyHours) { // construction overloading
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary( ) {
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }

    public double stateTax ( ) { // California Income Tax Brackets

        double stateTax = ( salary () < 12570.00) ? 0 : (salary ()  > 12571.00 && salary () < 50270.00) ? salary ()* 0.020 :(salary () > 50271.00 && salary () < 150000.00)? salary ()* 0.040: salary ()* 0.045;

        return stateTax;

  }

    public double federalTax() { // California Income Tax Brackets

        double federalTax = ( salary () < 17629.00) ? salary ()* 0.01 : (salary () > 17629.00 && salary()  < 41768.00) ? salary ()* 0.02 :(salary () > 41768.00 && salary()  < 53843.00) ? salary ()* 0.04 : (salary()  > 53843.00 && salary()  < 66636.00)? salary ()* 0.06:
                (salary () > 66636.00 && salary () < 78710.00)? salary ()* 0.08: (salary () > 78710.00 && salary () < 401705.00)? salary ()* 0.09:(salary () > 401705.00 && salary () < 482047.00)? salary ()* 0.1: salary ()* 0.12;

        return federalTax;}


    public double salaryAfterTax () {
        double salaryAfterTax = salary() - stateTax()- federalTax();
        return salaryAfterTax;

    }


    public String toString() {
        return "Salary{" +  + salary() +
                ", federalTax=" + federalTax() +
                ", stateTax=" + stateTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }



    /*
            SalaryCalculator Task:
                1.1 Create a class named Salary calculator:
                        Attributes:
                            hourlyRate, stateTaxRate,
                federalTaxRate, weeklyHours
                            Add a constructor to set all the fields
                        Actions:
                            salary(): calculates the salary (
                hourlyRate * weeklyHour * 52)
                            stateTax(): calculates the
                totalStateTax
                            federalTax(): calculates the
                total federal tax
                            salaryAfterTax(): calculates the
                salary after tax
                            toString(): displays the salary,
                stateTax, federalTax, salaryAfterTax of the Object






     */
}

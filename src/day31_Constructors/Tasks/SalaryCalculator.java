package day31_Constructors.Tasks;

    public class SalaryCalculator {
        public double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

        public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
            this.hourlyRate = hourlyRate;
            this.stateTaxRate = stateTaxRate;
            this.federalTaxRate = federalTaxRate;
            this.weeklyHours = weeklyHours;
        }
        public double salary(){
            return hourlyRate*weeklyHours*52;
        }
        public double stateTax(){
            return  salary()*stateTaxRate;
        }
        public double federalTax(){
            return  salary()*federalTaxRate;
        }
        public double salaryAfterTax(){
            return  salary()-stateTax()-federalTax();
        }

        public String toString() {
            return "SalaryCalculator{" +
                    "salary=" + salary() +
                    ", stateTax=" + stateTax() +
                    ", federalTax=" + federalTax() +
                    ", salaryAfterTax=" + salaryAfterTax() +
                    '}';
        }
    }


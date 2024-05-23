package decorator.gof;

import decorator.Taxes;

public class HealthInsuranceDecorator extends TaxDecorator {

    public HealthInsuranceDecorator(SalaryCalculator salaryCalculator) {
        super(salaryCalculator);
    }

    @Override
    protected double applyTax(double salary) {
        return Taxes.healthInsurance(salary);
    }
}

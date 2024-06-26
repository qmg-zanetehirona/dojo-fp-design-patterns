package decorator.gof;

import decorator.Taxes;

public class GeneralTaxDecorator extends TaxDecorator {

    public GeneralTaxDecorator(SalaryCalculator salaryCalculator) {
        super(salaryCalculator);
    }

    @Override
    protected double applyTax(double salary) {
        return Taxes.generalTax(salary);
    }
}

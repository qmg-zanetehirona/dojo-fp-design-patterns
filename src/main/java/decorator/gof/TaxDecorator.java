package decorator.gof;

public abstract class TaxDecorator implements SalaryCalculator {

    private final SalaryCalculator salaryCalculator;

    public TaxDecorator(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    protected abstract double applyTax(double salary);

    @Override
    public final double calculate(double grossAnnual) {
        double salary = salaryCalculator.calculate(grossAnnual);
        return applyTax(salary);
    }
}

package wildfirecybernetics;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Check {

    private Money               _gratuityAmount;
    private BigDecimal          _gratuityPercentage;
    private Money               _total;
    private Money               _deduction;
    private Money               _tax;
    private ArrayList<Split>    _splits;

    public Check() {
        _splits = new ArrayList<Split>();
        _total = new Money(new BigDecimal("0.00"));
        _deduction = new Money(new BigDecimal("0.00"));
        _tax = new Money(new BigDecimal("0.00"));
        _gratuityPercentage = new BigDecimal("0.00");
        Calculate();
    }

    public Check(Split split, Money total, Money deduction,
            Money tax, BigDecimal gratuityPercentage) {
        _splits = new ArrayList<Split>();
        _splits.add(split);
        _total = total;
        _deduction = deduction;
        _tax = tax;
        _gratuityPercentage = gratuityPercentage;
        Calculate();
    }

    public void AddSplit(Split split) {
        _splits.add(split);
    }

    public void RemoveSplit(Split split) {
        _splits.remove(split);
    }

    public void SetTotal(Money total) {
        _total = total;
        Calculate();
    }

    public Money GetTotal() {
        return _total;
    }

    public void SetDeductions(Money deduction) {
        _deduction = deduction;
        Calculate();
    }

    public Money GetDeductions() {
        return _deduction;
    }

    public void SetTax(Money tax) {
        _tax = tax;
        Calculate();
    }

    public Money GetTax() {
        return _tax;
    }

    public void SetGratuityPercentage(BigDecimal gratuityPercentage) {
        _gratuityPercentage = gratuityPercentage;
        Calculate();
    }

    public BigDecimal GetGratuityPercentage() {
        return _gratuityPercentage;
    }

    public Money GetGratuityAmount() {
        Calculate();
        return _gratuityAmount;
    }

    public Money GetTotalPlusGratuity() {
        Money bd = _total.plus(_gratuityAmount);
        return bd;
    }

    private void Calculate() {
        if(_deduction.compareTo(_total) <= 1) {
            Money total = _total.minus(_deduction);
            total = total.plus(_tax);
            _gratuityAmount = total.times(_gratuityPercentage.doubleValue());
        }
    }
}
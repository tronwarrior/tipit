package wildfirecybernetics;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Check {

    private BigDecimal  _gratuityAmount;
    private BigDecimal  _gratuityPercentage;
    private BigDecimal  _total;
    private BigDecimal  _deductions;
    private BigDecimal  _tax;
    private ArrayList<Split> _splits;

    public Check(BigDecimal total, BigDecimal deductions, 
            BigDecimal tax, BigDecimal gratuityPercentage) {
        _splits = new ArrayList<Split>();
        _total = new BigDecimal(total.toString());
        _deductions = new BigDecimal(deductions.toString());
        _tax = new BigDecimal(tax.toString());
        _gratuityPercentage = new BigDecimal(gratuityPercentage.toString());
        _gratuityAmount = Calculate();
    }

    public void SetTotal(BigDecimal total) {
        _total = total;
    }

    public BigDecimal GetTotal() {
        return _total;
    }

    public void SetDeductions(BigDecimal deductions) {
        _deductions = deductions;
    }

    public BigDecimal GetDeductions() {
        return _deductions;
    }

    public void SetTax(BigDecimal tax) {
        _tax = tax;
    }

    public BigDecimal GetTax() {
        return _tax;
    }

    public void SetGratuityPercentage(BigDecimal gratuityPercentage) {
        _gratuityPercentage = gratuityPercentage;
    }

    public BigDecimal GetGratuityPercentage() {
        return _gratuityPercentage;
    }

    public BigDecimal GetGratuityAmount() {
        return _gratuityAmount;
    }

    private BigDecimal Calculate() {
        BigDecimal gratuity = new BigDecimal("0.00");
        
        if(_total.compareTo(_total) <= 1) {
            BigDecimal total = _total.subtract(_deductions);
            total = total.add(_tax);
            gratuity = total.multiply(_gratuityPercentage);
        }
        
        return gratuity;
    }
}

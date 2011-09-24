package wildfirecybernetics;

import java.math.BigDecimal;

public class Split {

    private BigDecimal  _gratuityPercentage;
    private Participant _participant;
    private Money       _subTotal;
    private Money       _tax;

    public Split() {
        _gratuityPercentage = new BigDecimal("0.00");
        _participant = new Participant("");
        _subTotal = new Money(new BigDecimal("0.00"));
        _tax = new Money(new BigDecimal("0.00"));
    }

    public BigDecimal GetGratuityPercentage() {
        return _gratuityPercentage;
    }

    public void SetGratuityPercentage(BigDecimal gratuityPercentage) {
        _gratuityPercentage = gratuityPercentage;
    }

    public Participant GetParticipant() {
        return _participant;
    }

    public void SetParticipant(Participant participant) {
        _participant = participant;
    }

    public Money GetSubtotal() {
        return _subTotal;
    }

    public void SetSubtotal(Money subTotal) {
        _subTotal = subTotal;
    }

    public Money GetTax() {
        return _tax;
    }

    public void SetTax(Money tax) {
        _tax = tax;
    }
}

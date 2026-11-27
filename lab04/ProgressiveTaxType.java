public class ProgressiveTaxType extends TaxType {

    public double calculateTaxFor(double amount) {
        if (amount <= 100000) {
            return amount * 0.10;
        }
        return amount * 0.15;
    }
}

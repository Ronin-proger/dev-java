public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();

        Bill bill1 = new Bill(50000, new IncomeTaxType(), taxService);
        Bill bill2 = new Bill(50000, new VATaxType(), taxService);
        Bill bill3 = new Bill(50000, new ProgressiveTaxType(), taxService);
        Bill bill4 = new Bill(150000, new ProgressiveTaxType(), taxService);

        bill1.payTaxes();
        bill2.payTaxes();
        bill3.payTaxes();
        bill4.payTaxes();
    }
}

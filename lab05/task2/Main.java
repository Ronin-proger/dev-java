public class Main {

    public static void main(String[] args) {
        Account savings = new SavingsAccount(5000);
        Account credit = new CreditAccount(0);
        Account checking = new CheckingAccount(3000);

        System.out.println("Сберегательный: " + savings.getBalance());
        System.out.println("Кредитный: " + credit.getBalance());
        System.out.println("Расчетный: " + checking.getBalance());

        savings.pay(100);
        checking.pay(500);
        credit.pay(2000);

        checking.transfer(savings, 700);
        savings.transfer(checking, 1000);

        credit.addMoney(500);
        credit.addMoney(2000);

        System.out.println("Сберегательный: " + savings.getBalance());
        System.out.println("Кредитный: " + credit.getBalance());
        System.out.println("Расчетный: " + checking.getBalance());
    }
}

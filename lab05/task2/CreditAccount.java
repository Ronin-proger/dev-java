public class CreditAccount extends Account {

    public CreditAccount(int balance) {
        super(balance);
    }

    public void pay(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма платежа должна быть больше 0");
            return;
        }
        balance -= amount;
        System.out.println("Оплата с кредитного счета: " + amount
                + ", баланс: " + balance);
    }

    public void transfer(Account account, int amount) {
        if (amount <= 0) {
            System.out.println("Сумма перевода должна быть больше 0");
            return;
        }
        balance -= amount;
        account.addMoney(amount);
        System.out.println("Перевод с кредитного счета: " + amount
                + ", баланс: " + balance);
    }

    public void addMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма пополнения должна быть больше 0");
            return;
        }
        if (balance + amount > 0) {
            System.out.println("Кредитный счет не может уходить в плюс");
            return;
        }
        balance += amount;
        System.out.println("Кредитный счет пополнен на " + amount
                + ", баланс: " + balance);
    }
}

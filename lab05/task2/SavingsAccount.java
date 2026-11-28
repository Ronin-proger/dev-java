public class SavingsAccount extends Account {

    public SavingsAccount(int balance) {
        super(balance);
    }

    public void pay(int amount) {
        System.out.println("Со сберегательного счета нельзя платить");
    }

    public void transfer(Account account, int amount) {
        if (amount <= 0) {
            System.out.println("Сумма перевода должна быть больше 0");
            return;
        }
        if (balance < amount) {
            System.out.println("Недостаточно средств на сберегательном счете");
            return;
        }
        balance -= amount;
        account.addMoney(amount);
        System.out.println("Перевод со сберегательного счета: " + amount);
    }

    public void addMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма пополнения должна быть больше 0");
            return;
        }
        balance += amount;
        System.out.println("Сберегательный счет пополнен на " + amount);
    }
}

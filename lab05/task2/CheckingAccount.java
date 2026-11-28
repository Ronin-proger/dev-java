public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    public void pay(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма платежа должна быть больше 0");
            return;
        }
        if (balance < amount) {
            System.out.println("Недостаточно средств на расчетном счете");
            return;
        }
        balance -= amount;
        System.out.println("Оплата с расчетного счета: " + amount);
    }

    public void transfer(Account account, int amount) {
        if (amount <= 0) {
            System.out.println("Сумма перевода должна быть больше 0");
            return;
        }
        if (balance < amount) {
            System.out.println("Недостаточно средств на расчетном счете");
            return;
        }
        balance -= amount;
        account.addMoney(amount);
        System.out.println("Перевод с расчетного счета: " + amount);
    }

    public void addMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма пополнения должна быть больше 0");
            return;
        }
        balance += amount;
        System.out.println("Расчетный счет пополнен на " + amount);
    }
}

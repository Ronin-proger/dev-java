import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income = 0;
        int expense = 0;

        while (true) {
            printMenu();
            String choice = scanner.nextLine().trim();

            if (choice.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            }

            if (choice.equals("1")) {
                System.out.println("Введите сумму дохода:");
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value < 0) {
                    System.out.println("Сумма не может быть отрицательной");
                    continue;
                }
                income += value;
            } else if (choice.equals("2")) {
                System.out.println("Введите сумму расхода:");
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value < 0) {
                    System.out.println("Сумма не может быть отрицательной");
                    continue;
                }
                expense += value;
            } else if (choice.equals("3")) {
                chooseTaxSystem(income, expense);
            } else {
                System.out.println("Неизвестная операция");
            }
        }

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("Выберите операцию и введите её номер:");
        System.out.println("1. Добавить новый доход");
        System.out.println("2. Добавить новый расход");
        System.out.println("3. Выбрать систему налогообложения");
    }

    public static double calcUsnIncome(int income) {
        return income * 0.06;
    }

    public static double calcUsnIncomeMinusExpense(int income, int expense) {
        int base = income - expense;
        if (base < 0) {
            base = 0;
        }
        return base * 0.15;
    }

    public static void chooseTaxSystem(int income, int expense) {
        double taxIncome = calcUsnIncome(income);
        double taxOther = calcUsnIncomeMinusExpense(income, expense);

        if (taxIncome <= taxOther) {
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + (int) taxIncome + " рублей");
            System.out.println("Налог по другой системе: " + (int) taxOther + " рублей");
            System.out.println("Экономия: " + (int) (taxOther - taxIncome) + " рублей");
        } else {
            System.out.println("Мы советуем вам УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + (int) taxOther + " рублей");
            System.out.println("Налог по другой системе: " + (int) taxIncome + " рублей");
            System.out.println("Экономия: " + (int) (taxIncome - taxOther) + " рублей");
        }
    }
}

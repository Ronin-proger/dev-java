import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Операции над double/float");
            System.out.println("1. Сравнить");
            System.out.println("2. Округлить");
            System.out.println("3. Отбросить дробную часть");

            String choice = scanner.nextLine().trim();
            if (choice.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            }

            if (choice.equals("1")) {
                compare(scanner);
            } else if (choice.equals("2")) {
                round(scanner);
            } else if (choice.equals("3")) {
                dropFraction(scanner);
            } else {
                System.out.println("Неизвестная операция");
            }
        }

        scanner.close();
    }

    public static void compare(Scanner scanner) {
        System.out.println("Введите первое число:");
        double first = scanner.nextDouble();
        System.out.println("Введите второе число:");
        float second = scanner.nextFloat();
        scanner.nextLine();

        double diff = first - second;
        if (diff < 0) {
            diff = -diff;
        }

        if (diff < 0.000001) {
            System.out.println("Результат: числа равны");
        } else if (first > second) {
            System.out.println("Результат: первое число больше");
        } else {
            System.out.println("Результат: второе число больше");
        }
    }

    public static void round(Scanner scanner) {
        System.out.println("Введите число:");
        double number = scanner.nextDouble();
        scanner.nextLine();

        long whole = (long) number;
        double fraction = number - whole;
        if (fraction >= 0.5) {
            whole++;
        } else if (fraction <= -0.5) {
            whole--;
        }

        System.out.println("Результат: " + whole);
    }

    public static void dropFraction(Scanner scanner) {
        System.out.println("Введите число:");
        double number = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Результат: " + (int) number);
    }
}

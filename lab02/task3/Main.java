import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
        int[] prices = {50, 14, 80};
        int[] counts = {0, 0, 0};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printProducts(products, prices);
            System.out.println("Выберите товар и количество или введите end");

            String line = scanner.nextLine().trim();
            if (line.equals("end")) {
                printBasket(products, prices, counts);
                break;
            }

            String[] parts = line.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Введите номер товара и количество через пробел");
                continue;
            }

            int productNum;
            int count;
            try {
                productNum = Integer.parseInt(parts[0]);
                count = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Нужно ввести числа");
                continue;
            }

            if (productNum < 1 || productNum > products.length) {
                System.out.println("Такого товара нет");
                continue;
            }
            if (count < 0) {
                System.out.println("Количество не может быть отрицательным");
                continue;
            }

            counts[productNum - 1] += count;
        }

        scanner.close();
    }

    public static void printProducts(String[] products, int[] prices) {
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
    }

    public static void printBasket(String[] products, int[] prices, int[] counts) {
        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара Количество Цена/за.ед Общая стоимость");

        int total = 0;
        for (int i = 0; i < products.length; i++) {
            if (counts[i] > 0) {
                int sum = counts[i] * prices[i];
                total += sum;
                System.out.println(products[i] + " " + counts[i] + " " + prices[i] + " " + sum);
            }
        }
        System.out.println("Итого " + total);
    }
}

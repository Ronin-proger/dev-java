import java.util.Date;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        System.out.println(getRoot(27, 3));
        System.out.println(getCakePieceArea(8, 16));
        System.out.println(getRandomNumber());
    }

    public static double getRoot(int num, int n) {
        double left = 0;
        double right = num;
        double mid = 0;

        for (int i = 0; i < 100; i++) {
            mid = (left + right) / 2;
            double value = 1;
            for (int j = 0; j < n; j++) {
                value = value * mid;
            }
            if (value < num) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return mid;
    }

    public static double getCakePieceArea(int peopleCount, double diameter) {
        double radius = diameter / 2;
        double area = PI * radius * radius;
        return area / peopleCount;
    }

    public static int getRandomNumber() {
        Date date = new Date();
        return (int) date.getTime();
    }
}

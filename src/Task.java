// Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
// 1.4, . . . , 2 кг конфет.

public class Task {

    public static void main(String[] args) {
        double price = 24.70;
        double[] result;
        double initialWeight = 1.2;

        result = getPrices(price);
        showPrices(result, initialWeight);
    }

    public static double[] getPrices(double price) {
        double[] prices = new double[5];
        int index = 0;
        for (double i = 1.2; i <= 2; i += 0.2) {
            prices[index] = price * i;
            index++;
        }
        return prices;
    }

    public static void showPrices(double[] prices, double initialWeight) {
        for (double val : prices) {
            System.out.printf("%.1fкг цукерок, коштує %.2fгрн.\n", initialWeight, val);
            initialWeight += 0.2;
        }
    }
}

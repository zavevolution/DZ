// Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
// 1.4, . . . , 2 кг конфет.

public class Task {
    public static void main(String[] args) {
        double price = 22.50;
        double[] result;
        double initialWeight = 1.2;

        result = getPrices(price);
        for (double val : result) {
            System.out.println(initialWeight + "кг. цукерок, коштує " + val + "грн.");
        }
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
}

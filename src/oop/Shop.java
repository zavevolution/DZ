package oop;

public class Shop {
    private double price;
    private double[] result;
    private double initialWeight;

    public Shop(double price) {
        this.price = price;
        initialWeight = 1.2;
        result = new double[5];
        getPrices();
    }

    private void getPrices() {
        int index = 0;
        for (double i = 1.2; i <= 2; i += 0.2) {
            result[index] = price * i;
            index++;
        }
    }

    public void show() {
        for (double val : result) {
            System.out.printf("%.1fкг. цукерок, коштує %.2fгрн.\n", initialWeight, val);
            initialWeight += 0.2;
        }
    }
}

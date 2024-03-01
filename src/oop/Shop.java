package oop;

public class Shop {
    private final double price;
    private final double[] result;
    private double initialWeight;

    public Shop(double price) {
        this.price = price;
        initialWeight = 1.2;
        result = new double[5];
        initPrices();
    }

    private void initPrices() {
        int index = 0;
        for (double i = 1.2; i <= 2; i += 0.2) {
            result[index] = price * i;
            index++;
        }
    }

    public void show() {
        for (double val : result) {
            System.out.printf("%.1fкг цукерок, коштує -> %.2fгрн.\n", initialWeight, val);
            initialWeight += 0.2;
        }
    }
}

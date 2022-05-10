package lesson_4;

import java.util.Arrays;

public class Payment {
    private Good[] goods;

    public class Buyer {
        public Payment buy(Good[] goods) {
            Payment payment = new Payment();

            return payment.setGoods(goods);
        }
    }


    public Good[] getGoods() {
        return goods;
    }

    public Payment setGoods(Good[] goods) {
        this.goods = goods;
        return this;
    }

    @Override
    public String toString() {
        return "Payment: " + '\'' + Arrays.toString(goods) + '\'';
    }
}
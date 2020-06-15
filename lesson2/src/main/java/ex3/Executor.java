package ex3;

import java.math.BigDecimal;

public class Executor {
    public static void main(String[] args) {
        Phone phone = new Phone(new BigDecimal(750), "Apple");
        System.out.println(phone);
        System.out.println("Price: " + phone.getPrice());
        System.out.println("Producer: " + phone.getProducer());
    }
}

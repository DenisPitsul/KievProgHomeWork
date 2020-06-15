package ex3;

import java.math.BigDecimal;
import java.util.Objects;

public class Phone {
    private BigDecimal price;
    private String producer;

    public Phone(BigDecimal price, String producer) {
        this.price = price;
        this.producer = producer;
    }

    public Phone() { }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price.equals(phone.price) &&
                producer.equals(phone.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, producer);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", producer='" + producer + '\'' +
                '}';
    }
}

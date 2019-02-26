package Test;

import java.math.BigDecimal;

public class Order {
    private String name;
    private BigDecimal cost;

    public Order(String name, BigDecimal cost)
    {
        this.name = name;
        this.cost = cost;
    }

    public BigDecimal getCost()
    {
        return this.cost;
    }
    public String getName()
    {
        return this.name;
    }
}

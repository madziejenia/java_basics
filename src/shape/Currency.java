package shape;

public enum Currency {
    USD(3.8),
    EUR(4.3),
    PLN(1.0),
    AUSTRIALIAN_DOLLAR (3.3);
    private double exchangeRate;


    Currency(double exchangeRate){
        this.exchangeRate = exchangeRate;


    }

    public double getExchangeRate(){
        return exchangeRate;
    }
}

package com.michaelmarcal.modernjavainaction.chapter5;

public class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    public Transaction( Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader(){
        return this.trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" + this.trader + ", " + "year: " + this.year + ", " + "value:" + this.value + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) o;
        boolean isTraderEquals = ( this.trader == null && other.trader == null )
                || ( this.trader != null && this.trader.equals(other.trader) );
        boolean isYearEquals = this.year == other.year;
        boolean isValueEquals = this.value == other.value;
        return isTraderEquals && isYearEquals && isTraderEquals;
    }

    @Override
    public final int hashCode() {
        int result = 17;
        if( trader != null ) {
            result = 31 * result + trader.hashCode();
        }
        result = 31 * result + year;
        result = 31 * result + value;
        return result;
    }
}

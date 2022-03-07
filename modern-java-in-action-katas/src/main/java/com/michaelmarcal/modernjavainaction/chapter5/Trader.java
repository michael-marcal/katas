package com.michaelmarcal.modernjavainaction.chapter5;

public class Trader {
    private final String name;
    private final String city;

    public Trader( String n, String c) {
        this.name = n;
        this.city = c;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public String toString(){
        return "Trader:" + this.name + " in " + this.city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Trader)) {
            return false;
        }
        Trader other = (Trader) o;
        boolean isNameEquals = ( this.name == null && other.name == null )
                || (this.name != null && this.name.equals(other.name));
        boolean isCityEquals = ( this.city == null && other.city == null )
                || (this.city != null && this.city.equals(other.city));
        return isNameEquals && isCityEquals;
    }

    @Override
    public final int hashCode() {
        int result = 17;
        if( name != null ){
            result = 31 * result + name.hashCode();
        }
        if( city != null ) {
            result = 31 * result + city.hashCode();
        }
        return result;
    }
}

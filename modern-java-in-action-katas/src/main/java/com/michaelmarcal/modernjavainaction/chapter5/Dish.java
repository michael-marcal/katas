package com.michaelmarcal.modernjavainaction.chapter5;

/**
 * Primary domain class for Kata.  It represents an unmutable dish from a restaurant.
 */
public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Dish ) ) {
            return false;
        }
        Dish other = (Dish) o;
        boolean isNameEquals = ( this.name == null && other.name == null )
                || (this.name != null && this.name.equals(other.name));
        boolean isVegetarianEquals = this.vegetarian == other.vegetarian;
        boolean isCaloriesEquals = this.calories == other.calories;
        boolean isTypeEquals = ( this.type == null && other.type == null )
                || (this.type != null && this.type.equals(other.type));
        return isNameEquals && isVegetarianEquals && isCaloriesEquals && isTypeEquals;
    }

    @Override
    public final int hashCode() {
        int result = 17;
        if (name != null){
            result = 31 * result + name.hashCode();
        }
        result = 31 * result + Boolean.hashCode(vegetarian);
        result = 31 * result + calories;
        if( type != null ) {
            result = 31 * result + type.hashCode();
        }
        return result;
    }

    public enum Type { MEAT, FISH, OTHER }
}

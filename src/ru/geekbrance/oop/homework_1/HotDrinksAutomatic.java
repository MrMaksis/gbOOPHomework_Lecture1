package ru.geekbrance.oop.homework_1;

public class HotDrinksAutomatic implements VendingMachine {

    @Override
    public HotDrink getProduct(String name, int scope, int temperature) {
        return new HotDrink(name, scope);
    }
}

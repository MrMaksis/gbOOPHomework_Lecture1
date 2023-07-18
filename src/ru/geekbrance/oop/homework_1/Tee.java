package ru.geekbrance.oop.homework_1;

public class Tee extends HotDrink{
    private int _temperature;
    public Tee(String name, int scope, int temperature) {
        super(name, scope);
        this._temperature = temperature;
    }
}

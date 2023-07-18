package ru.geekbrance.oop.homework_1;

public class Coffee extends HotDrink {
    private int _temperature;
    public Coffee(String name, int scope, int _temperature) {
        super(name, scope);
        this._temperature = _temperature;
    }
}

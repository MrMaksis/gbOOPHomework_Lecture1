package ru.geekbrance.oop.homework_1;

public interface VendingMachine {
    HotDrink getProduct(String name, int scope, int temperature);
}
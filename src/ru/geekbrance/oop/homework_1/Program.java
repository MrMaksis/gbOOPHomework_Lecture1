package ru.geekbrance.oop.homework_1;

public class Program {
    public static void main(String[] args) {

        Coffee cofe = new Coffee("Лате", 200, 30);
        Tee tee = new Tee("Черный", 250, 40);

        HotDrinksAutomatic automaton = new HotDrinksAutomatic();

        HotDrink product_1 = automaton.getProduct("Лате", 200, 30);
        HotDrink product_2 = automaton.getProduct("Зеленый", 250, 40);

        System.out.println("Продукт 1: " + product_1.getName() + ", объем: " + product_1.getScope() + "мл");
        System.out.println("Продукт 2: " + product_2.getName() + ", объем: " + product_2.getScope() + "мл");

    }
}

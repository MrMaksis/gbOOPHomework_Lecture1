package ru.geekbrance.oop.homework_1;

public class HotDrink {
    private final String _name;
    private final int _scope;

    public HotDrink(String name, int scope){
        _name = name;
        _scope = scope;
    }

    public String getName(){
        return _name;
    }

    public int getScope(){
        return _scope;
    }
}

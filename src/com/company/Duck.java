package com.company;

import com.company.interfaces.FlyBehavior;
import com.company.interfaces.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void swim();

    abstract void display();

    public void perfomQuack(){
        quackBehavior.quack();
    }

    public void perfomFly(){
        flyBehavior.fly();
    }
}

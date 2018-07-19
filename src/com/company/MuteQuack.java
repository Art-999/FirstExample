package com.company;

import com.company.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    /**
     * Quacks that makes no sound at all
     */
    @Override
    public void quack() {
        //do nothing-can't quack
    }
}

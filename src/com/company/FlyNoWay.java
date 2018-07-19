package com.company;

import com.company.interfaces.FlyAble;

public class FlyNoWay implements FlyAble {
    /**
     * Here is the implementation of all ducks that can't fly
     */
    @Override
    public void fly() {
        //do nothing-can't fly
    }
}

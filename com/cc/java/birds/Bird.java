package com.cc.java.birds;

import com.cc.java.interfaces.*;

public class Bird implements Flyable, IFeathers{

    @Override
    public String fly() {
        return "Birds fly" +","+ 
        "in every direction";
    }

    @Override
    public String hasfeathers() {
        return"I've a lot of feathers";
    }
    
}

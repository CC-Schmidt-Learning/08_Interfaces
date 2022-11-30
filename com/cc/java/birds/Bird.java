package com.cc.java.birds;

import com.cc.java.interfaces.*;

public class Bird implements Flyable, IFeathers, INest{
    @Override
    public String nes() {
        return "Ich habe ein Nest aus Ästen und Blättern";
    }
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

package com.cc.java.bees;

public class Worker extends HoneyBee{

    @Override
    public String nes() {
        return "Wir haben ein Nest aus Waben";
    }
   
    @Override
    public String doYourJob() {
        return "I'm a worker bee, I work all day!";
    }

    @Override
    public String fly() {
        return "I believe, I can fly  at 12mph!";
    }
 


}

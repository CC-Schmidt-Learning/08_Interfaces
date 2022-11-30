package com.cc.java.bees;
public class Queen extends HoneyBee{
    @Override
    public String nes() {
        return "Wir haben ein Nest aus Waben";
    }

    @Override
    public String doYourJob() {
        return "I'm a Queen, any questions?";
     }

     @Override
     public String fly() {
         return "I believe, I can fly at 10mph!";
     }
      
    
}

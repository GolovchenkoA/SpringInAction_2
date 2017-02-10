package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by головченко on 09.02.2017.
 */

@Component
public class Juggler implements Performer {
    private int beanBags = 3;
    public Juggler() {
    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void setBags(int beanBags){
        this.beanBags = beanBags;
    }
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

    public String performText(){
        return "JUGGLING " + beanBags + " BEANBAGS";
    }
}
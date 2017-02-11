package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by головченко on 11.02.2017.
 */
@Component
public class GraciousContestant implements Contestant {

    public void receiveAward() {
        System.out.println("Why, thank you all very much!");
    }
}
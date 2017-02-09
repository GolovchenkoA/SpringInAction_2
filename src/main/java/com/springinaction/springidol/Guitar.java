package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by головченко on 09.02.2017.
 */

@Component
public class Guitar implements Instrument {
    public void play() {
        System.out.println("Strum strum strum");
    }
}

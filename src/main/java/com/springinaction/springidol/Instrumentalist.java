package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by головченко on 09.02.2017.
 */

@Component
public class Instrumentalist implements Performer{

    @Autowired
    Instrument instrument;

    @Override
    public void perform() {
        instrument.play();
    }
}

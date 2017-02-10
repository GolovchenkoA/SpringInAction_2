package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by головченко on 10.02.2017.
 */
@Component
public class Volunteer implements Thinker {

    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}

package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by головченко on 10.02.2017.
 */
@Component
public class Magician implements MindReader {

    private String thoughts;

    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}

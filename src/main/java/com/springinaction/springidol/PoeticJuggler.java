package com.springinaction.springidol;

/**
 * Created by головченко on 09.02.2017.
 */
public class PoeticJuggler implements Performer {
    Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println();
        poem.recite();
    }
}

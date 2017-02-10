package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by головченко on 09.02.2017.
 */
@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }

    @Bean
    public Poem sonnet29() {
        return new Sonnet29();
    }


    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }

}

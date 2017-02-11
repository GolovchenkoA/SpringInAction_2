package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by головченко on 11.02.2017.
 */
@Aspect
public class Magician2 implements MindReader {
    private String thoughts;
    // Объявление параметризованного среза множества точек сопряжения
    @Pointcut("execution(* com.springinaction.springidol."
            + "Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
    }
    @Before("thinking(thoughts)") // Передача параметра в совет
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts : "
                + thoughts);
        this.thoughts = thoughts;
    }
    public String getThoughts() {
        return thoughts;
    }
}

package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by головченко on 11.02.2017.
 */
public class Audience2 {
    @Pointcut( // Определение среза
            "execution(* com.springinaction.springidol.Performer.perform(..))")
    public void performance2() {
    }
    @Before("performance2()")
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }
    @Before("performance2()") // Перед выступлением
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    @AfterReturning("performance2()") // После успешного выступления
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    @AfterThrowing("performance2()")
    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }

    @Around("performance2()")
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();
            joinpoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start)
                    + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}

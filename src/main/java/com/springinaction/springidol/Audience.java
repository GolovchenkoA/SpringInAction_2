package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by головченко on 10.02.2017.
 */
public class Audience {
    public void takeSeats() { //<co id="co_takeSeats"/>
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() { //<co id="co_turnOffCellPhones"/>
        System.out.println("The audience is turning off their cellphones");
    }

    public void applaud() { //<co id="co_applaud"/>
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() { //<co id="co_demandRefund"/>
        System.out.println("Boo! We want our money back!");
    }


    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis(); // Перед выступлением
            joinpoint.proceed(); // Вызов целевого метода
            long end = System.currentTimeMillis(); // После выступления
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start)
                    + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}

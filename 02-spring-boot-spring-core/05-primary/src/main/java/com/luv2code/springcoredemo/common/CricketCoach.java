package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // makes the class as a Spring bean make it available for dependency injection
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes";
    }
}

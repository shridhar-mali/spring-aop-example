package com.spring.aop.demoaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodAspect {

    @Before("execution(* com.spring.aop.demoaop.MyService.print(..))")
    public void logExecutionTime(JoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();

        for(Object obj : args) {
            System.out.println(obj);
        }

    }
}

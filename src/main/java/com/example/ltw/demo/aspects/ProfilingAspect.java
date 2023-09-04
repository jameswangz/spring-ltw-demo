package com.example.ltw.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class ProfilingAspect {

    private static Logger logger = LoggerFactory.getLogger(ProfilingAspect.class);

    @Around("methodsToBeProfiled()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch sw = new StopWatch(getClass().getSimpleName() + " -> " + pjp.getSignature().getDeclaringType().getName() + "." + pjp.getSignature().getName());
        try {
            sw.start(pjp.getSignature().getName());
            return pjp.proceed();
        } finally {
            sw.stop();
            if (logger.isDebugEnabled()) {
                logger.debug(sw.prettyPrint());
            }
        }
    }

    @Pointcut("execution(public * com.example.ltw..*.*(..))")
    public void methodsToBeProfiled(){}

}

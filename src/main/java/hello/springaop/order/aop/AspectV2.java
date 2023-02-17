package hello.springaop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 포인트 컷 분리
 */
@Slf4j
@Aspect
public class AspectV2 {

    @Pointcut("execution(* hello.springaop.order..*(..))")
    private void allOrder() {
    }

    @Around("allOrder()")
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("log {}", joinPoint.getSignature());
        return joinPoint.proceed();
    }
}

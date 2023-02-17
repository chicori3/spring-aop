package hello.springaop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 다양한 어드바이스
 */
@Slf4j
@Aspect
public class AspectV6Advice {

    @Before("hello.springaop.order.aop.Pointcuts.orderAndService()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("before {}", joinPoint.getSignature());
    }

    @AfterReturning(value = "hello.springaop.order.aop.Pointcuts.orderAndService()", returning = "result")
    public void doAfterReturning(JoinPoint joinPoint, Object result) {
        log.info("afterReturning {}", result);
    }

    @AfterThrowing(value = "hello.springaop.order.aop.Pointcuts.orderAndService()", throwing = "ex")
    public void doAfterThrowing(JoinPoint joinpoint, Exception ex) {
        log.info("afterThrowing {}", ex);
    }

    @After("hello.springaop.order.aop.Pointcuts.orderAndService()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("after {}", joinPoint.getSignature());
    }
}

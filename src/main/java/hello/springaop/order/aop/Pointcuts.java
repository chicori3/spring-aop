package hello.springaop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* hello.springaop.order..*(..))")
    public void allOrder() {
    }

    @Pointcut("execution(* *..*Service.*(..))")
    public void allServices() {
    }

    @Pointcut("allOrder() && allServices()")
    public void orderAndService() {
    }
}
